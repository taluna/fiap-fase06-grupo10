FOLDER=$(shell pwd)

build-projects:
	@echo "------------------ BUILD PROJECTS --------------------------"
	mvn -f fase06-api-pedido/pom.xml clean package -DskipTests=true 
# 	&& \
#     mvn -f api-pagamento/pom.xml clean package -DskipTests=true && \
# 	mvn -f api-gateway/pom.xml clean package -DskipTests=true

start:
	@echo "------------------ START -----------------"
	docker-compose up -d

stop:
	@echo "------------------ STOP  -----------------"
	docker-compose down -d