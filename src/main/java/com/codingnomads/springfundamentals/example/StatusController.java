/* CodingNomads (C)2024 */
package com.codingnomads.springfundamentals.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusController {

    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping("/arrival")
    public String sayHello() {
        return statusService.processStatus(true);
    }

    @GetMapping("/departure")
    public String sayGoodbye() {
        return statusService.processStatus(false);
    }

    @GetMapping("/success")
    public String saySuccess(){
        return statusService.processSuccess();
    }
}
