package de.megacraft;

import de.megacraft.commands.ClientBrand;
import de.megacraft.event.ChatListener;
import de.megacraft.event.JoinListener;
import de.megacraft.event.LeaveListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class TabPrefixe extends JavaPlugin {
    private static TabPrefixe instance;
    private static final String PREFIX = "";

    @Override
    public void onEnable() {
        instance = this;
        registerCommands();
        registerListener();
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    private void registerCommands() {
        getCommand("brand").setExecutor(new ClientBrand());
    }

    private void registerListener() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
        pluginManager.registerEvents(new LeaveListener(), this);
        pluginManager.registerEvents(new ChatListener(), this);
    }

    public static TabPrefixe getInstance() {
        return instance;
    }
}
