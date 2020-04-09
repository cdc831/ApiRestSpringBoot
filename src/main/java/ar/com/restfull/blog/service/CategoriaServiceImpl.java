package ar.com.restfull.blog.service;

import ar.com.restfull.blog.dao.ICategoriaDAO;
import ar.com.restfull.blog.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    ICategoriaDAO iCategoriaDAO;

    @Override
    public List<Categoria> listarCategorias() {
        return iCategoriaDAO.findAll();
    }

    @Override
    public Categoria listarPorId(Integer id) {
        return iCategoriaDAO.findById(id).get();
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        return iCategoriaDAO.save(categoria);
    }

    @Override
    public Categoria actulizarCategoria(Categoria categoria) {
        return iCategoriaDAO.save(categoria);
    }

    @Override
    public void eliminarCategoria(Integer id) {
        iCategoriaDAO.deleteById(id);
    }
}
