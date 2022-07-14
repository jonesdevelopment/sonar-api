package jones.sonar.api.event.impl;

import jones.sonar.api.event.EventAPI;
import net.md_5.bungee.api.plugin.Event;

public final class SonarWebhookSentEvent extends Event implements EventAPI {

    private final String webhookUrl;

    /* initialization */
    public SonarWebhookSentEvent(final String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    /* getters */
    public String getWebhookUrl() {
        return webhookUrl;
    }

}
