package com.ziemsky.aws.ecs.web;

import com.ziemsky.aws.ecs.web.dto.MyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/")
public class MainController {

    @GetMapping(path = "/response", produces = APPLICATION_JSON_VALUE)
    public MyResponse getResponse() {

        return new MyResponse(UUID.randomUUID().toString());
    }
}
