package com.server.dao.vo;

import org.slf4j.LoggerFactory;

import com.util.common.StringUtil;

/**
 * 封装服务器信息
 * */
public class Server {
	private int id;
	private String serverIP;
	private int gameServerPort;
	private int webServerPort;
	private String serverName;
	private String chatIP;
	private int gameChatPort;
	private int fire;//热门 1热 0不热
	private int status;//状态 0开 -1关
	private String redisIP;
	private int redisPort;
	private int coserverId;//合服后的主服务器id
	
	
	public Server() {
		// TODO Auto-generated constructor stub
	}

	public Server(int id, String serverIP, int gameServerPort, int webServerPort,
			String serverName, int fire, int status) {
		this.id = id;
		this.serverIP = serverIP;
		this.gameServerPort = gameServerPort;
		this.webServerPort = webServerPort;
		this.serverName = serverName;
		this.fire = fire;
		this.status = status;
	}

	public void resetRedis(String ip, int port){
		if(needCheckRedis()){
			if(StringUtil.isEmpty(this.redisIP) || !this.redisIP.equals(ip)){
				this.redisIP = ip;
			}
			if(this.redisPort == 0 || this.redisPort != port){
				this.redisPort = port;
			}
			LoggerFactory.getLogger(Server.class).info("更新 " + toString() + " Redis地址");
		}
	}
	
	public boolean needCheckRedis(){
		return StringUtil.isEmpty(redisIP) || redisPort <= 0;
	}

	public int getFire() {
		return fire;
	}


	public void setFire(int fire) {
		this.fire = fire;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getServerIP() {
		return serverIP;
	}

	public String getServerName() {
		return serverName;
	}


	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public int getGameServerPort() {
		return gameServerPort;
	}



	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}



	public void setGameServerPort(int gameServerPort) {
		this.gameServerPort = gameServerPort;
	}



	public int getWebServerPort() {
		return webServerPort;
	}



	public void setWebServerPort(int webServerPort) {
		this.webServerPort = webServerPort;
	}


	public String getRedisIP() {
		return redisIP;
	}

	public void setRedisIP(String redisIP) {
		this.redisIP = redisIP;
	}

	public int getRedisPort() {
		return redisPort;
	}

	public void setRedisPort(int redisPort) {
		this.redisPort = redisPort;
	}

	public String getChatIP() {
		return chatIP;
	}

	public void setChatIP(String chatIP) {
		this.chatIP = chatIP;
	}

	public int getGameChatPort() {
		return gameChatPort;
	}

	public void setGameChatPort(int gameChatPort) {
		this.gameChatPort = gameChatPort;
	}

	public int getCoserverId() {
		return coserverId;
	}

	public void setCoserverId(int coserverId) {
		this.coserverId = coserverId;
	}

	@Override
	public String toString() {
		return id + "-" + serverName;
	}
	
}
