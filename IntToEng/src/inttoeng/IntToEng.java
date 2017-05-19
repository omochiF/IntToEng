package inttoeng;
import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    public static String OneToNine(int n){
    	String s ="";
    	switch(n) {
    	case 1: s += "one"; break;
    	case 2: s += "two"; break;
    	case 3: s += "three"; break;
    	case 4: s += "four"; break;
    	case 5: s += "five"; break;
    	case 6: s += "six"; break;
    	case 7: s += "seven"; break;
    	case 8: s += "eight"; break;
    	case 9: s += "nine"; break;
    	}
    	return s;
    }
    
    
    // 数値を英訳する変換するメソッド
    public static String translateEng(int n) {
    	String s = "";
    	//0のとき
    	if(n == 0) return "zero";
    	
    	//100の位
    	if(n >= 100){
    		s += OneToNine(n/100) + " hundred";
    		//100の位と10の位の間の空白
    		if(n%100 != 0) s+= " ";
    		n = n%100;
    	}

    	//10~19までのとき
       	if(10 <= n && n <= 19){
       		switch(n) {

       		case 10: s += "ten"; break;
       		case 11: s += "eleven"; break;
       		case 12: s += "twelve"; break;
       		case 13: s += "thirteen"; break;
       		case 14: s += "fourteen"; break;
       		case 15: s += "fifteen"; break;
       		case 16: s += "sixteen"; break;
       		case 17:s += "seventeen"; break;
       		case 18: s += "eighteen"; break;
       		case 19: s += "nineteen"; break;
       		}
       		return s;
       	}
       	
    	//10の位
       	int num = n/10;
    	switch(num) {
    	case 2: s += "twenty"; break;
    	case 3: s += "thirty"; break;
    	case 4: s += "fourty"; break;
    	case 5: s += "fifty"; break;
    	case 6: s += "sixty"; break;
    	case 7: s += "seventy"; break;
    	case 8: s += "eighty"; break;
    	case 9: s += "ninety"; break;
    	}
    	//10の位と1の位の間の空白
    	if(n > 20 && n%10 != 0) s+= " ";
    	
    	//1の位
    	s += OneToNine(n%10);
 
    	return s;
    }
}