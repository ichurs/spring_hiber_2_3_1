package dao;

import model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void removeUser(int id) {

    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> listUsers() {
        return null;
    }
}
