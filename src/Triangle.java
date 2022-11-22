public class Triangle implements Drawable{

    public int a;
    public int b;
    public int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public void draw() {
        System.out.println("Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}');
    }
}
