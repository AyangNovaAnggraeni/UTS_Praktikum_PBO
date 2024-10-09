package HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== WELCOME TO MONTE-CARLO HOTEL ======");
        System.out.println();
        System.out.println("Login as :");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 1) {
            Admin admin = new Admin();

            System.out.println("1. Add Room");
            System.out.println("2. View Rooms");
            System.out.println("3. Exit");

            int adminChoice = scanner.nextInt();
            scanner.nextLine(); 

            if (adminChoice == 1) {
                System.out.println("Enter Room Number: ");
                int roomNumber = scanner.nextInt();
                scanner.nextLine(); 

                System.out.println("Enter Room Type (Single, Double, Suite): ");
                String roomType = scanner.nextLine();

                System.out.println("Enter Room Price: ");
                double roomPrice = scanner.nextDouble();
                scanner.nextLine();

                Room newRoom = new Room(roomNumber, roomType, roomPrice);
                admin.addRoom(newRoom);

                System.out.println("Room " + roomNumber + " has been successfully added.");
                admin.viewRooms();
            } else if (adminChoice == 2) {
                admin.viewRooms();
                System.out.println("Do you want to add a room? (1) Yes, (2) No");
                int addRoomChoice = scanner.nextInt();
                scanner.nextLine(); 

                if (addRoomChoice == 1) {
                    System.out.println("Enter Room Number: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.println("Enter Room Type (Single, Double, Suite): ");
                    String roomType = scanner.nextLine();

                    System.out.println("Enter Room Price: ");
                    double roomPrice = scanner.nextDouble();
                    scanner.nextLine(); 

                    Room newRoom = new Room(roomNumber, roomType, roomPrice);
                    admin.addRoom(newRoom);

                    System.out.println("Room added successfully!");
                    admin.viewRooms();
                } else {
                    System.out.println("Exiting the Admin view.");
                }
            } else if (adminChoice == 3) {
                System.out.println("Thank you!!");
            }

        } else if (choice == 2) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            Customer customer = new Customer(name);

            Room room1 = new Room(101, "Single", 100.0);
            Room room2 = new Room(102, "Double", 150.0);
            Room room3 = new Room(103, "Suite", 250.0);

            System.out.println("1. Check Room Availability");
            System.out.println("2. Book a room");
            System.out.println("3. View Booking Details");
            System.out.println("4. Exit");

            int customerChoice = scanner.nextInt();
            scanner.nextLine(); 

            if (customerChoice == 2) {
                System.out.println("Enter Room Number to Book: ");
                int roomNumber = scanner.nextInt();
                scanner.nextLine();
//                    
                     System.out.println("1. Check Room Availability");
                     System.out.println("2. Book a room");
                     System.out.println("3. View Booking Details");
                     System.out.println("4. Exit");

                     scanner.nextInt();
               
                    
                if (roomNumber == 101) {
                    customer.bookRoom(room1);
                } else if (roomNumber == 102) {
                    customer.bookRoom(room2);
                } else if (roomNumber == 103) {
                    customer.bookRoom(room3);
                } else {
                    System.out.println("Room not found.");
                }

            } else if (customerChoice == 1) {
                System.out.println("Available Rooms:");
                System.out.println(room1);
                System.out.println(room2);
                System.out.println(room3);

                System.out.println("Do you want to book a room? (1) Yes or (2) No");
                int bookChoice = scanner.nextInt();
                scanner.nextLine();

                if (bookChoice == 1) {
                    System.out.println("Enter Room Number to Book: ");
                    int roomNumber = scanner.nextInt();
                     scanner.nextLine(); 
//                    
                     System.out.println("1. Check Room Availability");
                     System.out.println("2. Book a room");
                     System.out.println("3. View Booking Details");
                     System.out.println("4. Exit");

                     scanner.nextInt();
                    
                    if (roomNumber == 101) {
                        customer.bookRoom(room1);
                    } else if (roomNumber == 102) {
                        customer.bookRoom(room2);
                    } else if (roomNumber == 103) {
                        customer.bookRoom(room3);
                    } else {
                        System.out.println("Room not found.");
                    }
                }
            } else if (customerChoice == 3) {
                customer.viewDetails();
            } else if (customerChoice == 4) {
                System.out.println("Thank you!!");
            }
        }

        scanner.close();
    }
}
