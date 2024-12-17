package oop;

public class Admin extends User {
    public Admin(String id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public void manageUsers(String action, User user) {
        switch (action.toLowerCase()) {
            case "add":
                System.out.println("User " + user.getUsername() + " added.");
                break;
            case "remove":
                System.out.println("User " + user.getUsername() + " removed.");
                break;
            case "update":
                System.out.println("User " + user.getUsername() + " updated.");
                break;
            default:
                System.out.println("Invalid action.");
        }
    }

    @Override
    public void authentificate(String password) {
        System.out.println("Authenticating admin...");
    }
}

