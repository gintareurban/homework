package com.ginurban.SocialNetworks_OOP;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client("Dave1990");
		Client client2 = new Client("Jim_0000");
		Client client3 = new Client("HomerFace");
		
		Facebook facebook = new Facebook();
		Twitter twitter = new Twitter();
		Instagram instagram = new Instagram();
		
		AndroidApp app1 = new AndroidApp(facebook, twitter, instagram);
		AndroidApp app2 = new AndroidApp(facebook, twitter, instagram);
		AndroidApp app3 = new AndroidApp(facebook, twitter, instagram);
		
		client1.startApp(app1);
		client2.startApp(app2);
		client3.startApp(app3);
		
		client1.writeMessage(client2, "Facebook", "Hello there");
		client2.writeMessage(client1, "Facebook", "What's up?");
		client1.writeMessage(client2, "facebook", "Not much, u?");
		
		client3.writeMessage(client2, "TWITTER", "labas");
		client2.writeMessage(client3, "twitter", "krabas");
		client1.writeMessage(client3, "Twitter", "...");
		
		client2.writeMessage(client1, "instagram", "???");
		
		
//		client1.readSentMessages();
//		client2.readSentMessages();
//		client3.readSentMessages();
		
//		client1.readAllMessages();
		client2.readAllMessages();
//		client3.readAllMessages();
		
		
		client3.writeMessage(client1, "FACEBOOK", "Hey there!");
		client2.writeMessage(client3, "Twitter", "All good");
		
		System.out.println("\nTest readNewMessages functionality");
		System.out.println("**********************************");
		
//		client1.readNewMessages();
		client2.readNewMessages();
//		client3.readNewMessages();
		
		System.out.println("**********************************");
		
//		client1.readAllMessages();
		client2.readAllMessages();
//		client3.readAllMessages();
		
		
		System.out.println("**********************************");
		twitter.printMsgLog();
		
		
		
		

	}

}
