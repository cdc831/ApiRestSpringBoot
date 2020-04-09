package ar.com.restfull.blog.controller;

import ar.com.restfull.blog.entity.Comentario;
import ar.com.restfull.blog.service.ComentarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ComentarioController {

    @Autowired
    ComentarioServiceImpl comentarioServiceImpl;

    @GetMapping("/comentarios")
    public List<Comentario> listarComentarios(){
        return comentarioServiceImpl.listarComentarios();
    }

    @GetMapping("/comentarios/{id}")
    public Comentario listarComentarioPorId (@PathVariable(name = "id") Integer id){
        return comentarioServiceImpl.listarporId(id);
    }

    @PostMapping("/comentarios")
    public Comentario guardaComentario(@RequestBody Comentario comentario){
        return comentarioServiceImpl.guardarComentario(comentario);
    }

    @DeleteMapping("comentarios/{id}")
    public void eliminarComentario(@PathVariable(name = "id") Integer id){
        comentarioServiceImpl.eliminarComentario(id);
    }

    @PutMapping("/comentarios/{id}")
    public Comentario actualizarComentarios(@RequestBody Comentario comentario,@PathVariable(name = "id") Integer id){

        Comentario selec = new Comentario();
        Comentario modif = new Comentario();

        selec = comentarioServiceImpl.listarporId(id);

        selec.setNm_comentario(comentario.getNm_comentario());
        selec.setFecha(comentario.getFecha());
        selec.setHora(comentario.getHora());

        modif = comentarioServiceImpl.actualizarComentario(selec);

        return modif;
    }
}
