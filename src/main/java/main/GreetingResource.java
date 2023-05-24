package main;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.panache.common.Parameters;
import model.Greetings;

@Path("/hello")
public class GreetingResource {

    @Inject
    io.vertx.mutiny.pgclient.PgPool client;

    @GET
    public String hello() {
        String greeting = "Hello, PostgreSQL!";
        PanacheEntityBase.persist(new Greetings(greeting));
        return greeting;
    }
}
