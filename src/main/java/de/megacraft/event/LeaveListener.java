package de.megacraft.event;

import de.megacraft.util.Utilities;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;


public class LeaveListener implements Listener {
    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        if (Utilities.getTeamScheduler().containsKey(player)) {
            Utilities.getTeamScheduler().get(player).cancel();
            Utilities.getTeamScheduler().remove(player);
        }
    }
}
