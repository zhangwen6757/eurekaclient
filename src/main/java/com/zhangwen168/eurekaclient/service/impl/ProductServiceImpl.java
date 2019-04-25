package com.zhangwen168.eurekaclient.service.impl;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.zhangwen168.eurekaclient.domain.Product;
import com.zhangwen168.eurekaclient.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @ClassName ProductServiceImpl
 * @Description TODO
 * @Author zhangwen
 * @Date 2019/4/16 10:24
 * @Company 北京国文互联教育科技集团有限公司
 **/
@Service
public class ProductServiceImpl implements ProductService {

    private static final Map<Integer, Product> daoMap = new HashMap<>();

    static {
        Product p1 = new Product(1, "iphonex", 9999.0, 10);
        Product p2 = new Product(2, "冰箱", 5342.0, 19);
        Product p3 = new Product(3, "洗衣机", 523.0, 90);
        Product p4 = new Product(4, "电话", 64345.0, 150);
        Product p5 = new Product(5, "汽车", 2345.0, 140);
        Product p6 = new Product(6, "椅子", 253.0, 20);
        Product p7 = new Product(7, "java编程思想", 2341.0, 10);

        daoMap.put(p1.getId(), p1);
        daoMap.put(p2.getId(), p2);
        daoMap.put(p3.getId(), p3);
        daoMap.put(p4.getId(), p4);
        daoMap.put(p5.getId(), p5);
        daoMap.put(p6.getId(), p6);
        daoMap.put(p7.getId(), p7);
    }

    @Override
    public List<Product> getList() {
        System.out.println("22222222");
        Collection<Product> collection = daoMap.values();
        List<Product> list = new ArrayList<>(collection);
        return list;
    }

    @Override
    public Product findProduce(Integer id) {
        return daoMap.get(id);
    }

    @Override
    public Product modify(Product product) {
        Product p = daoMap.get(Integer.valueOf(product.getId()).intValue());
        if (p != null) {
            daoMap.put(product.getId(), product);
        }
        return daoMap.get(product.getId());
    }

    @Override
    public List<Product> del(Integer id) {
        System.out.println(id);
        daoMap.remove(id);
        System.out.println(daoMap);
        return new ArrayList<>(daoMap.values());
    }

    @Override
    public List<Product> addOne(Product product) {
        daoMap.put(product.getId(), product);
        return new ArrayList<>(daoMap.values());
    }
}
