# gossiprouter-image
Generates an image with GossipRouter (listening on port 12001 by default) using the
[https://github.com/GoogleContainerTools/jib](Jib) maven plugin. 

Imports
JGroups and log4j2, but this project currently doesn't have any other specific src code
(the Main class is just a dummy class as Jib apparently requires this).

## Generating the image
`mvn compile jib:dockerBuild` can be run to generate a local (docker) image. The name
of the image is defined in the POM (`<to><image>imagename</image></to>`).

The default is `docker.io/belaban/gossiprouter`; this needs to be changed. Note that
you need to have permissions to push your image to this repo (e.g. add username/password
to the local maven `settings.xml` file, or add credentials in some other way).

To generate and push the image directly to the remote image repo, use
`mvn compile jib:build`  or `mvn package`.

## Running the GossipRouter image
The GossipRouter can be run by referencing `belaban/gossiprouter` (or you own image), e.g.:
`docker run -it -p 12001:12001 belaban/gossiprouter`.

Enjoy!

Bela Ban, Dec 2019 

