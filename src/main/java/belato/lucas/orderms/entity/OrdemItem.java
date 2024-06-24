package belato.lucas.orderms.entity;

import java.math.BigDecimal;

public class OrdemItem {
    public String product;
    private Integer quantity;
    private BigDecimal price;

    public OrdemItem() {
    }

    public OrdemItem(String product, Integer quantity, BigDecimal price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
