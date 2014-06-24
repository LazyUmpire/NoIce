package main.java.com.meggawatts.NoIce;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class NoIce extends JavaPlugin {

    public static final Logger log = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new NoIceBlockListener(), this);
    }

    @Override
    public void onDisable() {
    }
}
