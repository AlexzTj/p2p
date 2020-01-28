# P2P application demo

### Features
* Register new users
* Deposit money to user account
* Transfer money between users, using only user phone number

### How to use
1 Start the application, it will run server on localhost:8080
```
./gradlew run
```
2 Register at least 2 users, in response you will receive unique user id.
```
curl --data "{\"name\":\"Bill\",\"phone\":\"+49111\"}" localhost:8080/users
curl --data "{\"name\":\"Julia\",\"phone\":\"+49222\"}" localhost:8080/users
```
3 Deposit money to user accounts
```
curl --data "{\"userId\":$userId,\"amount\":200}" localhost:8080/deposits
curl --data "{\"userId\":$userId,\"amount\":200}" localhost:8080/deposits
```
4 Transfer money between accounts
```
curl --data "{\"senderPhone\":\"+49111\",\"recipientPhone\":\"+49222\",\"amount\":150}" localhost:8080/transfers
```