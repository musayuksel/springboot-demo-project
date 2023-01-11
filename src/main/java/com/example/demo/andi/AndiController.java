package com.example.demo.andi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="andis")
public class AndiController {

    @GetMapping()
    public List<Andi> andis(){
        return List.of(
                new Andi(
                        1,
                        "Musa",
                        "Yuksel",
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
