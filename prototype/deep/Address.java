package prototype.deep;

public class Address {
    private String sity;
    private String street;
    private int number;

    public Address(String sity, String street, int number) {
        this.sity = sity;
        this.street = street;
        this.number = number;
    }

    public Address(Address address) {
        this.sity=address.sity;
        this.street=address.street;
        this.number=address.number;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

//    @Override
//    public String toString() {
//        return "Address{" +
//                "sity='" + sity + '\'' +
//                ", street='" + street + '\'' +
//                ", number=" + number +
//                '}';
//    }
}
