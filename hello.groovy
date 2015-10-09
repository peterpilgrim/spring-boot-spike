// You need to install Spring Boot CLI on your workstation and then you execute this file
// with the following command line:
//
// $ spring  run   hello.groovy
//

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!"
    }
}
