
package helloworld; //(1)
import java.util.logging.Logger;//(2)
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
public class HelloWorld extends JavaPlugin { //(3)
    public static Logger log = Logger.getLogger("Minecraft");
    public void onLoad() {
        log.info("[HelloWorld] Loaded.");
    }
    public void onEnable() {
        log.info("[HelloWorld] Starting up.");
    }
    public void onDisable() {
        log.info("[HelloWorld] Stopping.");
    }
    public boolean onCommand(CommandSender sender, Command command,
                             String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("hello")) {
            String msg = "[Server] Da HELLO WORLD Plugin...";
            getServer().broadcastMessage(msg);
            return true;
        }
        return false;
    }
}


