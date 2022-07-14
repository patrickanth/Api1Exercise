package co.apiuno.apiexercise.contollers;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    //Method REST that return the name "Patrick" on a GET Request
    @GetMapping("/getName")
    public String getName(){
        return "Patrick";
    }

    //Method REST that will reverse every string into the JASON you put in the body.
    @PostMapping("/reversedName")
    public String reverse(@RequestBody String name){
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder = stringBuilder.reverse();
        return stringBuilder.toString();
    }


}
