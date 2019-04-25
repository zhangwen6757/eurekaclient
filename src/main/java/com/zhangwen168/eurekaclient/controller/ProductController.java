package com.zhangwen168.eurekaclient.controller;

import com.netflix.discovery.converters.Auto;
import com.zhangwen168.eurekaclient.domain.Product;
import com.zhangwen168.eurekaclient.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("getList")
    public List<Product> getList() {
        System.out.println("111111111111111111111");
        return productService.getList();
    }

    @GetMapping("/findone")
    public Product findProduceRestful(Integer id) {
        return productService.findProduce(id);
    }

    @PutMapping("/mod")
    public Product modify(@RequestBody Product product) {
        return productService.modify(product);
    }

    @DeleteMapping("/del")
    public List<Product> delete (Integer id) {
        return productService.del(id);
    }

    @PostMapping("/addOne")
    public List<Product> addOne(@RequestBody Product product) {
        return productService.addOne(product);
    }

}
