package jpa.mall;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
public class Order{
    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @OneToOne
    @JoinColumn(name="member_member_id")
    private Member member;

    public Member getMember(){
        return member;
    }

    @Column(name = "member_id")
    private String memberId;

    private LocalDateTime orderDate; //ORDER_DATE, order_date

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

}
