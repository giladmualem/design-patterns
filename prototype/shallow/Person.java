package prototype.shallow;

public class Person implements Cloneable{
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
