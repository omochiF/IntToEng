package inttoeng;
import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    public static String translateEng(int n) {
    	String s = "";
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
    	switch(n%10) {
    	case 0: s += "zero"; break;
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
    	switch(n) {
    	case 14: s += "four"; break;
    	case 16: s += "six"; break;
    	case 17:s += "seven"; break;
    	case 19: s += "nine"; break;
    	case 10: s += "ten"; break;
    	case 11: s += "eleven"; break;
    	case 12: s += "twelve"; break;
    	case 13: s += "thir"; break;
    	case 15: s += "fif"; break;
    	case 18: s += "eigh"; break;
    	}
    	if(n>10) s += "teen";
    	return s;
    }
}