package main.java.com.meggawatts.NoIce;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;

public class NoIceBlockListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onBlockForm(BlockFormEvent event) {
        if (event.isCancelled()) {
            return;
        }
        if (event.getNewState().getType().equals(Material.ICE)) {
            event.setCancelled(true);
            return;
        }
    }
}
