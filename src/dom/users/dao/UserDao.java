package dom.users.dao;

import dom.users.model.UserEntity;

/**
 * Created by peter on 03-Jun-16.
 */
public interface UserDao {
    UserEntity findByUsername(String username, String password);
}
