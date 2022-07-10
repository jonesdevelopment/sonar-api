package jones.sonarapi.command;

import jones.sonarapi.Example;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

/**
 * @author jones
 *
 * @version 0.2
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
