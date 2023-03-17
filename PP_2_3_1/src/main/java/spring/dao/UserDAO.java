package spring.dao;

import spring.models.User;

import java.util.List;

public interface UserDAO {
    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
    public void updateUser(User user);

    public List<User> getAllUser();

}
