package com.ginurban.OOP_SocialNetworks;

public class Message {

	private Client recipient;
	private SocialNetwork network;
	private String content;
	private Client sender;
	
	
	public Message(Client sender, Client recipient, SocialNetwork network, String content) {
		this.recipient = recipient;
		this.network = network;
		this.content = content;
		this.sender = sender;
	}


	public Client getRecipient() {
		return recipient;
	}
	
	public Client getSender() {
		return sender;
	}


	public SocialNetwork getNetwork() {
		return network;
	}


	public String getContent() {
		return content;
	}
	
	public void printMessage() {
		System.out.println(this.getNetwork().getNetworkName() + " " + this.getSender().getLoginName() +
				" to " + this.getRecipient().getLoginName() + ": " + this.getContent());
	}
	
	
	
}
