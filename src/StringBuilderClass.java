public class StringBuilderClass {
    public static void main(String[] args) {
//        String name = "Nahun"
//        String fullName = name + " Acuna";
//        System.out.println(fullName);

        StringBuilder sb = new StringBuilder(); // empty

        StringBuilder sb2 = new StringBuilder(50);

        StringBuilder sb3 = new StringBuilder("Hello");

//        System.out.println(sb);
//        System.out.println(sb2);

        sb3.append(" World");
        sb3.insert(5, "Java");
        sb3.delete(0, 5);

        sb3.deleteCharAt(0);

        sb3.replace(0, 4, "Hi  ");

        sb3.reverse();

//        var test = sb3.toString();

        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        System.out.println(sb3);
    }
}
