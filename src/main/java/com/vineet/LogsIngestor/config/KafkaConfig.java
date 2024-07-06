package com.vineet.LogsIngestor.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.vineet.LogsIngestor.constants.Constants.TOPIC_NAME;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(TOPIC_NAME)
                .build();

    }
}
