package service;

import java.util.Properties;

import model.ShopDAO;
import model.ShopDAOimpl;
import model.ShopDTO;

public class ShoppingServiceimpl implements ShoppingService {

	
	Properties prop;
	public ShoppingServiceimpl(Properties prop) {
		this.prop=prop;
	}
	
//	private static ShoppingServiceimpl shoppingServiceimpl;
	
	
	@Override
	public ShopDTO getShops(ShopDTO shopDTO) {
		ShopDAO shopDao=ShopDAOimpl.getShopDAOImpl(prop);
		return shopDao.getAllShopDTO();
	}
}

