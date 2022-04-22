package ikincidonem;

public class Account {
        String isim ;
        int para ;
		Account(String isim, int para) {
			this.isim = isim;
			this.para = para;
		}
		
		public String toString() {
			return   isim + " : $" + para ;
		}
        
}


// 
