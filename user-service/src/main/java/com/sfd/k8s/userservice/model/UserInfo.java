package com.sfd.k8s.userservice.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author kuldeep
 */
@Data
public class UserInfo {
    private Long id;
    private String name;
    private LocalDateTime created_date = LocalDateTime.now();
    private String username;
    private String password;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfo userInfo = (UserInfo) o;

        if (getId() != null ? !getId().equals(userInfo.getId()) : userInfo.getId() != null) return false;
        return getUsername() != null ? getUsername().equals(userInfo.getUsername()) : userInfo.getUsername() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
        return result;
    }
}
