package ar.com.restfull.blog.service;

import ar.com.restfull.blog.entity.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICategoriaService {

    public List<Categoria> listarCategorias();
    public Categoria listarPorId (Integer id);
    public Categoria guardarCategoria (Categoria categoria);
    public Categoria actulizarCategoria (Categoria categoria);
    public void eliminarCategoria (Integer id);

}
