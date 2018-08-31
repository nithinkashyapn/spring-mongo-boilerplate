package code.nithin.endpoints;

import code.nithin.models.User;
import code.nithin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
public class UserEndpoints {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
