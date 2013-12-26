package home.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

public class TeacherResource {
    @GET
    @Produces("text/html")
    @Path("/teacher/{name}")
    public String sayHello(@PathParam("name") String name) {
        return "Hello " + name;
    }
}
