package jpabok.jpashop.domain;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded                   // 내장타입 포함
    private Address address;

    @OneToMany(mappedBy =  "member")        // order table에 있는 member 필드에 의해 매핑, 나는 매핑된 거울일 뿐이다, fk 값이 변경되지 않음
    private List<Order> orders = new ArrayList<>();
}
