import java.util.EnumSet;

enum Permission {
    READ, WRITE, EXECUTE, DELETE
}

class User {
    private String username;
    private EnumSet<Permission> permissions;

    // constructor
    public User(String username) {
        this.username = username;
        this.permissions = EnumSet.noneOf(Permission.class);
    }

    public void grantPermission(Permission permission) {
        this.permissions.add(permission);
        System.out.println("Granted " + permission + " to " + username);
    }

    public void revokePermission(Permission permission) {
        this.permissions.remove(permission);
        System.out.println("Revoked " + permission + " to " + username);
    }

    public boolean hasPermission(Permission permission) {
        return this.permissions.contains(permission);
    }

    public void showPermissions(Permission permission) {
        System.out.println(username + "'s permissions: " + this.permissions);
    }
}

public class EnumSetClass {
    public static void main(String[] args) {

    }
}