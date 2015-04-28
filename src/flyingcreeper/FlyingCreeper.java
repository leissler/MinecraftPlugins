package flyingcreeper;

import java.util.logging.Logger;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Player;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FlyingCreeper extends JavaPlugin {
    public static Logger log = Logger.getLogger("Minecraft");

    public boolean onCommand(CommandSender sender, Command command,
                             String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("flyingcreeper")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                Location loc = player.getLocation();
                loc.setY(loc.getY() + 5);
                Bat bat = player.getWorld().spawn(loc, Bat.class);
                Creeper creeper = player.getWorld().spawn(loc, Creeper.class);
                bat.setPassenger(creeper);
                PotionEffect potion = new PotionEffect(
                        PotionEffectType.INVISIBILITY,
                        Integer.MAX_VALUE,
                        1);
                bat.addPotionEffect(potion);
                return true;
            }
        }
        return false;
    }
}

