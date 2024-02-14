package com.logbackissue.demo.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class IssueController {

    public ResponseEntity getAge(){
        int response = 30;
        log.info("A new age is returned.");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
