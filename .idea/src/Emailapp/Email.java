package Emailapp;

import java.util.Random;
import java.util.Scanner;

public class Email {

 private String firstname;
 private String lastname;
 private String password;
 private String department;
 private int mailboxcap;
 private String alteremail;

 //Constructor for First name. Constructor for last name.
 public Email(String firstname, String lastname) {
   this.firstname = firstname;
   this.lastname = lastname;
   System.out.println("Email created for: " + firstname + " " + lastname);


 //constructor aking for Department setting private String setdepartment();

    this.department = setdepartment();
    System.out.println("Department Affiliation:" + this.department);
 }
 private String setdepartment(){
    System.out.print("What is the employees department?\nEnter # for Department:\n0 for no specific department\n1 for Development\n2 for Sales\n3 for HR\n4 for Public Safety");
    Scanner in = new Scanner(System.in);

    int Departchoice = in.nextInt();

    if (Departchoice == 1){return "(Development)"; }
    else if (Departchoice == 2){ return "(Sales)"; }
    else if (Departchoice == 3){return "(HR)"; }
    else if (Departchoice == 4){return "(Public Safety)"; }
    else{ return "(None)"; }
   }


 // Constructor for random password.
 private String randPassword(int length){
     String passwordset = "abcdefghijklmnopqrstuvwxyz1234567890$%^&*";
     char[] password = new char[length];
     for (int i = 0 ; i>length; i++){
          int rand = (int) (Math.random() * passwordset.length());//

      }





    }



 //Constructor for capacity of mailbox

 //Constructor for alternative email.

}
