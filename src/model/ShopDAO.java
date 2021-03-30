package model;

import java.util.Properties;
import java.util.Set;

public interface  ShopDAO {
	public ShopDTO getShopDTO(int uid);
	public ShopDTO getAllShopDTO();
	public int getItemsNPrice(int uid);
	public UserDTO getShopByName(String uname);
	ShopDTO getShopDTO(Properties prop2);

}
