package jones.sonarapi;

import jones.sonarapi.command.ExampleCommand;
import jones.sonarapi.listener.ExampleListener;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;

/**
 * @author jones
 *
 * @version 0.3
 */

public final class Example extends Plugin {

    public static long lastCpsPeak, lastIpsPeak;

    @Override
    public void onEnable() {

        /*
         * Register our listener
         */

        final PluginManager pluginManager = ProxyServer.getInstance().getPluginManager();

        pluginManager.registerCommand(this, new ExampleCommand());

        pluginManager.registerListener(this, new ExampleListener());
    }
}
