import peg.Peg;
import peg.SquarePeg;

public class SquarePegAdapter implements Peg {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public int getRadius() {
        return (int) Math.sqrt(Math.pow(squarePeg.getSide(), 2) * 2);
    }
}
