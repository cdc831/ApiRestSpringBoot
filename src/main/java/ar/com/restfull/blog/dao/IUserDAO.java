package ar.com.restfull.blog.dao;

import ar.com.restfull.blog.entity.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDAO extends JpaRepository<Users, Integer> {
}
