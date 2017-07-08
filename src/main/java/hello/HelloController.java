package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        LocalDateTime currentTime = LocalDateTime.now();
        String time = "Current DateTime: " + currentTime;
        return time;
    }
}
