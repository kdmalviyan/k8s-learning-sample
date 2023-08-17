package com.sfd.k8s.userservice.service;

import com.sfd.k8s.userservice.model.UserInfo;
import com.sfd.k8s.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author kuldeep
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private static final AtomicLong COUNTER = new AtomicLong(0);
    private final UserRepository repository;
    public UserInfo save(final UserInfo user) {
        Long id = COUNTER.addAndGet(1);
        user.setId(id);
        return repository.save(user);
    }

    public Collection<UserInfo> list() {
        return repository.list();
    }
}
