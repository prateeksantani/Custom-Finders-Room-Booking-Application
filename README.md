
# Spring Boot Room Booking Application

This is a Spring Boot project for a simple room booking application. It includes controller and service classes, as well as custom finders for retrieving room information. This README provides an overview of the project and its components.

## Table of Contents
- [Controller Classes](#controller-classes)
- [Service Class](#service-class)
- [IRoomRepo Interface](#iroomrepo-interface)
- [Endpoints](#endpoints)

## Controller Classes
The `RoomController` class handles HTTP requests and contains the following endpoints for managing rooms:

- `POST /room`: Add a single room.
- `POST /rooms`: Add multiple rooms.
- `GET /rooms`: Retrieve a list of all rooms.
- `GET /rooms/id/{id}`: Retrieve a room by ID.
- `GET /rooms/price/{price}`: Retrieve rooms by price.
- `GET /rooms/price/{price}/and/available`: Retrieve available rooms with a price less than or equal to the specified price.
- `GET /rooms/price/{price}/or/available`: Retrieve available rooms with a price less than or equal to the specified price.
- `GET /rooms/AC/or/available`: Retrieve available rooms with AC, sorted by price.
- `DELETE /rooms/ids`: Delete multiple rooms by ID.

## Service Class
The `RoomService` class provides business logic for handling room-related operations. It interacts with the repository and includes the following methods:

- `addRoom`: Add a room.
- `getRooms`: Retrieve all rooms.
- `addRooms`: Add multiple rooms.
- `getRoomById`: Retrieve a room by ID.
- `removeRooms`: Remove multiple rooms by ID.
- `getRoomByPrice`: Retrieve rooms by price.
- `getAvailableRoomsBelowPrice`: Retrieve available rooms with a price less than or equal to the specified price.
- `getAvailableRoomsOrBelowPrice`: Retrieve available rooms with a price less than or equal to the specified price.
- `getAvailableRoomsOrAcSortedByPrice`: Retrieve available rooms with AC, sorted by price.

## IRoomRepo Interface
The `IRoomRepo` interface extends `CrudRepository` and defines custom finders for querying room data. It includes the following methods:

- `findByRoomPrice`: Retrieve rooms by price.
- `findByRoomPriceLessThanEqualAndRoomAvailable`: Retrieve available rooms with a price less than or equal to the specified price.
- `findByRoomPriceLessThanEqualOrRoomAvailable`: Retrieve available rooms with a price less than or equal to the specified price.
- `findByRoomTypeOrRoomAvailableOrderByRoomPrice`: Retrieve available rooms with AC, sorted by price.

## Endpoints
Here's a summary of the available endpoints:

- **POST /room**: Add a room to the system.
- **POST /rooms**: Add multiple rooms to the system.
- **GET /rooms**: Retrieve a list of all rooms.
- **GET /rooms/id/{id}**: Retrieve a room by its ID.
- **GET /rooms/price/{price}**: Retrieve rooms by price.
- **GET /rooms/price/{price}/and/available**: Retrieve available rooms with a price less than or equal to the specified price.
- **GET /rooms/price/{price}/or/available**: Retrieve available rooms with a price less than or equal to the specified price.
- **GET /rooms/AC/or/available**: Retrieve available rooms with AC, sorted by price.
- **DELETE /rooms/ids**: Delete multiple rooms by their IDs.


