package com.wolves.demo.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 购物车
 * @author lx
 *
 */
public class BuyerCart implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//1：商品结果集 List<BuyerItem> 
	private List<BuyerItem> items = new ArrayList<>();
	
	//添加购物项到购物车中
	public void addItem(BuyerItem item){
		//判断同款
		if(items.contains(item)){
			for (BuyerItem it : items) {
				if(it.equals(item)){
					it.setAmount(item.getAmount() + it.getAmount());
				}
			}
		}else{
			items.add(item);
		}
	}

	public List<BuyerItem> getItems() {
		return items;
	}

	public void setItems(List<BuyerItem> items) {
		this.items = items;
	}
	
	//2:小计     （商品数据  、商品金额  、运费  、 总计）
	//商品数量
	@JsonIgnore
	public Integer getProductAmount(){
		Integer result = 0;
		//计算过程
		for (BuyerItem buyerItem : items) {
			result += buyerItem.getAmount();
		}
		return result;
	}
	//商品金额
	@JsonIgnore
	public Float getProductPrice(){
		Float result = 0f;
		//计算过程
		for (BuyerItem buyerItem : items) {
			result += buyerItem.getAmount()*buyerItem.getSku().getPrice();
		}
		return result;
	}
	// 运费
	@JsonIgnore
	public Float getFee(){
		Float result = 0f;
		if(getProductPrice() < 79){
			result = 5f;
		}
		return result;
	}
	//总金额
	@JsonIgnore
	public Float getTotalPrice(){
		return getProductPrice() + getFee();
	}
	
	
	
}
