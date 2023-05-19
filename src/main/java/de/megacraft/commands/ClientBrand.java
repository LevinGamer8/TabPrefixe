package de.megacraft.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ClientBrand implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("Megacraft.cmd.brand")) {
                Player p2 = Bukkit.getPlayer(args[0]);
                sender.sendMessage(p2.getName() + " spielt mit " + p2.getClientBrandName());
            }
        }

        return false;
    }
}
