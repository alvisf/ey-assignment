package model;

import java.util.ListResourceBundle;

public class Dictionary_sp extends ListResourceBundle{
	Object obj[][]= {
			{"username","nombre de usuario"},{"password","contrase�a"}
	};
	
	@Override
	protected Object[][] getContents() {
		return obj;
	}
	
}
