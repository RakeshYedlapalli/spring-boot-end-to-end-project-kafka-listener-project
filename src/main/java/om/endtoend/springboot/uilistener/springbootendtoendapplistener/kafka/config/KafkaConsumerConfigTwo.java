package om.endtoend.springboot.uilistener.springbootendtoendapplistener.kafka.config;//package com.endtoend.springboot.ui.springbootendtoendapp.kafka.config;
//
//import com.endtoend.springboot.ui.springbootendtoendapp.kafka.model.Animal;
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.support.serializer.JsonDeserializer;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Service
//public class KafkaConsumerConfigTwo {
//
//    public static final String GROUP_ID = "Group100";
//
//    @Bean
//    public ConsumerFactory<String, Animal> consumerFactory()
//    {
//        // Creating a map of string-object type
//        Map<String, Object> config = new HashMap<>();
//        // Adding the Configuration
//        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        config.put(ConsumerConfig.GROUP_ID_CONFIG, GROUP_ID);
//        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//        // Returning message in JSON format
//        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), new JsonDeserializer<>(Animal.class));
//    }
//
//    // Creating a Listener
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, Animal> animalListener()
//    {
//        ConcurrentKafkaListenerContainerFactory<String, Animal> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }
//}
