package man.rason.family.tree.genealogic.service;

import man.rason.family.tree.genealogic.model.User;
import man.rason.family.tree.genealogic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
