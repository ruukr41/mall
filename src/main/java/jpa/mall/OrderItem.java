package jpa.mall;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderItem{
    @Id
    @GeneratedValue
    @Column(name="order_item_id")
    private Long id;

    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "item_id")
    private Long itemId;

    private int orderPrice;
    private int count;

}
