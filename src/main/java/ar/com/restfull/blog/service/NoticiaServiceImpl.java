package ar.com.restfull.blog.service;

import ar.com.restfull.blog.dao.INoticiaDAO;
import ar.com.restfull.blog.entity.Noticia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaServiceImpl implements INoticiaService {

    @Autowired
    INoticiaDAO iNoticiaDAO;

    @Override
    public List<Noticia> listarNoticias() {
        return iNoticiaDAO.findAll();
    }

    @Override
    public Noticia listarPorId(Integer id) {
        return iNoticiaDAO.findById(id).get();
    }

    @Override
    public Noticia guardarNoticias(Noticia noticia) {
        return iNoticiaDAO.save(noticia);
    }

    @Override
    public Noticia actualizarNoticias(Noticia noticia) {
        return iNoticiaDAO.save(noticia);
    }

    @Override
    public void eliminarNoticia(Integer id) {
        iNoticiaDAO.deleteById(id);
    }
}
