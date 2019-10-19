package com.ginurban.OOP_SocialNetworks;

import java.util.Arrays;

public class AndroidApp {

	private SocialNetwork[] networks = new SocialNetwork[3];
	private Client client;
	private Message[] clientMessages = new Message[0];
	private Message[] sentMessages = new Message[0];
	private Message[] newMessages = new Message[0];
	private int[] messageCounter = {0,0,0};

	public AndroidApp(SocialNetwork facebook, SocialNetwork twitter, SocialNetwork instagram) {

		this.networks[0] = facebook;
		this.networks[1] = twitter;
		this.networks[2] = instagram;
	}

	public void setClient(Client client) {
		this.client = client;
	}


	public void sendMessage(Message message) {
		for (int i = 0; i < networks.length; i++) {
			if (message.getNetwork().equals(networks[i])) {
				networks[i].sendMessage(message);
				sentMessages = storeMessage(message, sentMessages);
			}
		}
	}
	
	public Message[] getSentMessages() {
		return sentMessages;
	}
	
	public Message[] getAllMessages() {
		checkNewMessages();
		newMessages = new Message[0];
		return clientMessages;
	}
	
	public Message[] getNewMessages() {
		Message[] newMsg = checkNewMessages();
		newMessages = new Message[0];
		return newMsg;
	}
	
	private Message[] checkNewMessages() {

		Message[] allMessages = new Message[0];
		for (int i = 0; i < networks.length; i++) {
			
			allMessages = networks[i].getMessages();
			
			for (int j = messageCounter[i]; j < allMessages.length; j++) {

				if(allMessages[j].getSender().equals(this.client) || allMessages[j].getRecipient().equals(this.client)) {

					clientMessages = storeMessage(allMessages[j], clientMessages);
					newMessages = storeMessage(allMessages[j], newMessages);
					
				}
				messageCounter[i]++;
			}
		}
		return newMessages;
	}

	private Message[] storeMessage(Message message, Message[] array) {
		Message[] tempMessages = new Message[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			tempMessages[i] = array[i];
		}
		tempMessages[tempMessages.length - 1] = message;
		array = tempMessages;
		return array;
	}


	public SocialNetwork getNetwork(String networkName) {
		SocialNetwork network = null;

		if (networkName.toLowerCase().equals("facebook")) {
			network = networks[0];
		} else if (networkName.toLowerCase().equals("twitter")) {
			network = networks[1];
		} else if (networkName.toLowerCase().equals("instagram")) {
			network = networks[2];
		}
		return network;
	}

}
