package com.wolves.demo.service.product;

import java.util.List;

import com.wolves.demo.pojo.BuyerCart;
import com.wolves.demo.pojo.product.Sku;

public interface SkuService {
	
	//商品ID 查询 库存结果集
	public List<Sku> selectSkuListByProductId(Long productId);
	
	//修改
	public void updateSkuById(Sku sku);
	
	//通过SKUID查询SKU对象
	public Sku selectSkuById(Long id);
	
	
	//保存商品到Redis中
	public void insertBuyerCartToRedis(BuyerCart buyerCart,String username);
	
	
	//取出购物车从Redis
	public BuyerCart selectBuyerCartFromRedis(String username);

}
