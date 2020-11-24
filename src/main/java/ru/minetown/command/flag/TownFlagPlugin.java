package ru.minetown.command.flag;

import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;
import ru.minetown.command.flag.command.flag.executor.CommandFlagExecutor;

public class TownFlagPlugin extends JavaPlugin {

    private static final String FLAG_COMMAND = "flag";

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        PluginCommand pluginCommand = this.getCommand(FLAG_COMMAND);
        if (pluginCommand != null) {
            pluginCommand.setExecutor(new CommandFlagExecutor());
        }
    }
}
