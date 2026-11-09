

classDiagram

&#x20;   class Venue {

&#x20;       +Long id

&#x20;       +String name

&#x20;       +String building

&#x20;       +String address

&#x20;       +int capacity

&#x20;       +String equipments

&#x20;       +VenueStatus status

&#x20;       +LocalDateTime createdAt

&#x20;   }



&#x20;   class VenueBooking {

&#x20;       +Long id

&#x20;       +Long venueId

&#x20;       +Long eventId

&#x20;       +Long clubId

&#x20;       +String requestedBy

&#x20;       +LocalDateTime startDate

&#x20;       +LocalDateTime endDate

&#x20;       +BookingStatus status

&#x20;       +LocalDateTime createdAt

&#x20;   }



&#x20;   class VenueStatus {

&#x20;       <<enumeration>>

&#x20;       ACTIVE

&#x20;       MAINTENANCE

&#x20;       CLOSED

&#x20;   }



&#x20;   class BookingStatus {

&#x20;       <<enumeration>>

&#x20;       CONFIRMED

&#x20;       RELEASED

&#x20;   }



&#x20;   Venue "1" --> "0..\*" VenueBooking : bookings

&#x20;   Venue --> VenueStatus

&#x20;   VenueBooking --> BookingStatus



