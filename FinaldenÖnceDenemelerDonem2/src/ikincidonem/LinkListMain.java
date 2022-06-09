package ikincidonem;
public class LinkListMain {
	private Link front;
	private Link current;
	
	private class Link{
	private Link next;
	private int data;

	Link(int veri){
	data = veri;
	next = null;
	}
	}

	public void add(int deger){
	Link n = new Link(deger);
	if(front == null) { // liste boş
		current = n;
		front = n;
	}
	else{ // bir sonraki elemanı ekleriz
		current.next = n; // sonraki elemanı gösterir
		current = n;
	}
}

	public void remove(int r){
	Link d = front; Link onceki = null;
	// d, başlangıç node, onceki ise silindiğinde
	// bir önceki ile silindikten sonraki nodeyi bağlamak için

	while(d != null){
	if(d.data == r){
	if(front.data == r){ // eğer root silinecekse özel durumdur
		front = d.next;
	break;
	}
	onceki.next = d.next; // normal nodelar silinirken
	d = d.next;
	break;
	}
	
	else { 
		onceki = d; d = d.next; } // bir sonraki nodeye geç
	}
	}

	public void print(){
		Link current = front;
		while(current != null){
		System.out.print(current.data + " ");
		current = current.next;
		}
		}
	}

