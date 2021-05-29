package peg;

public class RoundPeg implements Peg {
    private final int radius;

    public RoundPeg(int radius) {
        this.radius = radius;
    }

    @Override
    public int getRadius() {
        return radius;
    }
}
