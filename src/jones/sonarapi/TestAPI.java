package jones.sonarapi;

import jones.sonarapi.command.ExampleCommand;
import jones.sonarapi.listener.SonarListener;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;

/**
 * @author jones
 *
 * @version 0.2
 */

public final class TestAPI extends Plugin {

    public static long lastCpsPeak, lastIpsPeak;

    @Override
    public void onEnable() {

        /*
         * Register our listener
         */

        final PluginManager pluginManager = ProxyServer.getInstance().getPluginManager();

        pluginManager.registerCommand(this, new ExampleCommand());

        pluginManager.registerListener(this, new SonarListener());
    }
}
