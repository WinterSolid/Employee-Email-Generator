package Emailapp;

import java.util.Scanner;

public class Email {

 private String firstname;
 private String lastname;
 private String password;
 private String department;
 private int mailboxcap;
 private String alteremail;

 //Constructor for First name. Constructor for last name.
 public Email(String firstname,String lastname){
  this.firstname = firstname;
  this.lastname = lastname;
 System.out.println("Email created for: "+ firstname+" "+lastname);
 }
//constructor aking for Department
 private String setdepartment();
 System.out.print("What is the employees department?\nEnter # for Department:\n0 for no specific department\n1 for Development\n2 for Sales\n3 for HR\n4 for Public Safety");
  Scanner in = new Scanner(System.in);
  int Departchoice = in.nextInt();

  this.department = setdepartment();


   if (Departchoice == 1){return "Department(Development)";
   }
   else if (Departchoice == 2){ return "department(Sales)";
   }
   else if (Departchoice == 3){return "department(HR)";
   }
   else if (Departchoice == 4){return "department(Public Safety)";
   }
   else (Departchoice == 0){ return "department(No specific)";
 }


 // Constructor for random password.



 //Constructor for capacity of mailbox

 //Constructor for alternative email.

}
