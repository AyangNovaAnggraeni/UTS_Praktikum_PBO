package HotelReservation;

public class Customer extends UserBase {
    private String username;
    private Room bookedRoom;

    public Customer(String username) {
        this.username = username;
    }

    @Override
    public void login() {
        System.out.println("Customer " + username + " logged in!");
    }

    @Override
    public void viewDetails() {
        if (bookedRoom != null) {
            System.out.println("Customer " + username + " booked room " + bookedRoom.getRoomNumber() + " (" + bookedRoom.getType() + ") for $" + bookedRoom.getPrice() + ".");
        } else {
            System.out.println("No booking found for " + username + ".");
        }
    }

    public void bookRoom(Room room) {
        if (room.isBooked()) {
            System.out.println("Room " + room.getRoomNumber() + " is already booked.");
        } else {
            bookedRoom = room;
            room.setBooked(true);
            System.out.println("Room " + room.getRoomNumber() + " successfully booked for " + username + ".");
            System.out.println("Room Number: " + bookedRoom.getRoomNumber());
            System.out.println("Room Type: " + bookedRoom.getType());
            System.out.println("Price: $" + bookedRoom.getPrice());
        }
    }

    public void checkRoomAvailability(Room room) {
        if (!room.isBooked()) {
            System.out.println("Room " + room.getRoomNumber() + " is available.");
        } else {
            System.out.println("Room " + room.getRoomNumber() + " is already booked.");
        }
    }

    public Room getBookedRoom() {
        return bookedRoom;
    }

    String getName() {
        return username;
    }
}
