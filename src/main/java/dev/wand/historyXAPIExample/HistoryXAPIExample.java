package dev.wand.historyXAPIExample;

import dev.wand.historyx.api.HistoryX;
import org.bukkit.plugin.java.JavaPlugin;

public final class HistoryXAPIExample extends JavaPlugin {

    /*
    You MUST set the extender in the onLoad method! Not in the onEnable method.
     */
    @Override
    public void onLoad() {
        HistoryX.getAPI().setExtender(new ExampleExtender());
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
