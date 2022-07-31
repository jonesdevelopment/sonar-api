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
