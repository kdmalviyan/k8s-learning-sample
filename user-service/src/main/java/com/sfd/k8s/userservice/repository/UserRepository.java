package com.sfd.k8s.userservice.repository;

import com.sfd.k8s.userservice.model.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kuldeep
 */
@Repository
public class UserRepository {
    private final Map<Long, UserInfo> USERS = new HashMap<>();
    public UserInfo save(final UserInfo user) {
        USERS.put(user.getId(), user);
        return user;
    }

    public Collection<UserInfo> list() {
        return USERS.values();
    }
}
