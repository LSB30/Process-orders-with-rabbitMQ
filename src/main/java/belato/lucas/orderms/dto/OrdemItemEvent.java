package belato.lucas.orderms.dto;

import java.math.BigDecimal;

public record OrdemItemEvent(String produto, Integer quantidade, BigDecimal preco) {
}
