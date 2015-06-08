package com.coffeeshop.resource;

import com.coffeeshop.coffee.CoffeeShop;
import com.coffeeshop.coffee.Order;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serkan.Tugrul on 07/06/2015.
 */

@Path("/coffeeshop")
@Produces(MediaType.APPLICATION_JSON)
public class CoffeeShopResource {

    @Path("{id}/order/")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveOrder(@PathParam("id") long coffeeShopId, Order order) {
        order.setCoffeeShopId(coffeeShopId);
        return Response.created(URI.create(order.getId())).entity(order).build();
    }

    @Path("nearest/{region}")
    @GET
    public List<CoffeeShop> getNearestCoffeeShop(@PathParam("region") String region) {
        CoffeeShop coffeeShop = new CoffeeShop(region);

        List<CoffeeShop> coffeeShops = new ArrayList<CoffeeShop>();
        CoffeeShop returnCoffeeShop = coffeeShop.getCoffeeShopFromMap(region);

        coffeeShops.add(returnCoffeeShop);

        return coffeeShops;
    }
}
