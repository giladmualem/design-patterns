package singleton;

public class MySingletonEagerly {
    private int x =(int)(Math.random()*101);
    private static MySingletonEagerly instance = new MySingletonEagerly();

    private MySingletonEagerly() {
        System.out.println(getClass().getName()+" CTOR IN ACTION");
    }

    public static MySingletonEagerly getInstance() {
        return instance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "singleton.MySingletonEagerly{" +
                "x=" + x +
                '}';
    }
}
