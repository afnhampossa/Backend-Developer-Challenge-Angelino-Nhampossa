package challenge.api.restfull.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController{
    //ver se a aplicaçao está on
    @GetMapping(path ="/api/status")
    public String check(){
        return "Online";
    }

}