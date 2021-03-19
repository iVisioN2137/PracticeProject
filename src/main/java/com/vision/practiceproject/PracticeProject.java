package com.vision.practiceproject;

import com.vision.practiceproject.commands.KitCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class PracticeProject extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("kit").setExecutor(new KitCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
