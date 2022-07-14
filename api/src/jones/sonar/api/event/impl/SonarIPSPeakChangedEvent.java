package jones.sonar.api.event.impl;

import jones.sonar.api.event.EventAPI;
import net.md_5.bungee.api.plugin.Event;

public final class SonarIPSPeakChangedEvent extends Event implements EventAPI {

    private final long ipsPerSecondPeak;

    /* initialization */
    public SonarIPSPeakChangedEvent(final long ipsPerSecondPeak) {
        this.ipsPerSecondPeak = ipsPerSecondPeak;
    }

    /* getter */
    public long getIpsPerSecondPeak() {
        return ipsPerSecondPeak;
    }

}
