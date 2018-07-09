package com.maopao.test;

public class MopaoTest {
	public static void main(String[] args) {
		int array[] = {11,2,5,82,7,0,4,89,72,42,16,34,58,23};  
		for(int i=0;i<array.length;i++){  
		    for(int j=0;j<array.length-1-i;j++){  
		        if(array[j] > array[j+1]){  
		            int temp = array[j];  
		            array[j] = array[j+1];  
		            array[j+1] = temp;  
		        }   
		    }  
		}  
		  
		for(int x:array){  
		    System.out.println(x);
		}	
	}
	
}
