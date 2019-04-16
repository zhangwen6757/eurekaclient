package com.zhangwen168.eurekaclient.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Product
 * @Description TODO
 * @Author zhangwen
 * @Date 2019/4/16 10:24
 * @Company 北京国文互联教育科技集团有限公司
 **/
@Data
public class Product implements Serializable {
    private int id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 价格,分为单位
     */
    private int price;

    /**
     * 库存
     */
    private int store;

    public Product(int id, String name, int price, int store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }
}
