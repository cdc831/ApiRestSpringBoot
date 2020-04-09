package ar.com.restfull.blog.service;

import ar.com.restfull.blog.dao.IUserAppDAO;
import ar.com.restfull.blog.entity.UserApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAppServiceImpl implements IUserAppService {

    @Autowired
    IUserAppDAO iUserAppDAO;

    @Override
    public List<UserApp> listarUsuarioApp() {
        return iUserAppDAO.findAll();
    }

    @Override
    public UserApp guardarUsuarioApp(UserApp userApp) {
        return iUserAppDAO.save(userApp);
    }

    @Override
    public UserApp obtenerIdUsuarioApp(Integer id) {
        return iUserAppDAO.findById(id).get();
    }

    @Override
    public UserApp actulizarUsuarioApp(UserApp userApp) {
        return iUserAppDAO.save(userApp);
    }

    @Override
    public void eliminarUsuarioApp(Integer id) {
        iUserAppDAO.deleteById(id);
    }
}
