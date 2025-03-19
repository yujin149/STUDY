package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;


//Save - 저장 및 수정 Delete-삭제 Count-총 개수 반환, findAll-모든 엔티티 조회
public interface ItemRepository extends JpaRepository<Item,Long>, QuerydslPredicateExecutor<Item> {
    // select * from item where itemNm = ?(String itemNm)
    //몇개가 올지 모르기 때문에 Item 으로 했음
    List<Item> findByItemNm(String itemNm);

    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);

    List<Item> findByPriceLessThan(Integer price);

    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);

    //native X
    //select * from Item where itemDetail like %itemDetail% order by price desc;
    //like 포함된다
    @Query("select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc")
    List<Item> findByItemDetail(@Param("itemDetail")String itemDetail);

    @Query(value = "select * from item i where i.item_Detail like %:itemDetail% order by i.price desc",nativeQuery = true)
    List<Item> findByItemDetailNative(@Param("itemDetail")String itemDetail);
}
