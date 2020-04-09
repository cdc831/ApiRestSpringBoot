package ar.com.restfull.blog.service;

import ar.com.restfull.blog.dao.IUserDAO;
import ar.com.restfull.blog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDAO iUserDAO;

    @Override
    public List<Users> listarUsuarios() {
        return iUserDAO.findAll();
    }

    @Override
    public Users listarPorId(Integer id) {
        return iUserDAO.findById(id).get();
    }

    @Override
    public Users guardarUsuario(Users users) {
        return iUserDAO.save(users);
    }

    @Override
    public Users actualizarUsuario(Users users) {
        return iUserDAO.save(users);
    }

    @Override
    public void elimiarUsuario(Integer id) {
        iUserDAO.deleteById(id);
    }
}
