package builder;

public class Player {

    private int id;
    private String first_name;
    private String last_name;
    private int shirt_number;

    public static Player build() {
        return new Player();
    }

    public Player setId(int id) {
        this.id = id;
        return this;
    }

    public Player setFirstName(String first_name) {
        this.first_name= first_name;
        return this;
    }

    public Player setLastName(String last_name) {
        this.last_name= last_name;
        return this;
    }

    public Player setShirt(int shirt_number) {
        this.shirt_number = shirt_number;
        return this;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", shirt_number=" + shirt_number +
                '}';
    }
}
