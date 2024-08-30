package io.msdousti.mykafka;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SendUser implements ApplicationRunner {

    private final Producer producer;

    public SendUser(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run(ApplicationArguments args) {
        producer.sendMessage(new User("John", 40));
    }
}
