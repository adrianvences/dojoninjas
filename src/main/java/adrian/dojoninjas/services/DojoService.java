package adrian.dojoninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adrian.dojoninjas.models.Dojo;
import adrian.dojoninjas.repositories.DojoRepository;

@Service
public class DojoService {
  @Autowired DojoRepository dojoRepository;
  
  public void createDojo(Dojo dojo){
    dojoRepository.save(dojo);
  }

  public List<Dojo> getAll() {
    return dojoRepository.findAll();
  }

  public Dojo getOne(Long id){
    Optional<Dojo> optionalDojo = dojoRepository.findById(id);
    // if(optionalDojo.isPresent()){
    //   return  optionalDojo;
    // } else {
    //   return null;
    // }
    return optionalDojo.orElse(null);
  }

}
