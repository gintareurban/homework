package com.ginurban.OOP_SocialNetworks;

public interface SocialNetwork {
	
	public Message[] getMessages();
	public void sendMessage(Message message);
	public void printMsgLog();
	public String getNetworkName();
	
}
