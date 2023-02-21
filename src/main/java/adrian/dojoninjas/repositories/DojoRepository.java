package adrian.dojoninjas.repositories;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

import adrian.dojoninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
  List<Dojo> findAll();
  
}
