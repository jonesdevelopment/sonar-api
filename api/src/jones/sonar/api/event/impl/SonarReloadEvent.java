package jones.sonar.api.event.impl;

import jones.sonar.api.event.EventAPI;
import net.md_5.bungee.api.plugin.Event;

public final class SonarReloadEvent extends Event implements EventAPI {

    private final long startTimeStamp, endTimeStamp, timeTaken;

    /* initialization */
    public SonarReloadEvent(final long startTimeStamp, final long endTimeStamp, final long timeTaken) {
        this.startTimeStamp = startTimeStamp;
        this.endTimeStamp = endTimeStamp;
        this.timeTaken = timeTaken;
    }

    /* getters */
    public long getStartTimeStamp() {
        return startTimeStamp;
    }

    public long getEndTimeStamp() {
        return endTimeStamp;
    }

    public long getTimeTaken() {
        return timeTaken;
    }

}
