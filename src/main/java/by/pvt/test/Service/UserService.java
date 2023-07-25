package by.pvt.test.Service;

import by.pvt.test.domain.User;

import java.util.List;

public interface UserService {
 User addUser(User user);

 void deleteUser(User user);
 List<User> showAllUsers();
 User findUserforID(int id);

}

