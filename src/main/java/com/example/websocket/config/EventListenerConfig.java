package com.example.websocket.config;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequiredArgsConstructor
public class EventListenerConfig {

	@EventListener
	public void handleWebsocketDisconnetListener(SessionDisconnectEvent event)
	{
		
	}
	
}
