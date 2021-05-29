import hole.RoundHole;
import peg.RoundPeg;
import peg.SquarePeg;

public class DemoApp {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg smallPeg = new RoundPeg(4);
        System.out.println(hole.fits(smallPeg));

        RoundPeg largePeg = new RoundPeg(14);
        System.out.println(hole.fits(largePeg));

        SquarePeg squarePeg = new SquarePeg(14);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(hole.fits(squarePegAdapter));
    }
}
