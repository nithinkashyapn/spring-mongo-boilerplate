package code.nithin.endpoints;

import code.nithin.models.Permission;
import code.nithin.repositories.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/permissions")
public class PermissionEndpoints {
    @Autowired
    private PermissionRepository permissionRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Permission> getAllOwners(){
        return permissionRepository.findAll();
    }
}
