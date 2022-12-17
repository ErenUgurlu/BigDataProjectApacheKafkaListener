package com.bigdata.kafka;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.bigdata.kafka.dao.KDataRepository;
import com.bigdata.kafka.dto.KMessage;

@Slf4j
@Service
public class KafkaListenerService {
	
	@Autowired
	KDataRepository dataRepository;
	
    @KafkaListener(
            topics = "${bigdata.kafka.topic}",
            groupId = "${bigdata.kafka.group.id}"
    )
    public void listen(@Payload KMessage message) {
        log.info("Message received.. MessageID : {} Message: {} Date : {}",
                message.getId(),
                message.getMessage(),
                message.getMessageDate());
        try {
        	dataRepository.saveKMessage(message);
            log.info("Message is saved to database. MessageID : {}",
                    message.getId());
		} catch (Exception e) {
	        log.error("An Error Accured while save message to database. Error Message: {}",
	                e.getMessage());
		}
    }
}
