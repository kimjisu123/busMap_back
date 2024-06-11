package com.busmap.server.test.Controller;

import com.busmap.server.test.Service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
//@CrossOrigin(origins = "http://client")
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    public String Test(){

        log.info("안녕~");

        testService.test();

        return "String";
    }

    @GetMapping("/dockerTest")
    public String DockerTest(){

        return "dockerTest 응답";
    }
}
