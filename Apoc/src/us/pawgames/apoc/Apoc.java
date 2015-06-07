//The main class for the PAWGames Apoc plugin.

package us.pawgames.apoc;

import java.io.File;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Apoc extends JavaPlugin {
	
	//access the config.yml
	File configFile = new File ("Apoc/config.yml");
	YamlConfiguration configYaml = YamlConfiguration.loadConfiguration(configFile);
	
	//When the plugin is enabled...
	@Override
	public void onEnable() {

		//Let the console know that the plugin is enabled
		getLogger().info("PAWGames Apoc plugin is Enabled");
	
	}
	
	//When the plugin is disabled...
	@Override
	public void onDisable() {
		
		//Let the console know that the plugin is disabled
		getLogger().info("PAWGames Apoc plugin is Enabled");
		
	}
	
}
