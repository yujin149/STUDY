package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name="item")
@Getter
@Setter
@ToString

public class Item {
    //어노테이션은 해당 변수 위에 써야함.


    @Id //기본키
    @Column(name="item_id") //컬럼명 item_id
    @GeneratedValue(strategy = GenerationType.AUTO) //기본키는 auto // 데이터 1씩증가
    private  Long id; //상품코드
    
    @Column(nullable = false,length = 50) //컬럼명 itemNm / null안됨 / 50자이내
    private  String itemNm; //상품명
    
    @Column(name="price", nullable = false) // null안됨
    private int price; //가격
    
    @Column(nullable = false) // null안됨
    private int stockNumber; //수량
    
    @Lob //큰 데이터일때, / 사진 넣고 문자넣고 하지만 사이사이 나오진 않음.
    @Column(nullable = false) // null안됨
    private String itemDetail; //상품상세설명
    
    @Enumerated(EnumType.STRING) //enum을 0과 1이 아니라 문자열로 나오게 하라는 뜻.
    private ItemSellStatus itemSellStatus; //상품판매상태
    
    //아무것도 안넣어도 컬럼은 생김
    private LocalDateTime regTime;//등록시간
    private LocalDateTime updateTime; //수정시간

}
