package dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderDetailsDTO {
    private String orderId;
    private String itemCode;
    private int qty;
    private double unitPrice;
}
