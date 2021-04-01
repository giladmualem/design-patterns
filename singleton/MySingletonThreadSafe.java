package singleton;
public class MySingletonThreadSafe {
    private int x = (int) (Math.random() * 101);
    private static MySingletonThreadSafe instance = null;

    private MySingletonThreadSafe() {
        System.out.println(getClass().getName() + " CTOR IN ACTION");
    }

    public static MySingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (MySingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new MySingletonThreadSafe();
                }
            }
        }
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
        return "MySingletonThreadSafe{" +
                "x=" + x +
                '}';
    }
}
