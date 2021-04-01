package adapter;

public class Text {
    public static void main(String[] args) {
        ShinyNewBox p1=new ShinyNewBox();
        System.out.println(p1);
        p1.setCharger(new CustomAdapter());
        System.out.println(p1);

    }
}
