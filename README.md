This is an example BungeeCord plugin using the api.

# How to use

Add the Sonar.jar to your project libaries and you are finished.
> You can find Sonar on MC-Market (https://www.mc-market.org/resources/23353/)

# Events

You can use the following events as normal BungeeCord events:

- SonarReloadEvent
- SonarPeakResetEvent
- SonarWebhookSentEvent
- SonarCPSPeakChangedEvent
- SonarIPSPeakChangedEvent
- SonarBlacklistClearEvent

## Example event

```Java
@EventHandler
public void handle(final SonarReloadEvent event) {
    // do stuff
}
```

## Compatibilities

> Tested:
  * Waterfall (https://papermc.io/downloads#Waterfall)
  * FlameCord (https://github.com/2LStudios-MC/FlameCord)
  * HexaCord (https://github.com/HexagonMC/BungeeCord
  * BungeeCord (https://ci.md-5.net/job/BungeeCord/)

> Not tested:
  * XCord (https://www.mc-market.org/resources/16843/)
  * Aegis (https://mc-protection.eu/products)

> Not compatible:
  * Velocity (https://velocitypowered.com/)

_Last update: 06/13/22_

Unlisted server software is **most likely not supported**!

Please only use versions that provide support for Minecraft **1.19 or higher**.
