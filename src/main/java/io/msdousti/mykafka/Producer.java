package io.msdousti.mykafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private final Logger logger = LoggerFactory.getLogger(Producer.class);
    private final KafkaTemplate<String, User> kafkaTemplate;

    public Producer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    void sendMessage(User user) {
        this.kafkaTemplate.send("users.v1", user.getName().toString(), user);
        logger.info(String.format("Produced user -> %s", user));
    }
}
