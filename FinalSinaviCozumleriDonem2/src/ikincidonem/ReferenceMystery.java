package ikincidonem;
public class ReferenceMystery {
	public static void main(String[] args) {
        int a =2 ;
        int b = 7;
        FinalSinaviCozumleri home = new FinalSinaviCozumleri(47,122);
        mystery(a,b,home);
        System.out.println(a+ " "+b+" "+home);
        home.lng+=b;
        a = a*2;
        mystery(a,b,home);
        System.out.println(a+ " "+b+" "+home);
	}
	public static void mystery(int a, int b, FinalSinaviCozumleri loc) {
		loc.lat=loc.lng-10;
		b--;
       System.out.println(a+ " "+b+" "+loc);
	}
}
