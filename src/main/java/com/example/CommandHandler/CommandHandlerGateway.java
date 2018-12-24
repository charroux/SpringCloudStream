package com.example.CommandHandler;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface CommandHandlerGateway {
	
	@Gateway(requestChannel="commandsChannel")
	void handle(Command command);

}
