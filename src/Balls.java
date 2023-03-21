public class Balls {
    private int size;
    private String color;
    private boolean isClean;
    public Balls(int size, String color, boolean isClean) {
        this.size = size;
        this.color = color;
        this.isClean = isClean;
    }

    public void clean() {
        System.out.println("Squeak squeak, the ball is clean");
    }
}