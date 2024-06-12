package br.com.kafka.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerBoraPraticar {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerBoraPraticar.class);

    @KafkaListener(topics = "${topic.bora-praticar}", groupId = "group_id")
    public void consumer(String message) {
        logger.info(String.format("#### -> Consumer message -> %s", message));
    }
}
