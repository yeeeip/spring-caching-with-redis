# How to build this project
You may clone this project on your local machine using command ```git clone https://github.com/yeeeip/spring-caching-with-redis```  

After cloning the project you can either start it from the IDE (e.g. Intellij Idea) or fire up everything in the Docker using docker-compose file

# Starting the project without Docker
If you want to start the application without Docker or can't use it for some reason, you need to install [Postgres](https://www.postgresql.org/download/) (which serves as the DB in the project) and [Redis](https://redis.io/download/), which we will be the storage of cached data in our application.  

After installing everything, make sure Postgres listens on port 5432 and Redis listens on port 6379.  

Now I hope you have everything installed and working, because now it's time to start out application.  
What you need to do is just Run the **main()** method in SpringRedisCachingApplication class.  

If everything is ok, you will see the following text in your console.  

![App Started](https://github.com/yeeeip/spring-caching-with-redis/assets/81825828/064f12f9-62bb-45bc-b246-d39e4f4c2a51)
Congratulations! Now you can hit endpoints via [Postman](https://www.postman.com/) and try out how caching mechanism works.

# Starting the project in Docker
First of all, you need to download and install [Docker](https://www.docker.com/) on your machine.  
If you managed to complete this hard quest, it only remains to enter the project directory and type: ```docker-compose up```  
Then hit http://localhost:8080/api/v1/students and if you see [] (empty array) in the response - everything works!  

![image](https://github.com/yeeeip/spring-caching-with-redis/assets/81825828/ee0fe924-fda0-4f46-9f3b-485ba24595bd)
