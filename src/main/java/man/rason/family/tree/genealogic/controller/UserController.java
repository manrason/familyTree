package man.rason.family.tree.genealogic.controller;

import man.rason.family.tree.genealogic.model.User;
import man.rason.family.tree.genealogic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping(path = "/users")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }
}
