package jones.sonar.api.event.impl;

import jones.sonar.api.event.EventAPI;
import net.md_5.bungee.api.plugin.Event;

public final class SonarCPSPeakChangedEvent extends Event implements EventAPI {

    private final long connectionsPerSecondPeak;

    /* initialization */
    public SonarCPSPeakChangedEvent(final long connectionsPerSecondPeak) {
        this.connectionsPerSecondPeak = connectionsPerSecondPeak;
    }

    /* getter */
    public long getConnectionsPerSecondPeak() {
        return connectionsPerSecondPeak;
    }

}
