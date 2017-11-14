package com.gateway.rz.usersync.controller;

import com.gateway.rz.usersync.entity.Org;
import com.gateway.rz.usersync.entity.Person;
import com.gateway.rz.usersync.repository.OrgRepository;
import com.gateway.rz.usersync.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/org")
public class OrgController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    OrgRepository orgRepository;

    @GetMapping("/list/{systemcode}/{state}")
    public ResponseEntity<List<Org>> list(@PathVariable String systemcode, @PathVariable String state){
        logger.info("=== org=> systemcode = {}, state = {} ===", systemcode, state);
        return ResponseEntity.ok(orgRepository.findBySystemcodeAndState(systemcode, state));

    }

    @PutMapping("/setstate")
    public ResponseEntity<Integer> setState(@RequestParam(required = true) String sid, @RequestParam(defaultValue = "10") String state){
        logger.info("=== org=> sid = {}, state = {} ===", sid, state);
        return ResponseEntity.ok(orgRepository.setState(sid, state));
    }
}
