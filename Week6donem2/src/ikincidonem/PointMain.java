package ikincidonem;
import java.util.*;
public class PointMain {

	public static void main(String[] args) {
     Set<Point> points = new HashSet<Point>();
     Set<Integer> intss = new HashSet<Integer>();
     
     Point p2 = new Point(6,8);
     points.add(p2);
     points.add(new Point(3,4));
     points.add(new Point(3,4));
     points.add(new Point(5,7));
     System.out.println(points);
     
	 for(Point p : points)
		 System.out.println("("+p.getX()+","+p.getY()+")");
	/* 
	  output :
	[ikincidonem.Point@5b480cf9, ikincidonem.Point@6f496d9f, ikincidonem.Point@3feba861, ikincidonem.Point@5f184fc6]
	 (3,4)
	 (5,7)
	 (3,4)
     (6,8)
*/
	}
}
