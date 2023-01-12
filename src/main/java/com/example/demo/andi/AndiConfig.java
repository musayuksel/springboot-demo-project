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
                        "myx@gmail.com",
                        "Musa",
                        "Yuxel",
                        "Jemison",
                        1.1,
                        "PD"

                );
            System.out.println(musa);
            andiRepository.saveAll(
                    List.of(musa)
            );
        };
    }
}
