package service.user;

import model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    boolean save(User user);

    User removeById(long id);

    boolean delete();
}
