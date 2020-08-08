package api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Api
 * @Description TODO
 * @Author gmb
 * @Date 2020/8/8 0008 21:40
 */
@RestController()
@RequestMapping("/")
public class Api {
    @RequestMapping("/api")
    public String test(){
        return "Api";
    }
}
