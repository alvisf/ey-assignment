package model;

import java.io.Serializable;

public class ShopDTO implements Serializable{

	private int shop_id;
	private String[] shop_name;
	
	private int for_shop_id;
	private String avilable_item_name;
	private int avilable_item_price;
	
//	get variables for the shop
	
	public final int getShopId() {
		return shop_id;
	}
	public final String getShopName(String shop_name, int i) {
		return this.shop_name[i] = shop_name;
	}
	
//	get variables for the items for shop
	
	public final int getItemShopId() {
		return for_shop_id;
	}
	public final String getItemName() {
		return avilable_item_name;
	}
	
	public final int getItemPrice() {
		return avilable_item_price;
	}
	
	
	
	
}
