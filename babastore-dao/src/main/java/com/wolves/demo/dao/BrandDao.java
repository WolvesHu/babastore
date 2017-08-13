package com.wolves.demo.dao;

import java.util.List;

import com.wolves.demo.pojo.Brand;


/**
 * 品牌
 * @author lx
 *
 */
public interface BrandDao {
	//List集合
	public List<Brand> getBrandListWithPage(Brand brand);
	
	//查询总记录数
	public int getBrandCount(BrandDao brand);
	//添加品牌
	public void addBrand(Brand brand);
}
