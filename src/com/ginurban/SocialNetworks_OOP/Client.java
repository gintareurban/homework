package com.ginurban.SocialNetworks_OOP;

public class Client {

	private String loginName;
	private AndroidApp app;

	public Client(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void startApp(AndroidApp app) {
		this.app = app;
		this.app.setClient(this);
	}

	public AndroidApp getApp() {
		return this.app;
	}

	public void writeMessage(Client recipient, String networkName, String content ) {

		Message message = new Message(this, recipient, this.app.getNetwork(networkName), content);
		this.app.sendMessage(message);
		
	}

	public void readAllMessages() {
		Message[] messages = this.app.getAllMessages();
		for(Message message : messages) {
			message.printMessage();
		}
	}

	public void readSentMessages() {
		Message[] messages = this.app.getSentMessages();
		for(Message message : messages) {
			message.printMessage();
		}
	}

	public void readNewMessages() {
		Message[] messages = this.app.getNewMessages();
		for(Message message : messages) {
			message.printMessage();
		}
	}
	

}
