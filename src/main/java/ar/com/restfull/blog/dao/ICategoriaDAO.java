package ar.com.restfull.blog.dao;

import ar.com.restfull.blog.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaDAO extends JpaRepository<Categoria, Integer> {
}
