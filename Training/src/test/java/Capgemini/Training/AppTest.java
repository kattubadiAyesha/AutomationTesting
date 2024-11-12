package Capgemini.Training;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     * 
     */

		public static void main(String[] args) {
			//System.out.println("Hello World!");
			App app=new App();
			String regex="^(.+)@(.+)$";
			String email=app.userEmail("dhcdb@gmail.com");
			Pattern pattern=Pattern.compile(regex);
			Matcher match=pattern.matcher(email);
			System.out.println("IS IT MATCH::"+match.matches());
			System.out.println(email);
			int pwd=app.userPassword(47373);
			System.out.println(pwd);
			app.login();
			
		}
}


