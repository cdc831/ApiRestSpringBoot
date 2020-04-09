package ar.com.restfull.blog.service;

import ar.com.restfull.blog.entity.Users;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {

    public List<Users> listarUsuarios();
    public Users listarPorId (Integer id);
    public Users guardarUsuario (Users users);
    public Users actualizarUsuario(Users users);
    public void elimiarUsuario(Integer id);
}
