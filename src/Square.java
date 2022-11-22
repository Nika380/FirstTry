public class Square implements Drawable{
    public int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
