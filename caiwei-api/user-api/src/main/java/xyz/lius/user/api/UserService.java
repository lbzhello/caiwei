package xyz.lius.user.api;

import xyz.lius.user.model.User;

import java.util.List;

public interface UserService {
    List<User> findList();

    User findById(int id);

    User findByName(String name);

    void create(User user);

    void update(User user);

    void delete(int id);
}
