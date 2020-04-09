package ar.com.restfull.blog.controller;

import ar.com.restfull.blog.entity.UserApp;
import ar.com.restfull.blog.service.UserAppServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserAppController {

    @Autowired
    UserAppServiceImpl userAppServiceImpl;

    @GetMapping("/user_app")
    public List<UserApp> listUserApp(){
        return userAppServiceImpl.listarUsuarioApp();
    }

    @PostMapping("/user_app")
    public UserApp guardarUsuarioApp(@RequestBody UserApp userApp){
        return userAppServiceImpl.guardarUsuarioApp(userApp);
    }

    @GetMapping("/user_app/{id}")
    public UserApp usuarioPorId(@PathVariable(name = "id") Integer id){
        UserApp userSelec = new UserApp();
        userSelec =userAppServiceImpl.obtenerIdUsuarioApp(id);
        return userSelec;
    }

    @PutMapping("/user_app/{id}")
    public UserApp actulizarUsuarioApp(@RequestBody UserApp userApp,@PathVariable(name = "id") Integer id){
        UserApp userSelect = new UserApp();
        UserApp userModifi = new UserApp();

        userSelect = userAppServiceImpl.obtenerIdUsuarioApp(id);

        userSelect.setUser(userApp.getUser());
        userSelect.setPass(userApp.getPass());
        userSelect.setLevel(userApp.getLevel());
        userSelect.setStatus(userApp.getStatus());

        userModifi = userAppServiceImpl.actulizarUsuarioApp(userSelect);
        return userModifi;
    }

    @DeleteMapping("/user_app/{id}")
    public void eliminarUsuarioApp(@PathVariable(name = "id") Integer id){
        userAppServiceImpl.eliminarUsuarioApp(id);
    }
}
