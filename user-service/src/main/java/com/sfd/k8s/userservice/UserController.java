package com.sfd.k8s.userservice;

import com.sfd.k8s.userservice.model.UserInfo;
import com.sfd.k8s.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author kuldeep
 */
@RestController
@RequestMapping(value = "user")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService service;
    @PostMapping
    public ResponseEntity<UserInfo> save(@RequestBody UserInfo user) {
        log.info("Creating User" + user);
        return ResponseEntity.ok(service.save(user));
    }

    @GetMapping
    public ResponseEntity<Collection<UserInfo>> getAll() {
        return ResponseEntity.ok(service.list());
    }
}
