package es.bne.webapp.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.bne.webapp.persist.entity.Authority;

public interface AuthorityRepo extends JpaRepository<Authority, Long> {

}