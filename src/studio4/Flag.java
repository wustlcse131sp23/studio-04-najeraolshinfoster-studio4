package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(Color.BLACK);
		double x = .5 ;
		double y = .5 ;
		double halfWidth = .5;
		double halfHeight = .25;
		StdDraw.rectangle(x,y,halfWidth,halfHeight);
		
		
		StdDraw.setPenRadius(.05);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(.5,.5,.15);

	}
}