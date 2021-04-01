package prototype.deep;

import prototype.deep.Address;
import prototype.deep.Person;

public class Test {
    public static void main(String[] args) {
        Address a1 = new Address("holon", "habrosh", 5);
        Person p1 = new Person("gilad", a1);
        try {
            Person p2 = p1.clone();
            System.out.println(p1);
            System.out.println(p2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
