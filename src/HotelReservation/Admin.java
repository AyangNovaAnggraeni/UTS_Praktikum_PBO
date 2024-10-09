package HotelReservation;

public class Admin extends UserBase {
    private Room room1;
    private Room room2;
    private Room room3;
    private Room room4;
    private Room room5;

    public Admin() {
        room1 = new Room(101, "Single", 100.0);
        room2 = new Room(102, "Double", 150.0);
        room3 = new Room(103, "Suite", 250.0);
        room4 = null;
        room5 = null;
    }

    @Override
    public void login() {
        System.out.println("Admin logged in successfully.");
    }

    public void viewRooms() {
        System.out.println("Available Rooms:");
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
        if (room4 != null) {
            System.out.println(room4);
        }
        if (room5 != null) {
            System.out.println(room5);
        }
    }

    public void addRoom(Room room) {
        if (room4 == null) {
            room4 = room;
        } else if (room5 == null) {
            room5 = room;
        } else {
            System.out.println("Cannot add more rooms. The maximum limit is reached.");
        }
    }

    @Override
    public void viewDetails() {
        viewRooms();
    }
}



