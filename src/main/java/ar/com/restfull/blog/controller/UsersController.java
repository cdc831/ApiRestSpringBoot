package ar.com.restfull.blog.controller;

import ar.com.restfull.blog.entity.Users;
import ar.com.restfull.blog.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsersController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @GetMapping("/users")
    public List<Users> listarusuarios(){
        return userServiceImpl.listarUsuarios();
    }

    @PostMapping("/users")
    public Users guardarUsuario(@RequestBody Users users){
        return userServiceImpl.guardarUsuario(users);
    }

    @GetMapping("/users/{id}")
    public Users listarPorId(@PathVariable(name = "id") Integer id){
        return userServiceImpl.listarPorId(id);
    }

    @DeleteMapping("/users/{id}")
    public void eliminarUsuario(@PathVariable(name = "id") Integer id){
        userServiceImpl.elimiarUsuario(id);
    }

    @PutMapping("/users/{id}")
    private Users actulizarUsers(@RequestBody Users users,@PathVariable(name = "id") Integer id){
        Users select = new Users();
        Users modif = new Users();

        select = userServiceImpl.listarPorId(id);

        select.setName(users.getName());
        select.setLast_name(users.getLast_name());
        select.setEmail(users.getEmail());

        modif = userServiceImpl.actualizarUsuario(select);

        return modif;
    }
}
