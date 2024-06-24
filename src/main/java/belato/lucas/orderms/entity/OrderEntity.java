package belato.lucas.orderms.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.util.List;

@Document(collation = "tb_orders")
public class OrderEntity {

    @MongoId
    private Long orderId;

    private Long customerId;


    private BigDecimal total;

    private List<OrdemItem> items;

    public OrderEntity() {
    }

    public OrderEntity(Long orderId, Long customerId, BigDecimal total, List<OrdemItem> items) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.total = total;
        this.items = items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<OrdemItem> getItems() {
        return items;
    }

    public void setItems(List<OrdemItem> items) {
        this.items = items;
    }
}
