package de.megacraft.scoreboard;

import de.megacraft.util.Utilities;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.cacheddata.CachedMetaData;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class Teams {

    public static void set(Scoreboard scoreboard) {
        LuckPerms luckPerms = LuckPermsProvider.get();

        Bukkit.getOnlinePlayers().forEach(player -> {

           String group = luckPerms.getGroupManager().getGroup(luckPerms.getUserManager().getUser(player.getUniqueId()).getPrimaryGroup()).getName();

            String groupprefix = luckPerms.getGroupManager().getGroup(luckPerms.getUserManager().getUser(player.getUniqueId()).getPrimaryGroup()).getDisplayName();

            String weight = String.valueOf(luckPerms.getGroupManager().getGroup(group).getWeight());


            if (!(isTeamNameTaken(group, scoreboard))) {
                registerTeam(scoreboard, group, groupprefix, ChatColor.GRAY, player);
            }

           if(!scoreboard.getTeam(group).hasEntry(player.getName())){
               scoreboard.getTeam(group).addEntry(player.getName());
           }

        });
    }

    public static boolean isTeamNameTaken(String teamName, Scoreboard scoreboard) {
        for (Team team : scoreboard.getTeams()) {
            if (team.getName().equalsIgnoreCase(teamName)) {
                return true;
            }
        }
        return false;
    }


    private static void registerTeam(Scoreboard scoreboard, String name, String prefix, ChatColor chatColor, Player player) {
        LuckPerms luckPerms = LuckPermsProvider.get();
        Team team = scoreboard.registerNewTeam(name);
        String groupprefix = luckPerms.getGroupManager().getGroup(luckPerms.getUserManager().getUser(player.getUniqueId()).getPrimaryGroup()).getDisplayName();
        team.setPrefix(groupprefix + "§8 | §a");
        team.setColor(chatColor);
    }

}
