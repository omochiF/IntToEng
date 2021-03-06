package inttoeng;
import java.util.Scanner;

public class IntToEng {
	static String[] num = {"","one","two","three","four","five",
			"six","seven","eight","nine","ten","eleven",
			"twelve","thirteen","fourteen","fifteen","sixteen",
			"seventeen","eighteen","nineteen"};
	static String[] tens = {"", "","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	
    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    public static String translateEng(int n){
    	
    	// 0の場合
    	if(n == 0) return "zero";
    	
    	String s = "";
    	
    	//1,000,000,000の位
    	if(n>=1000000000){
    		s += one2hund(n/1000000000);
    		s += " billion";
    		if(n%1000000000 != 0 && !s.equals("")) s += " ";
    		n %= 1000000000;
    	}
    	
    	//1,000,000の位
    	if(n>=1000000){
    		s += one2hund(n/1000000);
    		s += " million";
    		if(n%1000000 != 0 && !s.equals("")) s += " ";
    		n %= 1000000;
    	}
    	
    	//1000の位
    	if(n>=1000) {
    		s += one2hund(n/1000);
    		s += " thousand";
    		if(n%1000 != 0 && !s.equals("")) s += " ";
    		n %= 1000;
    	}
    	s += one2hund(n);
    	return s;
    }
    
    public static String one2hund(int n) {
    	String s = "";
    	//100の位
    	if(n>=100) {
    		s += num[n/100] + " hundred";
        	if(n%100 != 0 && !s.equals("")) s += " ";
    		n %= 100;
    	}

    	// 10の位
    	s += tens[n/10];
    	
    	// 10~19
    	if(10 <= n && n < 20) s += num[n];
    	else { // 1の位
    		if(n%10 != 0 && !s.equals("")) s += " ";
    		s += num[n%10];
    	}
    	return s;
    }
}