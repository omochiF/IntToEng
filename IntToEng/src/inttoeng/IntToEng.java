package inttoeng;
import java.util.Scanner;

public class IntToEng {
	static String[] num = {"","one","two","three","four","five",
			"six","seven","eight","nine","ten","eleven",
			"twelve","thirteen","fourteen","fifteen","sixteen",
			"seventeen","eighteen","nineteen"};
	static String[] tens = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	
    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    public static String translateEng(int n){
    	
    	// 0の場合
    	if(n == 0) return "zero";
    	
    	StringBuffer sb = new StringBuffer();
    	
    	//1000の位
    	if(n>=1000) {
    		one2hund(n/1000, sb);
    		sb.append(" thousand");
    		if(n%1000 != 0 && !sb.equals("")) sb.append(" ");
    		n %= 1000;
    	}
    	one2hund(n, sb);
    	return sb.toString();
    }
    
    public static void one2hund(int n, StringBuffer sb) {
    	//100の位
    	if(n>=100) {
    		sb.append(num[n/100] + " hundred");
    		if(n%100 != 0 && !sb.equals("")) sb.append(" ");
    		n %= 100;
    	}

    	// 10の位
    	sb.append(tens[n/10]);
    	
    	// 11~19
    	if(10 <= n && n < 20) sb.append(num[n]);
    	else { // 1の位
    		if(n%10 != 0 && !sb.equals("")) sb.append(" ");
    		sb.append(num[n%10]);
    	}
    }
}