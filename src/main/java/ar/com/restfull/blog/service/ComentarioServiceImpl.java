package ar.com.restfull.blog.service;

import ar.com.restfull.blog.dao.IComentarioDAO;
import ar.com.restfull.blog.entity.Comentario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioServiceImpl implements IComentarioService {

    @Autowired
    IComentarioDAO iComentarioDAO;

    @Override
    public List<Comentario> listarComentarios() {
        return iComentarioDAO.findAll();
    }

    @Override
    public Comentario listarporId(Integer id) {
        return iComentarioDAO.findById(id).get();
    }

    @Override
    public Comentario guardarComentario(Comentario comentario) {
        return null;
    }

    @Override
    public Comentario actualizarComentario(Comentario comentario) {
        return null;
    }

    @Override
    public void eliminarComentario(Integer id) {

    }
}
