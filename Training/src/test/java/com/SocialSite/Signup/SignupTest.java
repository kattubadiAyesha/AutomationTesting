

package com.SocialSite.Signup;

public class SignupTest {

    public static void main(String[] args) {

        Signup sin = new Signup();



        String name = sin.name("john");
        if (name.equals("john")) {
            System.out.println("Testcase passed: Name is John");
        } else {
            System.out.println("Testcase failed: Name is not John");
        }


        String surname = sin.SurName("james");
        if (surname.equals("games")) {
            System.out.println("Testcase passed: Surname : james");
        } else {
            System.out.println("Testcase failed: Surname is not james");
        }



        String DOb = sin.DOB("15-08-2001");

        if (DOb.equals("15-08-2001")) {
            System.out.println("Testcase passed: Date of Birth : 15-08-2001");
        } else {
            System.out.println("Testcase failed: Date of Birth is incorrect");
        }

        long mobileno = sin.MobileNo(93787377);  // Use a long to store the mobile number
        if (mobileno == 76484939L) {  // Compare with a long value
            System.out.println("Testcase passed: Mobile number is correct");
        } else {
            System.out.println("Testcase failed: Mobile number is incorrect");
        }
    }
}
