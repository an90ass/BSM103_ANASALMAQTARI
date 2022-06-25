package ikincidonem;

public class FinalSinaviCozumleri2 {
		// SortSentence

 public String SortSentence(String s) {
	 String[] array = s.split("");
	 String[] result = new String[array.length];
	 for(String element : array) {
		 result[Character.getNumericValue(element.charAt(element.length()-1)-1)]=element.substring(0,element.length()-1);
	 }
	 String outPut = "";
	 for(String element : result) {
		 outPut += " "+element;
	 }
	 
	 
	 return outPut.substring(1);
 }}