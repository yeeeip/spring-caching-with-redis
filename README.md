# How to build this project
You may clone this project on your local machine using command ```git clone https://github.com/yeeeip/spring-caching-with-redis```  

After cloning the project you can either start it from the IDE (e.g. Intellij Idea) or fire up everything in the Docker using docker-compose file

# Starting the project without Docker
If you want to start the application without Docker or can't use it for some reason, you need to install [Postgres](https://www.postgresql.org/download/) (which serves as the DB in the project) and [Redis](https://redis.io/download/), which we will be the storage of cached data in our application.  

After installing everything, make sure Postgres listens on port 5432 and Redis listens on port 6379.  
Now I hope you have everything installed and working, because now it's time to start out application.  
