package Denemeler2;
import java.util.Scanner;
public class Anas_Almaqtari_Denemeler34 {

	public static void main(String[] args) {
		/* Yuvraj Singh
		Harbhajan Singh
		Gurjit Singh
		Sandeep Singh
		Milkha Singh */
		
		
		String str[] =  
			{  
			"Praveen Kumar",  
			"Yuvraj Singh",  
			"Harbhajan Singh",  
			"Gurjit Singh",  
			"Virat Kohli",  
			"Rohit Sharma",  
			"Sandeep Singh",  
			"Milkha Singh"  
			};  
			  
			String surName = "Singh";  
			int surNameSize = surName.length(); //5 
			  
			int size = str.length;  
			  
			for(int j = 0; j < size; j++)  //8
			{  
			    int length = str[j].length();  
			 // soyadını çıkarıyoruz
			    String subStr = str[j].substring(length - surNameSize);  
			      
			    if(subStr.equals(surName))  
			    {  
			        System.out.println(str[j]);  
			    }  
			}  
			  
			}  
			}

