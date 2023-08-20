package org.walkplugin;

import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

public final class WalkPlugin extends JavaPlugin {


    @Override
    public void onEnable() {
        getCommand("yuru").setExecutor(new YuruCommand());
    }
    @Override
    public void onDisable() {

    }
}
