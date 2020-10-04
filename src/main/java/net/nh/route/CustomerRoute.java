package net.nh.route;

import net.nh.repository.CustomerRepository;
import org.jvnet.hk2.annotations.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/customers")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
@Service
public class CustomerRoute {

    private final CustomerRepository repository;

    public CustomerRoute(CustomerRepository repository) {
        this.repository = repository;
    }

    @GET
    public Response getFrameHourSchedule(@QueryParam("page") int page, @QueryParam("size") int pageSize) {
        return Response.ok(repository.findAll(page, pageSize == 0 ? 10 : pageSize)).build();
    }
}
