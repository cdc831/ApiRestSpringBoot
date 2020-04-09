package ar.com.restfull.blog.service;


import ar.com.restfull.blog.entity.UserApp;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserAppService {

    public List<UserApp> listarUsuarioApp();
    public UserApp guardarUsuarioApp(UserApp userApp);
    public UserApp obtenerIdUsuarioApp (Integer id);
    public UserApp actulizarUsuarioApp (UserApp userApp);
    public void eliminarUsuarioApp (Integer id);

}
