package admin.main;

import dom.users.model.UserEntity;

/**
 * Created by peter on 03-Jun-16.
 */
public class UserSession {
    boolean loggedIn;
    private UserEntity user;

    public UserSession(){
        this.loggedIn = false;
        this.user = null;
    }

    public boolean getLoggedIn(){
        return loggedIn;
    }

    public UserEntity getUser(){
        return user;
    }

    public void setLoggedIn(boolean loggedIn){
        this.loggedIn = loggedIn;
    }

    public void setUser(UserEntity user){
        this.user = user;
    }

}
