//rest service
package com.example;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("calc")


public class Calculator {

    // will be called like this
    //https://javaproject-maven.herokuapp.com/myresource
   // so will be
    //https://javaproject-maven.herokuapp.com/cal/Add/52/48
   // 52 ,48  einai oi dyo oroi arithmoi gia to calculator
    @GET
    @Path("Add/ {a} / {b}")   //δηλωση και εδω τις παραμετρους
    @Produces(MediaType.APPLICATION_JSON)

    public Response adder(
            @PathParam("a") String a,     // και εδω δηλωση
            @PathParam("b") String b)
     {
     int ai = Integer.valueOf(a);   // μετατροπη σε ακεραιους
     int bi = Integer.valueOf(b);
     int result = ai +bi ;

     // kai epistrofi me antikeimeno response http response me status 200 oti
         // esto ola tha pane kala kai entity to result
         return Response.status(200).entity(result).build();

    }

}
