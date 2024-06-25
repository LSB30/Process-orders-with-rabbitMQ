package belato.lucas.orderms.repository;

import belato.lucas.orderms.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdemRepository extends MongoRepository<OrderEntity, Long> {
}
