package com.loghot.chatutilsapi;

import org.bukkit.plugin.java.JavaPlugin;

public final class ChatutilsAPI extends JavaPlugin {
    public ChatutilsAPI() {
    }

    public void onEnable() {
        this.getLogger().info("Enabling the plugin");
        new Utility();
    }

    public void onDisable() {
        this.getLogger().info("Disabling the Plugin");
    }
}
