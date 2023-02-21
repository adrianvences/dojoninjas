package adrian.dojoninjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adrian.dojoninjas.models.Ninja;
import adrian.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
  
  @Autowired NinjaRepository ninjaRepository;

  public void AddNinja(Ninja ninja){
    ninjaRepository.save(ninja);
  }

}
