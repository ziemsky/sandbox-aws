package com.ziemsky.aws.ecs.web;

import com.ziemsky.aws.ecs.web.dto.MyResponse;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping(path = "/")
public class MainController {

    @GetMapping(path = "/response", produces = APPLICATION_JSON_VALUE)
    public MyResponse getResponse() {

        InetAddress localHost = null;
        try {
            localHost = InetAddress.getLocalHost();
        } catch (final UnknownHostException e) {
            e.printStackTrace();
        }

        final MyResponse myResponse = new MyResponse(UUID.randomUUID().toString() + ": " + localHost);

        log.info("Response {}", myResponse);

        return myResponse;
    }
}
