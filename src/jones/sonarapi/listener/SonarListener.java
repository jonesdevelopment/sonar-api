package jones.sonarapi.listener;

import jones.sonar.api.event.impl.*;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class SonarListener implements Listener {

    /**
     *
     * @param sonarReloadEvent - Getting called whenever the plugin reloads
     */

    @EventHandler
    public void handle(final SonarReloadEvent sonarReloadEvent) {
        log("[Sonar API] Sonar reloaded");
    }

    /**
     *
     * @param sonarPeakResetEvent - Getting called whenever an attack is over
     */

    @EventHandler
    public void handle(final SonarPeakResetEvent sonarPeakResetEvent) {
        log("[Sonar API] Peak reset");
    }

    /**
     *
     * @param sonarWebhookSentEvent - Getting called whenever a webhook is getting sent to discord
     */

    @EventHandler
    public void handle(final SonarWebhookSentEvent sonarWebhookSentEvent) {
        log("[Sonar API] Send webhook to " + sonarWebhookSentEvent.getWebhookUrl());
    }

    /**
     *
     * @param sonarCPSPeakChangedEvent - Getting called whenever the connections per second peak changes
     */

    @EventHandler
    public void handle(final SonarCPSPeakChangedEvent sonarCPSPeakChangedEvent) {
        log("[Sonar API] New connections per second peak: " + sonarCPSPeakChangedEvent.getConnectionsPerSecondPeak());
    }

    /**
     *
     * @param sonarIPSPeakChangedEvent - Getting called whenever the ips per second peak changes
     */

    @EventHandler
    public void handle(final SonarIPSPeakChangedEvent sonarIPSPeakChangedEvent) {
        log("[Sonar API] New ips per second peak: " + sonarIPSPeakChangedEvent.getIpsPerSecondPeak());
    }

    /**
     *
     * @param blacklistClearEvent - Getting called whenever the blacklist clears
     */

    @EventHandler
    public void handle(final SonarBlacklistClearEvent blacklistClearEvent) {
        log("[Sonar API] Blacklist cleared");
    }

    /**
     * Logs a string to the console
     *
     * @param toLog - Message that is getting logged to the console
     */

    protected void log(final String toLog) {
        ProxyServer.getInstance().getLogger().info(toLog);
    }
}
