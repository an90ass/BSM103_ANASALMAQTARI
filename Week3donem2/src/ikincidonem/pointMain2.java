package ikincidonem;

public class pointMain2 {

	public static void main(String[] args) {
    
		Point2 pnt = new Point2();
		pnt.x = 3;
		pnt.y = 4;
		
		System.out.println("point = ("+pnt.x+" , "+pnt.y+") ");
		System.out.println("distane from orijin = "+ pnt.distanceFromOrigin () );
		

	}

}
