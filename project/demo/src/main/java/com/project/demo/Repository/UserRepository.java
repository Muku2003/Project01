package com.project.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.demo.Model.User;
public interface UserRepository extends JpaRepository<User, Integer> {


}
