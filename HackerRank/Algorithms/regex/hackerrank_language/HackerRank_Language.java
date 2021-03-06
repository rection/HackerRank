package regex.hackerrank_language;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aakansha Doshi
 * 
 */
public class HackerRank_Language {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		int c = 0;
		while (T-- > 0) {
			String s = br.readLine().trim();
			if(check_Language(s))
				System.out.println("VALID");
			else
				System.out.println("INVALID");
		}
	}

	private static boolean check_Language(String s) {
		// TODO Auto-generated method stub
			String pat="\\s(C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA:ERLANG:CLISP:LUA:BRAINFUCK:"
                +"JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART:GROOVY:OBJECTIVEC){1}$";
        pat=pat.replace(':','|');
       // System.out.println(pat);
       	Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(s);
		return m.find();
	}
}
