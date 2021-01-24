package com.twentyonec.TopKills;

import java.util.UUID;

public class TopUser {

	UUID uuid;
	int kills;

	public TopUser(UUID uuid, int kills) {
		this.uuid = uuid;
		this.kills = kills;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}



}
