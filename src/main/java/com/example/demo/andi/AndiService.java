package com.example.demo.andi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component . more general
@Service
public class AndiService {
    private final AndiRepository andiRepository;
    @Autowired
    public AndiService(AndiRepository andiRepository) {
        this.andiRepository = andiRepository;
    }
    public List<Andi> getAndis(){
        return andiRepository.findAll();
    }
    public void addNewAndi(Andi andi) {
      Optional<Andi> andiEmail = andiRepository
              .findAndiByEmail(andi.getEmail());

      if(andiEmail.isPresent()){
          throw  new IllegalStateException("Andi already exist");
      }
    andiRepository.save(andi);
    }
}
