package com.example.demo.andi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping
    public List<Andi> andis(){
    return  andiService.getAndis();
    }

    @PostMapping
    public void registerNewAndi(@RequestBody Andi andi){
        andiService.addNewAndi(andi);
    }
    @DeleteMapping(path = "{andiId}")
    public void deleteAndi(@PathVariable("andiId") Integer andiId){
        andiService.deleteAndi(andiId);
    }

//    @PutMapping(path = "{andiId}")
//    public void updateAndi(
//            @PathVariable("andiId") Integer andiId,
////            @RequestParam(required = false) String firstName,
////            @RequestParam(required = false) String lastName,
//            @RequestParam(required = false) Double level
////            @RequestParam(required = false) String role,
////            @RequestParam(required = false) String squad
//    ){
//        andiService.updateAndi(andiId,level);
//    }
    @PutMapping(path = "{andiId}")
    public void updateAndiWithBody(@RequestBody Andi andi, @PathVariable("andiId") Integer andiId){
        andiService.updateAndiWithBody(andiId, andi);
    }
}
