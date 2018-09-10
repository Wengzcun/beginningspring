package webController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rene on 2018. 9. 10..
 */

@RestController
public class SimpleWebController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
