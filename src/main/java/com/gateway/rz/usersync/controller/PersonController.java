package com.gateway.rz.usersync.controller;

import com.gateway.rz.usersync.entity.Person;
import com.gateway.rz.usersync.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/list/{systemcode}/{state}")
    public ResponseEntity<List<Person>> list(@PathVariable String systemcode, @PathVariable String state){
        logger.info("=== systemcode = {}, state = {} ===", systemcode, state);
        return ResponseEntity.ok(personRepository.findBySystemcodeAndState(systemcode, state));

    }

    @PutMapping("/setstate")
    public ResponseEntity<Integer> setState(@RequestParam(name = "sid", required = true) String sid, @RequestParam(name = "state", defaultValue = "10") String state){
        logger.info("=== sid = {}, state = {} ===", sid, state);
        return ResponseEntity.ok(personRepository.setState(sid, state));
    }
}
