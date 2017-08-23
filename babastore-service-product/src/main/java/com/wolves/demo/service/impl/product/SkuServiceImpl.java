package com.wolves.demo.service.impl.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wolves.demo.dao.product.SkuDao;
import com.wolves.demo.pojo.product.Sku;
import com.wolves.demo.pojo.product.SkuQuery;
import com.wolves.demo.service.product.SkuService;

/**
 * 库存管理
 * 
 * @author lx
 *
 */
@Service("skuService")
@Transactional
public class SkuServiceImpl implements SkuService{

	
	@Autowired
	private SkuDao skuDao;
//	@Autowired
//	private ColorDao colorDao;
	//商品ID 查询 库存结果集
	public List<Sku> selectSkuListByProductId(Long productId){
		SkuQuery skuQuery  = new SkuQuery();
		skuQuery.createCriteria().andProductIdEqualTo(productId);
		List<Sku> skus = skuDao.selectByExample(skuQuery);
		//15   
		for (Sku sku : skus) {
			// 3条Sql  一级缓存 
			sku.setColorId(sku.getColorId());
		}
		return skus;
	}
	//修改
	public void updateSkuById(Sku sku){
		skuDao.updateByPrimaryKeySelective(sku);
	}
}
