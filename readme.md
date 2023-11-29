# CrickInformer Backend

This is my first Spring Boot Application about live cricket matches. It involves the APIs and web. This application gives you the data of live matches and their point table

## Endpoints

- http://localhost:8081/match/live : get live matches data
- http://localhost:8081/match/ : get all matches data
- http://localhost:8081/match/point-table : get point table of the match

## Usage

- `git clone https://github.com/anupamdas1511/CrickInformer-Backend.git`
- `cd CrickInformer-Backend`
- `mvn dependency:resolve`
- `mvn spring-boot:run`

The server will start listening to requests and you can request to given endpoints