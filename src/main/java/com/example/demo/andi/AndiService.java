package com.example.demo.andi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
//        return List.of(
//                new Andi(
//                        1,
//                        "Musa",
//                        "Yuxel",
//                        "Jemison",
//                        1.1,
//                        "PD"
//
//                )
//        );
    }
}
