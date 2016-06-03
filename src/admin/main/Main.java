package admin.main;

import admin.ui.LoginScreen;
import admin.ui.MainScreen;
import dom.users.model.UserEntity;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private UserSession session;
	public Main() {
        session = new UserSession();
        //Set de logger op warning only level
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.WARNING);

		new LoginScreen(session);
	}
}
