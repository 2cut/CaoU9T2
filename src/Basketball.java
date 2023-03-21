public class Basketball extends Balls {
    private int bounciness;
    public Basketball(int size, String color, boolean isClean, int bouncieness) {
        super(size,color,isClean);
        this.bounciness=bouncieness;
    }
    public void pumpAir() {
        System.out.println("The ball has been pumped");
    }

}
