package com.kafka.Kafka.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
@ComponentScan("com.kafka.Kafka")
public class JsonConfig {

    @Bean
    public ObjectMapper objectMapper() {
          final ObjectMapper objectMapper = new ObjectMapper();
          objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));
          objectMapper.registerModule(new JavaTimeModule());
          return objectMapper;
    }
}
