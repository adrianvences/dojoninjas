package adrian.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import adrian.dojoninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja,Long>{

  List<Ninja> findAll();
  
}
