package com.coffeeshop;

import com.coffeeshop.configuration.CoffeeShopConfiguration;
import com.coffeeshop.resource.CoffeeShopResource;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by Serkan.Tugrul on 07/06/2015.
 */
public class CoffeeShopApplication extends Application<CoffeeShopConfiguration>{

    public static void main(String[] args) throws Exception {
        CoffeeShopApplication coffeeShopApplication = new CoffeeShopApplication();
        coffeeShopApplication.run(args);
    }

    @Override
    public void initialize(Bootstrap<CoffeeShopConfiguration> bootstrap) {
        AssetsBundle bundle = new AssetsBundle("/html", "/");
        bootstrap.addBundle(bundle);
    }

    @Override
    public void run(CoffeeShopConfiguration configuration, final Environment environment) throws Exception {
        environment.jersey().setUrlPattern("/application/*");
        environment.jersey().register(new CoffeeShopResource());
    }
}
