package es.bne.webapp.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.bne.webapp.persist.entity.User;


public interface UserRepo extends JpaRepository<User, Long> {

}
