package jones.sonar.api.event.impl;

import jones.sonar.api.event.EventAPI;
import net.md_5.bungee.api.plugin.Event;

public final class SonarReloadEvent extends Event implements EventAPI {

    private final long timeStamp, timeTaken;

    /* initialization */
    public SonarReloadEvent(final long timeStamp, final long timeTaken) {
        this.timeStamp = timeStamp;
        this.timeTaken = timeTaken;
    }

    /* getters */
    public long getTimeStamp() {
        return timeStamp;
    }
    public long getTimeTaken() {
        return timeTaken;
    }

}
