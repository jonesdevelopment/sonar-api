package jones.sonarapi;

import jones.sonarapi.listener.SonarListener;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class TestAPI extends Plugin {

    @Override
    public void onEnable() {

        /*
         * Register our listener
         */

        ProxyServer.getInstance().getPluginManager().registerListener(this, new SonarListener());
    }
}
