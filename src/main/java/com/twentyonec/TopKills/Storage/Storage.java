package com.twentyonec.TopKills.Storage;

import com.twentyonec.TopKills.TopUser;

public interface Storage {

	public void saveTopUser(TopUser topUser);
	public void getTopUser(TopUser topUser);
	public void updateTopUser(TopUser topUser);
	public void getLeaderboard();
	
}
