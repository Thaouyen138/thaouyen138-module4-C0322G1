package vn.codegym.restful_blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.restful_blog.model.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

    User findByName(String name);
}
