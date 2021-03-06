package com.zhangwen168.eurekaclient.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.geom.RoundRectangle2D;
import java.io.Serializable;

/**
 * @ClassName Product
 * @Description TODO
 * @Author zhangwen
 * @Date 2019/4/16 10:24
 * @Company 北京国文互联教育科技集团有限公司
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 价格,分为单位
     */
    private Double price;

    /**
     * 库存
     */
    private Integer store;

}
