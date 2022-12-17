package com.bigdata.kafka.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.bigdata.kafka.dto.KMessage;

@Repository
public class KDataRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void saveKMessage(KMessage kafkaMessage) {
        mongoTemplate.save(kafkaMessage);
    }
}

