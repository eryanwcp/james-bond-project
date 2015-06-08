package com.jamesbond;

import com.jamesbond.configuration.JamesBondMoviesConfiguration;
import com.jamesbond.resource.JamesBondMoviesResource;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by Serkan.Tugrul on 07/06/2015.
 */
public class JamesBondMoviesApplication extends Application<JamesBondMoviesConfiguration>{

    public static void main(String[] args) throws Exception {
        JamesBondMoviesApplication jamesBondMoviesApplication = new JamesBondMoviesApplication();
        jamesBondMoviesApplication.run(args);
    }

    @Override
    public void initialize(Bootstrap<JamesBondMoviesConfiguration> bootstrap) {
        AssetsBundle bundle = new AssetsBundle("/html", "/");
        bootstrap.addBundle(bundle);
    }

    @Override
    public void run(JamesBondMoviesConfiguration configuration, final Environment environment) throws Exception {
        HardCodedDatabase hardCodedDatabase = new HardCodedDatabase();

        environment.jersey().setUrlPattern("/application/*");
        environment.jersey().register(new JamesBondMoviesResource(hardCodedDatabase));
    }
}
