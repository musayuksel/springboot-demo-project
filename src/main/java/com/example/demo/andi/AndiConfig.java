package com.example.demo.andi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AndiConfig {
    @Bean
    CommandLineRunner commandLineRunner(AndiRepository andiRepository){
        return args -> {
            Andi musa =  new Andi(
                        1,
                        "Musa",
                        "Yuxel",
                        "Jemison",
                        1.1,
                        "PD"

                );
            Andi musa2 =  new Andi(
                    "Musa2",
                    "Yuxel2",
                    "Jemison",
                    1.2,
                    "PD"

            );
            andiRepository.saveAll(
                    List.of(musa,musa2)
            );
        };
    }
}
