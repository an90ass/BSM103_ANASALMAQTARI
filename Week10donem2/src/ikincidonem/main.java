package ikincidonem;
public class main {
public static void main(String[] args) {
         LinkedIntList linkList = new LinkedIntList();
         linkList.add(2);
         linkList.add(10);
         linkList.add(15);
         System.out.println(linkList.toString());       
         System.out.println(linkList.indexOf(15));       
         linkList.remove(2);
         System.out.println(linkList.toString());
         
         linkList.add(0 ,50);
         System.out.println(linkList.toString());
         linkList.add(2 ,15);
         System.out.println(linkList.toString());
         
        int size = linkList.size();
         System.out.println(size);        
         
         
        }
               }

