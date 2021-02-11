package challenge.api.restfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import challenge.api.restfull.model.Paises;

public interface PaisesRepository  extends JpaRepository <Paises, Integer>{
    
}
