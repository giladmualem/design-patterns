package builder;

public class Test {
    public static void main(String[] args) {
        Player p1=Player.build().setFirstName("Cristiano").setLastName("Ronaldo").setId(1).setShirt(7);
        System.out.println(p1);

    }
}
