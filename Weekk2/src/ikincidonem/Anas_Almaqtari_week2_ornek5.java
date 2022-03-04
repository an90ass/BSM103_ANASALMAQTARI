package ikincidonem;

public class Anas_Almaqtari_week2_ornek5 {

	public static void main(String[] args) {
	//Bir tamsayıyı parametre olarak kabul eden ve onun ikili gösterimini konsola yazan writeBinary adında yinelemeli bir yöntem yazın
        writeBinary(7);
	}
	public static void writeBinary(int n) {
	
	if (n < 0)
		throw new IllegalArgumentException();
	
		if (n >=2)
			writeBinary(n/2);
		System.out.print(n%2);
	}

}
