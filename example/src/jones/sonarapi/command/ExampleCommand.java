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
package jones.sonarapi.command;

import jones.sonarapi.Example;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

/**
 * @author jones
 *
 * @version 0.3
 */
public final class ExampleCommand extends Command {

    public ExampleCommand() {
        super("example-stats");
    }

    /*
     * Send the last connections per second peak and last ip addresses per second peak to the executor
     */

    @Override
    public void execute(final CommandSender commandSender, final String[] strings) {
        commandSender.sendMessage(new TextComponent("Last connections per second peak: " + Example.lastCpsPeak));
        commandSender.sendMessage(new TextComponent("Last ip addresses per second peak: " + Example.lastIpsPeak));
    }
}
