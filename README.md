# com.springboot.elasticsearch
Spring boot, swagger, maven, Junit and elastic search.

## About the application :
- Spring boot
- Database : elastic search
- Project building : maven
- Framework : Spring, swagger

## Es server :
- Elastic search server : localhost
- Es port : 9300
- ES Version : 6.2.3 or UP 
- cluster-name : elasticsearch
- cluster-nodes : localhost:9300
 
## Spring boot server
- Url : localhost
- Port : 8081
- Swagger (to show method exposed on the WS)

## Run project 
1. Download ES on : https://www.elastic.co/fr/downloads/past-releases/elasticsearch-6-2-3
2. Extract elasticsearch-6-2-3.zip
3. Goto elasticsearch-6-2-3\bin
4. Run ES : execute ./elasticsearch.bat
5. Check if ES is UP : run on postman or CURL -> http://localhost:9200/_cat/indices?v
6. Run EsApplication as Spring Boot Application
7. Goto http://localhost:8081/swagger-ui.html, then you can create/find/delete you're index.
