package com.example.websocket.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;


@Controller
public class chatController {

	@MessageMapping("/sendMessage")
	@SendTo("/topic/toAll")
	public Message sendMessage(@Payload Message message)
	{
		return message;
	}
	
	@MessageMapping("/addUser")
	@SendTo("/topic/toAll")
	public Message addUser(@Payload Message message, SimpMessageHeaderAccessor headerAccessor)
	{ 
		headerAccessor.getSessionAttributes().put("username", message.getSender());
		return message;
	}
	
	
}
