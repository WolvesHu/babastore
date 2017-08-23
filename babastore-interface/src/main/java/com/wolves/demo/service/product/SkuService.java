package com.wolves.demo.service.product;

import java.util.List;

import com.wolves.demo.pojo.product.Sku;

public interface SkuService {
	
	//商品ID 查询 库存结果集
	public List<Sku> selectSkuListByProductId(Long productId);
	
	//修改
	public void updateSkuById(Sku sku);

}
