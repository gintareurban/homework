package com.ginurban.SocialNetworks_OOP;

public class Facebook implements SocialNetwork {
	
	private Message[] messageLog = new Message[0];
	private static final String NETWORK_NAME = "FACEBOOK";
	
	
	@Override
	public void sendMessage(Message message) { 
		Message[] newLog = new Message[messageLog.length + 1];
		for (int i = 0; i < messageLog.length; i++) {
			newLog[i] = messageLog[i];
		}
		newLog[newLog.length - 1] = message;
		messageLog = newLog;
	}
	

	@Override
	public Message[] getMessages() {
		return this.messageLog;
	}
	
	
	
	@Override
	public void printMsgLog() {
		for(Message message : messageLog) {
			message.printMessage();
		}
	}


	@Override
	public String getNetworkName() {
		return NETWORK_NAME;
	}

}
