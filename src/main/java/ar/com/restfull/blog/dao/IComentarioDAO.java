package ar.com.restfull.blog.dao;

import ar.com.restfull.blog.entity.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComentarioDAO extends JpaRepository<Comentario, Integer> {
}
