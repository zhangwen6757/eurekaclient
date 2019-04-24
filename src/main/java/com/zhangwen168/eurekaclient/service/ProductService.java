package com.zhangwen168.eurekaclient.service;

import com.zhangwen168.eurekaclient.domain.Product;

import java.util.List;

/**
 * @ClassName ProductService
 * @Description TODO
 * @Author zhangwen
 * @Date 2019/4/16 10:23
 * @Company 北京国文互联教育科技集团有限公司
 **/
public interface ProductService {
    List<Product> getList();

    Product findProduce(Integer id);

    Product modify(Product product);

    List<Product> del(Integer id);

    List<Product> addOne(Product product);
}
