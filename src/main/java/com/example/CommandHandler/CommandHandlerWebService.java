package com.example.CommandHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandHandlerWebService {
	
	@Autowired
    private ApplicationContext context;
    
	@RequestMapping(value = "/", method=RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public int getPerson() {
		CommandHandlerGateway gateway = context.getBean(CommandHandlerGateway.class);
		Command command = new Command();
		command.setId(4);
		command.setName("essai");
		command.setTag("a tag");
		gateway.handle(command);
		return 1;
	}

}
