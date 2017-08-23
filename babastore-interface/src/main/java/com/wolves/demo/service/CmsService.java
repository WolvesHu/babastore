package com.wolves.demo.service;

import java.util.List;

import com.wolves.demo.pojo.product.Product;
import com.wolves.demo.pojo.product.Sku;

public interface CmsService {
	
	
	//查询商品
	public Product selectProductById(Long productId);
	
	//查询Sku结果集 (包括颜色）  有货  
	public List<Sku> selectSkuListByProductId(Long productId);

}
