package ar.com.restfull.blog.dao;

import ar.com.restfull.blog.entity.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INoticiaDAO extends JpaRepository<Noticia,Integer> {
}
