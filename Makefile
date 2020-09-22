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

start-kafka-schema-registry:
	docker run -d --name schema-registry -p 8181:8181 --link  fiap-fase06-grupo10-zookeeper: fiap-fase06-grupo10-zookeeper --link kafka:kafka confluent/schema-registry

stop:
	@echo "------------------ STOP  -----------------"
	docker-compose down -d