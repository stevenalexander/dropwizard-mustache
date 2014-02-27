# Dropwizard Mustache

Sample application showing how to build a [dropwizard](http://dropwizard.codahale.com/) service returning html views using the [mustache templating engine](https://github.com/spullara/mustache.java).

This is a simple dropwizard implementation for returning HTML, using Mustache as the templating engine. It's based on the Dropwizard example [here](http://dropwizard.codahale.com/manual/views/). Used mustache over FreeMarker basically because I'd heard more about Mustache and it seemed more active. Using SBT instead of Maven as I keep hearing bad things about using Maven for complex builds and want to build up my SBT knowledge.

A couple of points noted during development:

* To use views you need to add a dependency to "dropwizard-views" in addition to "dropwizard-core"
* Mustache.java does not support inheritance, but does do partials, which makes it a little clumsy for HTML templating
* Testing of views looks easy, as does testing resources constructing them

## Setup

To compile:

```
./sbt assembly
```

To run:

```
java -jar target/scala-2.10/dropwizard-mustache-assembly-0.1.jar server config.yml
```
