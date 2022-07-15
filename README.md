
## Sonar API

**Using the Sonar Anti Bot API**

1. Buy and download Sonar from MC-Market [here](https://www.mc-market.org/resources/23353/).
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
    * `timeStamp` - Time stamp of the reload (`System.currentTimeMillis()`)
    * `timeTaken` - Time taken (in milliseconds) for Sonar to reload all modules
* SonarPeakResetEvent
* SonarWebhookSentEvent
    * `webhookUrl` - URL of the webhook the alert has been sent to
* SonarCPSPeakChangedEvent
    * `connectionsPerSecondPeak` - Value of the new connections per second peak
* SonarIPSPeakChangedEvent
    * `ipsPerSecondPeak` - Value of the new ip addresses per second peak
* SonarBlacklistClearEvent

**Example implementation**

```Java
@EventHandler
public void handle(final SonarReloadEvent event) {
    // do stuff
}
```

## Wiki

Feel free to check out the wiki page if you're interested in learning more about Sonar.
> https://github.com/jonesdevelopment/sonar-api/wiki/

## TCPShield

* TCPShield support is currently in **beta stage**.

**Important**:

> If you are using TCPShield, you must remove the TCPShield/RealIP plugin from your server in order for Sonar to work properly.
> After you removed the TCPShield plugin, you need to enable the TCPShield mode in the 'tcpshield.yml'.
> You can find this configuration file in the Sonar folder, which will be created when you start your server.

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
  * Velocity (https://velocitypowered.com/)

_Last update: 16/07/22_

Unlisted server software is **most likely not supported**!

Please only use versions that provide support for Minecraft **1.19 or higher**.

ViaVersion and Geyser on BungeeCord are not supported and will cause issues!
