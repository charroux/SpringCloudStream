package com.example.CommandHandler;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.GenericMessage;

@EnableBinding(Source.class)
public class CommandOutputStreamHandler {
	
	 @Transformer(inputChannel = "commandsChannel", outputChannel = Source.OUTPUT)
	 public GenericMessage<Command> transform(Command message) {
		 return new GenericMessage<Command>(message);
	 }

}
