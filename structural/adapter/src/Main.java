import adapters.SquarePegAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

public class Main
{
	public static void main(String[] args)
	{
		RoundHole roundHole = new RoundHole(5);
		RoundPeg roundPeg = new RoundPeg(5);

		if (roundHole.fits(roundPeg))
		{
			System.out.println("Round peg with radius 5 fits into round hole with radius 5!");
		}

		SquarePeg squarePegSmall = new SquarePeg(2);
		SquarePeg squarePegBig = new SquarePeg(20);

		//roundHole.fits(squarePegSmall)
		SquarePegAdapter squarePegAdapterSmall = new SquarePegAdapter(squarePegSmall);
		SquarePegAdapter squarePegAdapterBig = new SquarePegAdapter(squarePegBig);

		if (roundHole.fits(squarePegAdapterSmall))
		{
			System.out.println("Square peg with width 2 fits into round hole with radius 5!");
		}

		if (!roundHole.fits(squarePegAdapterBig))
		{
			System.out.println("Square peg with width 20 doesn't fit into round hole with radius 5!");
		}
	}
}
