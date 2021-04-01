package abstract_factory;

public class Class1 extends ClassRoom {

    @Override
    public Teacher getTeacher() {
        return new Kobi();
    }

    @Override
    public Admin getAdmin() {
        return new Gilad();
    }
}
