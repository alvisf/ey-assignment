package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ShopDAOimpl implements ShopDAO,Cloneable {
	private static ShopDAOimpl shopdaoimpl;
	private Properties prop;
	private ShopDAOimpl(Properties prop) {
		this.prop=prop;
	}
	
	synchronized public static ShopDAOimpl getShopDAOImpl(Properties prop) {
		
		if(shopdaoimpl==null) {
			shopdaoimpl=new ShopDAOimpl(prop);
			return shopdaoimpl;
		}
		else {
			return shopdaoimpl.createClone();
		}
	}
	public ShopDAOimpl createClone() {
		try {
			return (ShopDAOimpl)super.clone();
		}catch(Exception e) {
			return null;
		}
	}
	
	@Override
	public ShopDTO getAllShopDTO() {
		
			ShopDTO ShopDTO=new ShopDTO();
			Connection con=DButility.getConnection(prop);
			PreparedStatement ps = null;
			try {
				ps = con.prepareStatement("select shop_name from shop");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			
			ResultSet rs = null;
			try {
				rs = ps.executeQuery();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			int i=0;
			try {
				if(rs.next()) {
					ShopDTO.getShopName(rs.getString(1),i);
					i++;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			DButility.closeConnection(null);
			return ShopDTO;
	

	}

	@Override
	public ShopDTO getShopDTO(Properties prop2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getItemsNPrice(int uid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserDTO getShopByName(String uname) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ShopDTO getShopDTO(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

}
