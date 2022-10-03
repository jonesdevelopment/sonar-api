# :wrench: Sonar Antibot API
### This github repository is for issues and the Sonar Antibot API

## Using the API

* Download the `Sonar.jar` from [BuiltByBit](https://builtbybit.com/resources/23353).
* Once that is finished, load the `Sonar.jar` as a project library in your IDE.
* You're finished. Now you can use the Sonar Antibot API.

## API functions and features

### ⚡ Events
* jones.sonar.api.event.bungee.**SonarAttackDetectedEvent** **›** *Called when Sonar detected a bot attack*
    * **getConnectionsPerSecond()** **-** *Returns the number of connections per second*
    * **getIpAddressesPerSecond()** **-** *Returns the number of ip addresses per second*
    * **getLoginsPerSecond()** **-** *Returns the number of login/joins per second*
    * **getPingsPerSecond()** **-** *Returns the number of server list pings per second*
    * **getEncryptionsPerSecond()** **-** *Returns the number of encryptions (premium players) per second*

* jones.sonar.api.event.bungee.**SonarBlacklistClearEvent** **›** *Called when the blacklist is being cleared*
    * **getBlacklistSize()** **-** *Returns the number of blacklisted ip addresses before the clear*

* jones.sonar.api.event.bungee.**SonarWhitelistClearEvent** **›** *Called when the whitelist is being cleared*
    * **getWhitelistSize()** **-** *Returns the number of whitelisted ip addresses before the clear*

* jones.sonar.api.event.bungee.**SonarPeakChangedEvent**    **›** *Called when the cps or ips peak changed*
    * **getPeakType()** **-** *Returns the type of the peak (can either be IP_ADDRESSES_PER_SECOND or CONNECTIONS_PER_SECOND)*
    * **getNewPeak()** **-** *Returns the number of the new peak of ip addresses per second or connections per second*

* jones.sonar.api.event.bungee.**SonarPeakResetEvent**      **›** *Called when the cps or ips peak is reset*
    * **getPeakType()** **-** *Returns the type of the peak (can either be IP_ADDRESSES_PER_SECOND or CONNECTIONS_PER_SECOND)*

* jones.sonar.api.event.bungee.**SonarReloadEvent**         **›** *Called when the plugin is being reloaded*
    * **getStartTimeStamp()** **-** *Returns the current time in milliseconds before the reload*
    * **getEndTimeStamp()** **-** *Returns the current time in milliseconds after the reload*
    * **getTimeTaken()** **-** *Returns the time (in milliseconds) Sonar took to reload*

* jones.sonar.api.event.bungee.**SonarWebhookSentEvent**    **›** *Called when Sonar sent a Discord Webhook*
    * **getWebhookUrl()** **-** *Returns the url of the Discord Webhook*

### :pencil2: General API functions

#### › Getting a players bot level
*The bot level is sort of a trust factor level Sonar uses to determine how it should handle players*

* jones.sonar.api.SonarAPI.getPlayerBotLevel(**InetAddress**)
* jones.sonar.api.SonarAPI.getPlayerBotLevel(**SocketAddress**)
* jones.sonar.api.SonarAPI.getPlayerBotLevel(**ProxiedPlayer**)

#### › Checking if a player is blacklisted

* jones.sonar.api.SonarAPI.isBlacklisted(**InetAddress**)
* jones.sonar.api.SonarAPI.isBlacklisted(**SocketAddress**)

#### › Checking if a player is whitelisted

* jones.sonar.api.SonarAPI.isWhitelisted(**InetAddress**)
* jones.sonar.api.SonarAPI.isWhitelisted(**SocketAddress**)
* jones.sonar.api.SonarAPI.isWhitelisted(**ProxiedPlayer**)

#### › Add a player to the blacklist

* jones.sonar.api.SonarAPI.addToBlacklist(**InetAddress**)
* jones.sonar.api.SonarAPI.addToBlacklist(**SocketAddress**)

#### › Add a player to the whitelist

* jones.sonar.api.SonarAPI.addToWhitelist(**InetAddress**)
* jones.sonar.api.SonarAPI.addToWhitelist(**SocketAddress**)

#### › Get list of blacklisted ip addresses

* jones.sonar.api.SonarAPI.getBlacklistedIPAddresses()

#### › Get list of whitelisted ip addresses

* jones.sonar.api.SonarAPI.getWhitelistedIPAddresses()

#### › Check if the server is currently under attack

* jones.sonar.api.SonarAPI.isUnderAttack()
