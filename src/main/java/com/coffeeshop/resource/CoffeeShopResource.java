package com.coffeeshop.resource;

import com.coffeeshop.HardCodedDatabase;
import com.coffeeshop.coffee.Channel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Serkan.Tugrul on 07/06/2015.
 */

@Path("/schedule")
@Produces(MediaType.APPLICATION_JSON)
public class CoffeeShopResource {

    private HardCodedDatabase hardCodedDatabase;

    public CoffeeShopResource(HardCodedDatabase hardCodedDatabase) {
        this.hardCodedDatabase = hardCodedDatabase;
    }

    @Path("channels")
    @GET
    public List<Channel> getChannels() {
        return hardCodedDatabase.getChannels();
    }
}
