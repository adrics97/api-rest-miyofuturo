package es.uv.api.miyofuturo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uv.api.miyofuturo.entities.PreguntaTest;
import es.uv.api.miyofuturo.entities.Test;
import es.uv.api.miyofuturo.entities.Ids.PreguntaTestId;


@Repository
public interface PreguntasTestRepository extends JpaRepository<PreguntaTest, PreguntaTestId>{

	List<PreguntaTest> findByIdtest(Test t);
	
}
