package model;

import java.util.ListResourceBundle;

public class Dictionary_fr extends ListResourceBundle {

	Object obj[][]= {
			{"username","Nom d'utilisateur"},{"password","le mot de passe"}
	};
	
	@Override
	protected Object[][] getContents() {
		return obj;
	}
	
}
