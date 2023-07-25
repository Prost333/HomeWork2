package by.pvt.test;

import by.pvt.test.domain.Role;
import by.pvt.test.domain.User;
import by.pvt.test.repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository= new UserRepository();
        User user1=new User(1,"dima","bolshoi","123","dimon", Role.ADMIN);
        User user2=new User(2,"Vania","Vankov","111","vov", Role.CLIENT);
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.showAllUsers();
        System.out.println("________________");
        userRepository.deleteUser(user2);
        userRepository.showAllUsers();
    }
}