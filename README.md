# ChatutilsAPI - Chat Utility Plugin API for Bukkit Plugins

How to include the API with Maven: 
```xml
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
```
```xml
    <dependency>
        <groupId>com.github.ItzLoghotXD</groupId>
        <artifactId>ChatutilsAPI</artifactId>
        <version>1.0</version>
        <scope>provided</scope>
    </dependency>
```

How to include the API with Gradle:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
    compileOnly "com.github.ItzLoghotXD:ChatutilsAPI:1.0"
}
```

## License
Copyright (C) 2023-2024 Loghot Gamerz <loghot.gamerz.official@gmail.com>

Chatutils is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Chatutils is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with Chatutils.  If not, see <http://www.gnu.org/licenses/>.

## Building
ChatutilsAPI comes with all libraries needed to build from the current branch.

## Implementing Chatutils
Install the plugin and put it into your plugins folder, you can install the plugin from [here](https://github.com/ItzLoghotXD/ChatutilsAPI/releases/latest).Implementing Chatutils is quite simple. It requires getting the Chat service from the Bukkit ServiceManager. See the example below:

```java
package com.example.plugin;

import com.loghot.chatutilsapi.Utility;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("hello").setExecutor(new HelloCommand());
    }

    public class HelloCommand implements CommandExecutor {

        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                Utility.broadcastMessage("Hello, " + player.getName() + "!");
                return true;
            } else {
                Utility.notPlayerError(sender);
                return false;
            }
        }
    }
}
```
