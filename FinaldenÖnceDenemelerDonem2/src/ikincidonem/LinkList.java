package ikincidonem;
public class LinkList {
	public static void main(String [] args)
	{
	int[] nums = {31,2, 1,56,33,777,123,25,15,17,20,11,10,1,23,3};
	LinkListMain  list = new LinkListMain ();
	for(int i = 0; i < nums.length; i++) 
		list.add(nums[i]);
	
	list.print(); // listele
	list.remove(777); // 777 i sil
	System.out.println();
	list.print(); // tekrar listele
	}	
	}

