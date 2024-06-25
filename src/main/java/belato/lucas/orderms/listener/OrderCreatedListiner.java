package belato.lucas.orderms.listener;

import belato.lucas.orderms.dto.OrderCreatedEvent;
import belato.lucas.orderms.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static belato.lucas.orderms.config.RabbitMqConfig.ORDER_CREATED_QUEUE;

@Component
public class OrderCreatedListiner {

    private final OrderService orderService;

    private final Logger logger = LoggerFactory.getLogger(OrderCreatedListiner.class);

    public OrderCreatedListiner(OrderService orderService) {
        this.orderService = orderService;
    }

    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message) {
        logger.info("Message consumed: {}", message);

        orderService.save(message.getPayload());
    }
}
