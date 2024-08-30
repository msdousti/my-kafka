package io.msdousti.mykafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
class Application {

    @Bean
    NewTopic usersTopic() {
        return new NewTopic("users.v1", 12, (short) 1);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
