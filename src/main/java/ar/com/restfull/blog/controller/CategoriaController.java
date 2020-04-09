package ar.com.restfull.blog.controller;

import ar.com.restfull.blog.entity.Categoria;
import ar.com.restfull.blog.service.CategoriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CategoriaController {

    @Autowired
    CategoriaServiceImpl categoriaServiceImpl;

    @GetMapping("/categ")
    public List<Categoria> listarCategorias(){
        return categoriaServiceImpl.listarCategorias();
    }

    @PostMapping("/categ")
    public Categoria guardarCategoria (@RequestBody Categoria categoria){
         return categoriaServiceImpl.guardarCategoria(categoria);
    }

    @GetMapping("/categ/{id}")
    public Categoria listarPorId(@PathVariable(name = "id") Integer id){
        return categoriaServiceImpl.listarPorId(id);
    }

    @PutMapping("/categ/{id}")
    public Categoria actualizarCategoria(@RequestBody Categoria categoria,@PathVariable(name = "id") Integer id){
        Categoria categSelec = new Categoria();
        Categoria categModi = new Categoria();

        categSelec = categoriaServiceImpl.listarPorId(id);
        categSelec.setNm_categoria(categoria.getNm_categoria());

        categModi = categoriaServiceImpl.actulizarCategoria(categSelec);

        return categModi;
    }

    @DeleteMapping("/categ/{id}")
    public void eliminarCategoria (@PathVariable(name = "id") Integer id){
        categoriaServiceImpl.eliminarCategoria(id);
    }
}
