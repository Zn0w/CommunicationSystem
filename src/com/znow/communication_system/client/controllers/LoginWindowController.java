package com.znow.communication_system.client.controllers;

import com.znow.communication_system.client.Client;
import com.znow.communication_system.client.gui.ClientWindow;

public class LoginWindowController {
	
	private ClientWindow window;
	private Client client;
	
	public LoginWindowController(ClientWindow window, Client client) {
		this.window = window;
		this.client = client;
	}
	
	public void onConnectButton(String login, String password) {
		client.logIn(login, password, window);
	}
	
}
