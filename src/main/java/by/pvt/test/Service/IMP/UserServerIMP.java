package by.pvt.test.Service.IMP;

import by.pvt.test.Service.UserService;
import by.pvt.test.domain.Role;
import by.pvt.test.domain.User;
import by.pvt.test.repository.UserRepository;

import java.util.List;

public class UserServerIMP implements UserService {
    UserRepository userRepository = new UserRepository();

    public UserServerIMP(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public List<User> showAllUsers() {
        return null;
    }

    @Override
    public User findUserforID(int id) {
        return null;
    }

    public User register(String name, String surname, String password, String login) {
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setLogin(login);
        user.setPassword(password);
        user.setId(userRepository.update().size()+1);
        user.setRole(Role.CLIENT);
        userRepository.addUser(user);
        return user;
    }
}
