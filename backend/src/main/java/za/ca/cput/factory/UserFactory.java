package za.ca.cput.factory;

import za.ca.cput.domain.User;

public class UserFactory {
    public static User createUser(String username, String password) {
        return new User(username, password);
    }
}
