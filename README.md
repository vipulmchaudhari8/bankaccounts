# Running application with docker and docker-compose
1. Check if docker is installed on your system: docker --version
2. Run build: docker build -t bankaccount .
3. Check the generated image: docker image ls
4. Run Docker Compose: docker run -p8081:8081 bankaccount
5. Application URLs
	http://localhost:8081/swagger-ui.html
	http://localhost:8081/h2-console
	http://localhost:8081/account
	http://localhost:8081/accountTransactions

# Other Helpful docker Command
docker ps
docker ps -a
docker image ls
docker-compose --version

# If you are running from local environment Getting Started

This project include bankaccounts project backend and UI part

1. Java project runs on 8081 port and support below REST API endpoints(port can be changed from src/main/resources/application.properties files)
	http://localhost:8081/account
	http://localhost:8081/accountTransactions
	
	
2. UI project is located at bankaccounts/ui/bank_ui(Prerequisite Install node js)
   1. To start UI project follow below steps
      - Open CMD from bank_ui directory
      - run below command to load UI
        npm install
        npm start
   2. UI will load on http://localhost:3000/
