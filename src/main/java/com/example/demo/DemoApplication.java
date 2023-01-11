package com.example.demo;

import com.example.demo.andi.Andi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/andis")
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
						"Yuksel2",
						"Jemison",
						1.1,
						"PD"

				)
		);
	}
}
