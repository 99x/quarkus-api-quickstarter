package org.quickstart.resource;

import org.quickstart.entity.Users;
import org.quickstart.repo.UserRepository;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserResource {

    @Inject
    UserRepository userRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        List<Users> users = userRepository.getAllUsers();
        return Response.ok(users).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{userId}")
    public Response getUserById(UUID userId) {
        Users user = userRepository.getUser(userId);
        return Response.ok(user).build();
    }
}
