package ikincidonem;

import java.util.ArrayList;

public class KisiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Kisi> biryeler = new ArrayList<>();
     biryeler.add(new Kisi("Ahmed",34));
     biryeler.add(new Kisi("Anas",20));
     biryeler.add(new Kisi("ALmaqtari",40));
     for(Kisi birey : biryeler) {
    	 System.out.println("Isim:"+birey.getIsim()+" , "+ "yas:"+birey.getYas() );
    	 
     }
	}

}
