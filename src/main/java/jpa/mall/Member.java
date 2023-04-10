package jpa.mall;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Member{

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    @Column(length=10)
    private String name;
    private String city;

    private String street;
    private String zipcode;

}
