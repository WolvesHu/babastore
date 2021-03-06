package com.wolves.demo.dao.product;

import java.util.List;

import com.wolves.demo.pojo.product.Brand;
import com.wolves.demo.pojo.product.BrandQuery;

/**
 * 查询
 * @author lx
 *
 */
public interface BrandDao {

	
	//查询结果集
	public List<Brand> selectBrandListByQuery(BrandQuery brandQuery);
	//查询总条数
	public Integer selectCount(BrandQuery brandQuery);
	//通过ID查询品牌
	public Brand selectBrandById(Long id);
	
	//修改
	public void updateBrandById(Brand brand);
	
	//删除
	public void deletes(Long[] ids);// List<Long> ids
}
