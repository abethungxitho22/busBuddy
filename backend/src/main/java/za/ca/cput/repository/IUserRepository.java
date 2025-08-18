package za.ca.cput.repository;

import za.ca.cput.domain.User;
import java.util.List;

public interface IUserRepository {
    User save(User user);
    User findByUsername(String username);
    List<User> findAll();
}
