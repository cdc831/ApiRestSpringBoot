package ar.com.restfull.blog.dao;

import ar.com.restfull.blog.entity.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserAppDAO extends JpaRepository<UserApp, Integer> {
}
