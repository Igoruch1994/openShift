package my;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class HelloController {

    @RequestMapping(value="/hello", method = RequestMethod.GET, produces = "application/json")
    public HelloObject getHelloWordMessage(){
        HelloObject helloObject = new HelloObject();
        helloObject.setMessage("Hello word. Life is good...");
        return helloObject;
    }
}
