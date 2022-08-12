package org.quickstart.repo;

import org.quickstart.entity.Users;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository {

    public Users getUser(int userId) {
        return Users.find("userid", userId).firstResult();
    }

}
