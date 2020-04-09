package ar.com.restfull.blog.service;

import ar.com.restfull.blog.entity.Comentario;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IComentarioService {

    public List<Comentario> listarComentarios();
    public Comentario listarporId(Integer id);
    public Comentario guardarComentario(Comentario comentario);
    public Comentario actualizarComentario (Comentario comentario);
    public void eliminarComentario(Integer id);
}
