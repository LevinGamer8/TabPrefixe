package de.megacraft.event;


import de.megacraft.TabPrefixe;
import de.megacraft.scoreboard.Teams;
import de.megacraft.util.Utilities;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitTask;

public class JoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
        Teams.set(player.getScoreboard());
        BukkitTask bukkitTask = Bukkit.getScheduler().runTaskTimer(TabPrefixe.getInstance(), () -> Teams.set(player.getScoreboard()), 1, 10);
        Utilities.putInTeamSchedulers(player, bukkitTask);
    }

}