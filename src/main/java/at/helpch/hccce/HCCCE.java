package at.helpch.hccce;

import org.bukkit.plugin.java.JavaPlugin;

public final class HCCCE extends JavaPlugin {

    @Override
    public void onEnable() {
        SomethingKt.something();
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
