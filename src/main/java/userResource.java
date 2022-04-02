import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

@Path("/user")
public class userResource {



    @GET
    @Path("info")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
    @RolesAllowed("test")
//    @PermitAll
    public String userInfo(@Context SecurityContext securityContext){
        return securityContext.getUserPrincipal().getName();
    }


}
