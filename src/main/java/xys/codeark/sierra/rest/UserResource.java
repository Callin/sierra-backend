package xys.codeark.sierra.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import xys.codeark.sierra.dto.User;
import xys.codeark.sierra.services.UserService;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Slf4j
@Controller
@Path(RestConstants.USER_PATH)
public class UserResource {

    @Resource
    private UserService userService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(User user) {
        userService.createUser(user);
        return Response.ok().build();
    }

    @GET
    @Path("{id}")
    public Response getUser(@PathParam("id") Long id) {
        return Response.ok(userService.getUser(id)).build();
    }
}
