
## Sonar API

**Using the Sonar Anti Bot API**

1. Buy and download Sonar from BuiltByBit (MC-Market) [here](https://www.builtbybit.com/resources/23353/).
2. Add the `Sonar.jar` you've downloaded to your project libraries.
3. Register a BungeeCord event listener in your plugin:
    ```Java
    @Override
    public void onEnable() {
        // [...]
        ProxyServer.getPluginManager().registerListener(this, new YourListener());
        // [...]
    }
    ```

**You can use the following events as normal BungeeCord events:**

* SonarReloadEvent
    * `startTimeStamp` - Time stamp before the reload (`System.currentTimeMillis()`)
    * `endTimeStamp` - Time stamp after the reload (`System.currentTimeMillis()`)
    * `timeTaken` - Time taken (in milliseconds) for Sonar to reload all modules
* SonarPeakResetEvent
* SonarWebhookSentEvent
    * `webhookUrl` - URL of the webhook the alert has been sent to
* SonarCPSPeakChangedEvent
    * `connectionsPerSecondPeak` - Value of the new connections per second peak
* SonarIPSPeakChangedEvent
    * `ipsPerSecondPeak` - Value of the new ip addresses per second peak
* SonarBlacklistClearEvent

**Your class must implement the BungeeCord Listener**

```Java
import net.md_5.bungee.api.plugin.Listener;

public final class YourListener implements Listener {
    // [...]
}
```

**Example implementation**

```Java
@EventHandler
public void handle(final SonarReloadEvent event) {
    // [...]
}
```

## Compatibilities

**Tested:**
  * Waterfall (https://papermc.io/downloads#Waterfall)
  * FlameCord (https://github.com/2LStudios-MC/FlameCord)
  * HexaCord (https://github.com/HexagonMC/BungeeCord
  * BungeeCord (https://ci.md-5.net/job/BungeeCord/)

**Not tested:**
  * XCord (https://www.mc-market.org/resources/16843/)
  * Aegis (https://mc-protection.eu/products)

**Not compatible:**
  * Velocity (https://velocitypowered.com/) [Support soon]

_Last update: 17/09/22_

Unlisted server software is **most likely not supported**!

Please only use versions that provide support for Minecraft **1.19.1 or higher**.

ViaVersion and Geyser on BungeeCord are not supported and will cause issues!
