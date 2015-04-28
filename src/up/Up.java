
package up;

import java.util.logging.Logger;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;
import java.util.List;

public class Up extends JavaPlugin {

    public boolean onCommand(CommandSender sender, Command command,
                             String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("up")) {
            if (sender instanceof Player) {
                Player me = (Player)sender;
                List<Entity> list = me.getNearbyEntities(20,20,20);

                for (Entity target : list) {
                    //if (!(target instanceof Player)) {
                        //Location loc = target.getLocation();
                        //double y = loc.getY();
                        //loc.setY(y+50);
                        //target.teleport(loc);
                        //sender.sendMessage("Applying force to: "+target.getName());
                        Vector vel = new Vector(0,2,0);
                        target.setVelocity(vel);
                    //}
                }
                return true;
            }
        }
        return false;
    }
}
