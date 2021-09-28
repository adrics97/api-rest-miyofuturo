package es.uv.api.miyofuturo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uv.api.miyofuturo.entities.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer>{

}
