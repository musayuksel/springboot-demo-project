package com.example.demo.andi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="andis")
public class AndiController {

    private final AndiService andiService;

    @Autowired//Anything we pass to AndiService should be injected
    public AndiController(AndiService andiService){
//        this.andiService = new AndiService();//this is not a good practice
        this.andiService =andiService;
    }
    @GetMapping()
    public List<Andi> andis(){
    return  andiService.getAndis();
    }
}
