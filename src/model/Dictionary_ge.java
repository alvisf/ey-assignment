package model;

import java.util.ListResourceBundle;

public class Dictionary_ge extends ListResourceBundle {
	Object obj[][]= {
			{"username","Nutzername"},{"password","Passwort"}
	};
	
	@Override
	protected Object[][] getContents() {
		return obj;
	}
	
}
