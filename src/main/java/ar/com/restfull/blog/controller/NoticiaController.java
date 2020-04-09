package ar.com.restfull.blog.controller;

import ar.com.restfull.blog.entity.Noticia;
import ar.com.restfull.blog.service.NoticiaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class NoticiaController {

    @Autowired
    NoticiaServiceImpl noticiaServiceImpl;

    @GetMapping("/noticias")
    public List<Noticia> listar(){
        return noticiaServiceImpl.listarNoticias();
    }

    @GetMapping("/noticias/{id}")
    public Noticia listaPorId(@PathVariable(name = "id") Integer id){
        return noticiaServiceImpl.listarPorId(id);
    }

    @PostMapping("/noticias")
    public Noticia guardarNoticia(@RequestBody Noticia noticia){
       return noticiaServiceImpl.guardarNoticias(noticia);
    }

    @DeleteMapping("/noticias/{id}")
    public void eliminarNoticia(@PathVariable(name = "id") Integer id){
        noticiaServiceImpl.eliminarNoticia(id);
    }

    @PutMapping("/noticias/{id}")
    public Noticia actualizarNoticia(@RequestBody Noticia noticia,@PathVariable(name = "id") Integer id){
        Noticia select = new Noticia();
        Noticia modif = new Noticia();

        select = noticiaServiceImpl.listarPorId(id);

        select.setTitulo(noticia.getTitulo());
        select.setDescripcion(noticia.getDescripcion());

        modif = noticiaServiceImpl.actualizarNoticias(select);

        return modif;
    }
}
