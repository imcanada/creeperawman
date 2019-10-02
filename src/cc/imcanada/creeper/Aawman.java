package cc.imcanada.creeper;
 
import org.bukkit.command.Command;

import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public final class Aawman extends JavaPlugin implements Listener{
	String Prefix = ChatColor.DARK_GREEN+""+ChatColor.BOLD+"Creeper "+ChatColor.DARK_GRAY+"» ";
	
	public void onEnable() {
		getLogger().info("Creeper-aw-man has been enabled.");
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable() {
		getLogger().info("Creeper-aw-man has been disabled.");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("creeper")) { 
			sender.sendMessage(Prefix+ChatColor.GREEN+"You are running creeper aw man version 1.0.0 (non slav edition) by imcanada.");
			return true;
		} 
		return false; 
	}
	
    @EventHandler(priority=EventPriority.HIGHEST)
    public void Heart(AsyncPlayerChatEvent event) throws InterruptedException
    {
    	String message = event.getMessage();
    	if (message.contains("creeper")) {
    		message = message.replace("creeper", "aaaaw man!");
    		event.setMessage(message);
    		getServer().broadcastMessage("<random player> creeper");
    	}
    }
}