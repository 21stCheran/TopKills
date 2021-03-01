package com.twentyonec.TopKills;

import org.bukkit.plugin.java.JavaPlugin;

import com.twentyonec.TopKills.Storage.Storage;
import com.twentyonec.TopKills.Utils.Config;

public class TopKills extends JavaPlugin {
	
	TopKills plugin;
	Storage storage;
	Config config;
	
	@Override
	public void onEnable() {
		plugin = this;
		this.config = new Config(this.getConfig());
		this.storage = config.getStorage();
	}
}
