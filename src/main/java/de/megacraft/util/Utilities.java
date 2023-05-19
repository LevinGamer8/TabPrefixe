package de.megacraft.util;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class Utilities {

    public static String Ownerprefix = "§x§1§a§c§6§e§4O§x§1§4§c§b§d§9w§x§0§d§c§f§c§en§x§0§7§d§4§c§2e§x§0§0§d§8§b§7r §8| ";
    public static String Adminprefix = "§x§e§4§2§8§1§5A§x§d§7§2§3§1§3d§x§c§b§1§d§1§1m§x§b§e§1§8§0§fi§x§b§1§1§2§0§dn §8| ";
    public static String Moderatorprefix = "§x§e§4§3§e§0§1M§x§e§3§3§8§0§2o§x§e§3§3§3§0§3d§x§e§2§2§d§0§4e§x§e§2§2§7§0§6r§x§e§1§2§1§0§7a§x§e§0§1§c§0§8t§x§e§0§1§6§0§9o§x§d§f§1§0§0§ar §8| ";
    public static String Builderprefix = "§x§2§c§e§4§1§5B§x§2§a§d§7§1§9u§x§2§8§c§a§1§ci§x§2§7§b§d§2§0l§x§2§5§a§f§2§3d§x§2§3§a§2§2§7e§x§2§1§9§5§2§ar §8| ";
    public static String Supporterprefix = "§x§f§e§f§c§2§2S§x§d§2§d§0§2§eu§x§a§5§a§4§3§9p §8| ";
    public static String Tteamprefix = "§x§0§b§3§9§f§eT§x§1§1§3§6§f§1-§x§1§6§3§2§e§4T§x§1§c§2§f§d§8e§x§2§1§2§b§c§ba§x§2§7§2§8§b§em §8| ";
    public static String Premiumprefix = "§x§f§e§9§e§2§0P§x§f§2§9§b§2§2r§x§e§5§9§7§2§4e§x§d§9§9§4§2§6m§x§c§d§9§1§2§8i§x§c§0§8§d§2§au§x§b§4§8§a§2§cm §8| ";
    public static String Spielerprefix = "§x§1§d§f§e§1§fS§x§1§d§f§2§2§5p§x§1§d§e§5§2§bi§x§1§d§d§9§3§1e§x§1§c§c§d§3§6l§x§1§c§c§0§3§ce§x§1§c§b§4§4§2r §8| ";



    private static Map<Player, BukkitTask> teamSchedulers = new HashMap<>();

    public static void putInTeamSchedulers(Player player, BukkitTask bukkitTask) {
        teamSchedulers.put(player, bukkitTask);
    }

    public static Map<Player, BukkitTask> getTeamScheduler() {
        return teamSchedulers;
    }


}
