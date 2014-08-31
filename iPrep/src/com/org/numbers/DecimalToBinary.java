package com.org.numbers;


public class DecimalToBinary {
	 
    public void printBinaryFormat(int number){
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.println(binary[i]);
        }
    }
     
    public static void main(String a[]){
        DecimalToBinary dtb = new DecimalToBinary();
        dtb.printBinaryFormat(13);
        dtb.printBinaryFormat2(13);
    }
    
    
    
    public void printBinaryFormat2(int number){     
        String s ="";
       for(int i = 0;i<=8;i++){
          if(number%2==1){
       	   s=1+s;
          }
          if(number%2==0){
       	   s=0+s;
          }
          number=number/2;    
       }
       System.out.println(s);
   }
}