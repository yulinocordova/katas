package test;

import java.util.*;

public class DecodeTheMorseCode {
	
	
	public static void main (String [] arg) {
		
		System.out.println(operacion("5"));
	}
	
	public static String operacion (String morseCode) {
		 StringBuilder sb = new StringBuilder();
	        for (String code : morseCode.trim().replace("   ", " / ").split(" "))
	            sb.append(code.equals("/") ? " " : MorseCode(code));
	        return sb.toString();
		
	}
	
	
	public static String MorseCode (String toEncode)  
    {  
		
		
        String morse = toEncode;  
        
        if (toEncode.equalsIgnoreCase("a"))  
            morse = ".-";  
        if (toEncode.equalsIgnoreCase("b"))  
            morse = "-...";  
        if (toEncode.equalsIgnoreCase("c"))  
            morse = "-.-.";  
        if (toEncode.equalsIgnoreCase("d"))  
            morse = "-..";  
        if (toEncode.equalsIgnoreCase("e"))  
            morse = ".";  
        if (toEncode.equalsIgnoreCase("f"))  
            morse = "..-.";  
        if (toEncode.equalsIgnoreCase("g"))  
            morse = "--.";  
        if (toEncode.equalsIgnoreCase("h"))  
            morse = "....";  
        if (toEncode.equalsIgnoreCase("i"))  
            morse = "..";  
        if (toEncode.equalsIgnoreCase("j"))  
            morse = ".---";  
        if (toEncode.equalsIgnoreCase("k"))  
            morse = "-.-";  
        if (toEncode.equalsIgnoreCase("l"))  
            morse = ".-..";  
        if (toEncode.equalsIgnoreCase("m"))  
            morse = "--";  
        if (toEncode.equalsIgnoreCase("n"))  
            morse = "-.";  
        if (toEncode.equalsIgnoreCase("o"))  
            morse = "---";  
        if (toEncode.equalsIgnoreCase("p"))  
            morse = ".--.";  
        if (toEncode.equalsIgnoreCase("q"))  
            morse = "--.-";  
        if (toEncode.equalsIgnoreCase("r"))  
            morse = ".-.";  
        if (toEncode.equalsIgnoreCase("s"))  
            morse = "...";  
        if (toEncode.equalsIgnoreCase("t"))  
            morse = "-";  
        if (toEncode.equalsIgnoreCase("u"))  
            morse = "..-";  
        if (toEncode.equalsIgnoreCase("v"))  
            morse = "...-";  
        if (toEncode.equalsIgnoreCase("w"))  
            morse = ".--";  
        if (toEncode.equalsIgnoreCase("x"))  
            morse = "-..-";  
        if (toEncode.equalsIgnoreCase("y"))  
            morse = "-.--";  
        if (toEncode.equalsIgnoreCase("z"))  
            morse = "--..";  
        if (toEncode.equalsIgnoreCase("0"))  
            morse = "-----";  
        if (toEncode.equalsIgnoreCase("1"))  
            morse = ".----";  
        if (toEncode.equalsIgnoreCase("2"))  
            morse = "..---";  
        if (toEncode.equalsIgnoreCase("3"))  
            morse = "...--";  
        if (toEncode.equalsIgnoreCase("4"))  
            morse = "....-";  
        if (toEncode.equalsIgnoreCase("5"))  
            morse = ".....";  
        if (toEncode.equalsIgnoreCase("6"))  
            morse = "-....";  
        if (toEncode.equalsIgnoreCase("7"))  
            morse = "--...";  
        if (toEncode.equalsIgnoreCase("8"))  
            morse = "---..";  
        if (toEncode.equalsIgnoreCase("9"))  
            morse = "----.";  
        if (toEncode.equalsIgnoreCase("."))  
            morse = ".-.-";  
        if (toEncode.equalsIgnoreCase(","))  
            morse = "--..--";  
        if (toEncode.equalsIgnoreCase("?"))  
            morse = "..--..";  

        return morse;  
    }  

 /*
	
	private ArrayList<Letter> morseCodeAlphabet = new ArrayList<Letter>() {
       
            add(new Letter(new char[]{'.', '-'}));               //A 
            add(new Letter(new char[]{'-', '.', '.', '.'}));     //B
            add(new Letter(new char[]{'-', '.', '-', '.'}));     //C
            add(new Letter(new char[]{'-', '.', '.'}));          //D
            add(new Letter(new char[]{'.'}));                    //E
            add(new Letter(new char[]{'.', '.', '-', '.'}));     //F
            add(new Letter(new char[]{'-', '-', '.'}));          //G
            add(new Letter(new char[]{'.', '.', '.', '.'}));     //H
            add(new Letter(new char[]{'.', '.'}));               //I
            add(new Letter(new char[]{'.', '-', '-', '-'}));     //J
            add(new Letter(new char[]{'-', '.', '-'}));          //K
            add(new Letter(new char[]{'.', '-', '.', '.'}));     //L
            add(new Letter(new char[]{'-', '-'}));               //M
            add(new Letter(new char[]{'-', '.'}));               //N
            add(new Letter(new char[]{'-', '-', '-'}));          //O
            add(new Letter(new char[]{'.', '-', '-', '.'}));     //P
            add(new Letter(new char[]{'-', '-', '.', '-'}));     //Q
            add(new Letter(new char[]{'.', '-', '.'}));          //R
            add(new Letter(new char[]{'.', '.', '.'}));          //S
            add(new Letter(new char[]{'-'}));                    //T
            add(new Letter(new char[]{'.', '.', '-'}));          //U
            add(new Letter(new char[]{'.', '.', '.', '-'}));     //V
            add(new Letter(new char[]{'.', '-', '-'}));          //W
            add(new Letter(new char[]{'-', '.', '.', '-'}));     //X 
            add(new Letter(new char[]{'-', '.', '-', '-'}));     //Y
            add(new Letter(new char[]{'-', '-', '.', '.'}));     //Z
            
            add(new Letter(new char[]{'.', '-', '-', '-', '-'}));//1
            add(new Letter(new char[]{'.', '.', '-', '-', '-'}));//2
            add(new Letter(new char[]{'.', '.', '.', '-', '-'}));//3
            add(new Letter(new char[]{'.', '.', '.', '.', '-'}));//4
            add(new Letter(new char[]{'.', '.', '.', '.', '.'}));//5
            add(new Letter(new char[]{'-', '.', '.', '.', '.'}));//6
            add(new Letter(new char[]{'-', '-', '.', '.', '.'}));//7
            add(new Letter(new char[]{'-', '-', '-', '.', '.'}));//8
            add(new Letter(new char[]{'-', '-', '-', '-', '.'}));//9
            add(new Letter(new char[]{'-', '-', '-', '-', '-'}));//0


        }
   */
	
	
}
