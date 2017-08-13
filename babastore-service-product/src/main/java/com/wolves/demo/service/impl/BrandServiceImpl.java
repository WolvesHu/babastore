package com.wolves.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wolves.demo.dao.BrandDao;
import com.wolves.demo.pojo.Brand;
import com.wolves.demo.service.BrandService;


/**
 * 品牌事务
 * @author lx
 *
 */
@Service("brandService")
@Transactional
public class BrandServiceImpl implements BrandService{
	
	@Resource
	private BrandDao brandDao;

//	@Transactional(readOnly = true)
//	public Pagination getBrandListWithPage(Brand brand){
//		//1:起始页  startRow = (pageNo - 1)*pageSize
//		//2:每页数
//		//3:总记录数
//		Pagination  pagination = new Pagination(brand.getPageNo(),brand.getPageSize(),brandDao.getBrandCount(brand));
//		//Brand集合
//		pagination.setList(brandDao.getBrandListWithPage(brand));
//		
//		return pagination;
//	}

	@Override
	public void addBrand(Brand brand) {
		brandDao.addBrand(brand);
	}
}
