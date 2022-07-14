package jones.sonarapi.listener;

import jones.sonar.api.event.impl.*;
import jones.sonarapi.Example;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

/**
 * @author jones
 *
 * @version 0.3
 */

public final class ExampleListener implements Listener {

    /**
     *
     * @param sonarReloadEvent - Getting called whenever the plugin reloads
     */

    @EventHandler
    public void handle(final SonarReloadEvent sonarReloadEvent) {
        log("Sonar reloaded in " + sonarReloadEvent.getTimeTaken() + " milliseconds. (Timestamp: " + sonarReloadEvent.getTimeStamp() + ")");
    }

    /**
     *
     * @param sonarPeakResetEvent - Getting called whenever an attack is over
     */

    @EventHandler
    public void handle(final SonarPeakResetEvent sonarPeakResetEvent) {
        log("Peak reset");
    }

    /**
     *
     * @param sonarWebhookSentEvent - Getting called whenever a webhook is getting sent to discord
     */

    @EventHandler
    public void handle(final SonarWebhookSentEvent sonarWebhookSentEvent) {
        log("Send webhook to " + sonarWebhookSentEvent.getWebhookUrl());
    }

    /**
     *
     * @param sonarCPSPeakChangedEvent - Getting called whenever the connections per second peak changes
     */

    @EventHandler
    public void handle(final SonarCPSPeakChangedEvent sonarCPSPeakChangedEvent) {
        log("New connections per second peak: " + sonarCPSPeakChangedEvent.getConnectionsPerSecondPeak());

        Example.lastCpsPeak = sonarCPSPeakChangedEvent.getConnectionsPerSecondPeak();
    }

    /**
     *
     * @param sonarIPSPeakChangedEvent - Getting called whenever the ips per second peak changes
     */

    @EventHandler
    public void handle(final SonarIPSPeakChangedEvent sonarIPSPeakChangedEvent) {
        log("New ips per second peak: " + sonarIPSPeakChangedEvent.getIpsPerSecondPeak());

        Example.lastCpsPeak = sonarIPSPeakChangedEvent.getIpsPerSecondPeak();
    }

    /**
     *
     * @param blacklistClearEvent - Getting called whenever the blacklist clears
     */

    @EventHandler
    public void handle(final SonarBlacklistClearEvent blacklistClearEvent) {
        log("Blacklist cleared");
    }

    /**
     * Logs a string to the console
     *
     * @param toLog - Message that is getting logged to the console
     */

    private void log(final String toLog) {
        ProxyServer.getInstance().getLogger().info("[Sonar API] " + toLog);
    }
}
