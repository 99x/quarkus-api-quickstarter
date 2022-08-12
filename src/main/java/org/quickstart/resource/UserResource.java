package org.quickstart.resource;

import org.quickstart.entity.Users;
import org.quickstart.repo.UserRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserResource {

    @Inject
    UserRepository userRepository;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{userId}")
    public Users getUserById(int userId) {
        return userRepository.getUser(userId);
    }
}
