package dto;

public class RoundHole {
    private final int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public boolean fits(final Peg roundPeg) {
        return this.radius >= roundPeg.getRadius();
    }
}
