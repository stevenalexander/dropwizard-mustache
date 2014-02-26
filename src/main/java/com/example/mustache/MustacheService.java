package com.example.mustache;

import com.example.mustache.resources.UserResource;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class MustacheService extends Service<MustacheConfiguration> {

    public static void main(String[] args) throws Exception
    {
        new MustacheService().run(args);
    }

    @Override
    public void initialize(Bootstrap<MustacheConfiguration> bootstrap) {
        bootstrap.setName("dropwizard-mustache");
    }

    @Override
    public void run(MustacheConfiguration configuration,
                    Environment environment) {
        environment.addResource(new UserResource());
    }
}
