package singleton;

public class MySingletonLazily {
    private int x =(int)(Math.random()*101);
    private static MySingletonLazily instance =null;

    private MySingletonLazily() {
        System.out.println(getClass().getName()+" CTOR IN ACTION");
    }

    public static MySingletonLazily getInstance() {
        if(instance==null){
            instance=new MySingletonLazily();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "MySingletonLazily{" +
                "x=" + x +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
