
package com.denniskupec.BukkitPlugin;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
	
	public static Plugin instance;
	public static Logger log;
	
	@Override
	public void onEnable() {
		Plugin.log = getLogger();
		this.saveConfig();
		Plugin.log.info("Bukkit base plugin loaded.");
	}
	
	public static Plugin getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		//not used
	}

}
