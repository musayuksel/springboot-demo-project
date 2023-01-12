package com.example.demo.andi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public List<Andi> getAndis() {
        return andiRepository.findAll();
    }

    public void addNewAndi(Andi andi) {
        Optional<Andi> andiEmail = andiRepository
                .findAndiByEmail(andi.getEmail());

        if (andiEmail.isPresent()) {
            throw new IllegalStateException("Andi already exist");
        }
        andiRepository.save(andi);
    }

    public void deleteAndi(Integer andiId) {
        //add logics here...
        boolean isAndiExist = andiRepository.existsById(andiId);
        if (!isAndiExist) {
            throw new IllegalStateException("Andi with id " + andiId + " does NOT exist...");
        }
        andiRepository.deleteById(andiId);
    }

    @Transactional
    public void updateAndi(Integer andiId, Double level) {
        Andi andi = andiRepository.findById(andiId)
                .orElseThrow(
                        () -> new IllegalStateException("andi doesn't exist....")
                );
        if (level != null) {
            andi.setLevel(level);
        }
    }


    @Transactional
    public void updateAndiWithBody(Integer andiId, Andi andi) {
        Andi andiFromDb = andiRepository.findById(andiId)
                .orElseThrow(
                        () -> new IllegalStateException("andi doesn't exist....")
                );
        double andiLevel = andi.getLevel();
        System.out.println("New andi level>>>>>>>>>>>>>>>>>>>"+ andiLevel);
        if(andiLevel < 1.1 || andiLevel > 6.0){
            throw  new IllegalStateException("Level of andi is illegal....");
        }
        andiFromDb.setLevel(andiLevel);
    }
}