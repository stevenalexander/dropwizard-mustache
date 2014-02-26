package com.example.mustache.resources;

import com.example.mustache.core.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.LinkedList;
import java.util.List;

@Path("/")
@Produces({MediaType.APPLICATION_JSON})
public class UserResource {

    public UserResource() {
        super();
    }

    @GET
    @Path("user")
    public List<User> fetch(){
        List<User> users = new LinkedList<>();
        users.add(new User().setDisplayName("User1"));
        users.add(new User().setDisplayName("User2"));

        return users;
    }
}
