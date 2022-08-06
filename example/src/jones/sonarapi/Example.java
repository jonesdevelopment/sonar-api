/*
 * Copyright (c) 2022 jones
 *
 * This file is part of sonar-api.
 *
 * sonar-api is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * sonar-api is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with sonar-api.  If not, see <https://www.gnu.org/licenses/>.
 */
package jones.sonarapi;

import jones.sonarapi.command.ExampleCommand;
import jones.sonarapi.listener.ExampleListener;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;

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
