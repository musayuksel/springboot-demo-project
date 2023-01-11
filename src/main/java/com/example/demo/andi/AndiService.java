package com.example.demo.andi;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
//@Component . more general
@Service
public class AndiService {
    public List<Andi> getAndis(){
        return List.of(
                new Andi(
                        1,
                        "Musa",
                        "Yuxel",
                        "Jemison",
                        1.1,
                        "PD"

                ),
                new Andi(
                        2,
                        "Musa2",
                        "Yuxel",
                        "Jemison",
                        1.2,
                        "PD"

                )
        );
    }
}
