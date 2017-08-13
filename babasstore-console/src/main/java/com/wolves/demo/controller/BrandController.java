package com.wolves.demo.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolves.demo.pojo.Brand;
import com.wolves.demo.service.BrandService;


/**
 * 品牌
 * @author lx
 *
 */
@Controller
public class BrandController {

	
	@Autowired
	private BrandService brandService;
	
	//品牌列表页面
	@RequestMapping(value = "/brand/list.do")
	public String list(String name,Integer isDisplay,Integer pageNo,ModelMap model){
		
		//参数
		StringBuilder params = new StringBuilder();
		Brand brand = new Brand();
		//判断传进来的名称是否为Null并且还要判断 是否为空串   blank  ""  "   "   emtpy  ""   "  "
		if(StringUtils.isNotBlank(name)){
			brand.setName(name);
			params.append("name=").append(name);
		}
		//是  不是
		if(null != isDisplay){
			brand.setIsDisplay(isDisplay);
			params.append("&").append("isDisplay=").append(isDisplay);
		}else{
			brand.setIsDisplay(1);
			params.append("&").append("isDisplay=").append(1);
		}
		
		//如果页号为null 或小于1  置为1
		
		//页号
//		brand.setPageNo(Pagination.cpn(pageNo));
		
		//每页数
		brand.setPageSize(5);
		//分页对象
//		Pagination pagination = brandService.getBrandListWithPage(brand);
		
		//分页展示   /brand/list.do?name=瑜伽树（yogatree）&isDisplay=1&pageNo=2
		
//		String url = "/brand/list.do";
//		pagination.pageView(url, params.toString());
		
//		model.addAttribute("pagination", pagination);//request.setAttribute
		model.addAttribute("name", name);//request.setAttribute
		model.addAttribute("isDisplay", isDisplay);//request.setAttribute
		
		return "brand/list";
	}
	//跳转品牌添加页面
	@RequestMapping(value= "/brand/toAdd.do")
	public String toAdd(){
		return "brand/add";
	}
	//添加品牌
	@RequestMapping(value = "/brand/add.do")
	public String add(Brand brand){
		//添加开始
		brandService.addBrand(brand);
		return "redirect:/brand/list.do";
	}
	//删除一个品牌
	@RequestMapping(value = "/brand/delete.do")
	public String delete(Integer id,String name,Integer isDisplay,ModelMap model){
		//TODO 删除
		
		if(StringUtils.isNotBlank(name)){
			model.addAttribute("name", name);
		}
		if(null != isDisplay){
			model.addAttribute("isDisplay", isDisplay);
		}
		
		return "redirect:/brand/list.do";
	}
}
