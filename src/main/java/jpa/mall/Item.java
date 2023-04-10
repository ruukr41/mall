package jpa.mall;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Item{


    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private long id;
    private String name;
    private int price;
    private int stock;

}
