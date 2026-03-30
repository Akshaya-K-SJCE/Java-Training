import java.util.*;
public class WordCount {
	public int wordcount(String s) {
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(i+1<s.length() && s.charAt(i+1)==' ' && s.charAt(i)!=' ') {
				c++;
			}
			if(i==s.length()-1 && s.charAt(i)!=' ') c++;
		}
		return c;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String s = sc.nextLine();
	WordCount w= new WordCount();
	System.out.print(w.wordcount(s));
}
}