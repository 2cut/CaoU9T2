public class SoccerBall extends Balls {
    private boolean broken;
    public SoccerBall(int size, String color, boolean isClean, boolean broken) {
        super(size,color,isClean);
        this.broken = broken;
    }
    public void fixBall() {
        System.out.println("The ball has been fixed");
    }
}
