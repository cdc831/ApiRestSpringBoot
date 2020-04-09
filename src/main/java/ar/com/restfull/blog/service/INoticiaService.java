package ar.com.restfull.blog.service;

import ar.com.restfull.blog.entity.Noticia;
import ar.com.restfull.blog.entity.Users;

import java.util.List;

public interface INoticiaService {

    public List<Noticia> listarNoticias();
    public Noticia listarPorId (Integer id);
    public Noticia guardarNoticias (Noticia noticia);
    public Noticia actualizarNoticias (Noticia noticia);
    public void eliminarNoticia(Integer id);
}
