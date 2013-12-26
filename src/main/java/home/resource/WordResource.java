package home.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

public class WordResource {
    @GET
    @Produces("text/html")
    @Path("/word/{name}")
    public String sayGoodbye(@PathParam("name") String name) {
        return "Goodbye " + name;
    }
}
