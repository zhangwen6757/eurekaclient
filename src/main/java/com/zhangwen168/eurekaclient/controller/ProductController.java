package com.zhangwen168.eurekaclient.controller;

import com.netflix.discovery.converters.Auto;
import com.zhangwen168.eurekaclient.domain.Product;
import com.zhangwen168.eurekaclient.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author zhangwen
 * @Date 2019/4/16 10:22
 * @Company 北京国文互联教育科技集团有限公司
 **/
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("getList")
    public List<Product> getList() {
        return productService.getList();
    }

}
