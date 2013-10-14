grails-rest-example
===================

Shows a few simple ways to expose a REST resource in Grails.

Book
----
Inheritance from the RestfulController. BookController inherits from RestfulController, to expose the Book resource.

Publisher
----
Annotated Grails domain class. Uses @Resource annotation on Publisher class to expose the Publisher resource.

Reviewer
----
Scaffolded Grails Controller for v2.3+. ReviewerController exposes the Reviewer resource.

Store
----
HAL+JSON and Inheritance from RestfulController. StoreController inherits from RestfulController, to expose the Store resource. Also added a Spring bean in resources.groovy to render the Store resource as HAL resource.
