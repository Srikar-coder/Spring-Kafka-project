package com.springboot.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.springboot.producer.constants.AppConstants.TOPIC1;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic createTopic(){
        return TopicBuilder.name(TOPIC1)
                .build();
    }
}
