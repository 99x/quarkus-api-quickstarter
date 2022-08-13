package org.quickstart.repo;

import org.quickstart.entity.Users;

import java.util.List;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository  {

    public Users getUser(UUID userId) {
        return Users.find("userid", userId).firstResult();
    }

    public List<Users> getAllUsers() {
        return Users.listAll();
    }

}
