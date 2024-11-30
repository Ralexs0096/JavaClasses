import java.util.EnumSet;

enum Permission {
    READ, WRITE, EXECUTE, DELETE
}

public class EnumSetClass {
    public static void main(String[] args) {
        EnumSet<Permission> userPermissions = EnumSet.of(Permission.READ, Permission.EXECUTE);

        System.out.println(userPermissions.contains(Permission.DELETE)); // false

        userPermissions.add(Permission.WRITE);
        System.out.println(userPermissions); // [READ, WRITE, EXECUTE]

        userPermissions.remove(Permission.READ);
        System.out.println(userPermissions); // [WRITE, EXECUTE]
    }
}