# Spike project

Peter Pilgrim, 2015
Research Spike Project 

How does development work for front-end and server side?

In particular, verify that AngularJS development can work seamlessly. 

Front end developer do NOT want to restart the Spring Boot service every time that dynamically change the HTML, CSS or graphic resources. 
So we need to find how Spring Boot handles this situation?

Project [https://github.com/peterpilgrim/spring-boot-spike](https://github.com/peterpilgrim/spring-boot-spike)

# Goals

Establish the fast development lifecycle?

* The solution must allow engineers get started quickly 
  (a new starter Java developer or front-end developer should able get a development environment within a day (5 hours))

* The solution should support iterative and experimental development. 
    Whilst server is still running, if a single HTML or CSS is changed, then the solution should reflect the change at runtime. 
    We should be avoiding tedious cycle. Edit a page. Stop and restart a server in order to see a change.  

* The solution should be relative free from encumbrances.

    * Open source preferred
    * Widely supported with the Java (or JavaScript) community
    * Embrace standards
    * Avoid vendor-lock for the large part
    * Relatively mature by at least 12 months
    * Be designed well
    * Extensible architecture (not lead to falling off the cliff in the near-future)


# Results

## Pros

We see these advantages:

* Spring Boot starts and launches well with well known dependency injection.
* Spring MVC and the REST side work well.
* We like the metrics and health module.
* We like the option to generate a WAR file that can launch on traditional application servers.
* We like the command line option.

## Cons

We also see these disadvantages:

* The solution struggles to serve dynamic content on the hot-reload and/or frontend change.
* Because the solution is outside of Java EE in regards with src/main/webapp folder, then it is hard to develop iteratively and experimentally. 
So far we find this is major concern for us ...
* Information on how to further solve this issue is not easy to find on the Internet. We are particular concern with development with existing IDEs (Eclipse and JetBrains IDEA, WebStorm) 

## Time

We are aware that lack of time might be unfair. However, we refer back to main consideration of getting new starters up to speed quickly. If the solution is harder than the standard Java EE environment to start up, then it probably proves a point.
