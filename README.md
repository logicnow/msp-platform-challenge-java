# MSP Platform Challenge
## Context: MSP Platform Services

#### Welcome!

#### Objective:
Build and deploy this API service, which is supposed to receive GET requests, contact another API to retrieve data relevant to the request, and return the result.

#### Requirements:
1. An SSH client (to connect to the challenge instance)
2. Docker (if you wish to debug locally)

#### Instructions:
* Check out the code and build the docker image.
* Deploy the image on the instance provided.
* The deployed service should listen on port `80` for HTTP requests matching `/api/getServiceAvailabilityByUserId?id=<userid>`.
    * The available `userid`s are `32540, 32541, 32542`.
* It should return a list of that `userid`'s service availability factors, such as: `["service1": 0.1, "service2": 0.2]`.
* Submit the completed challenge as a PR to this repo.
