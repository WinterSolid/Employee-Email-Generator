//package Emailapp;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Email {
//
//  private String firstname;
//  private String lastname;
//  private String password;
//  private String department;
//  private String email;
//  private String companySuffix = "starkindustries.com";
//  private int mailboxcap;
//  private int passwordlength = 16;
//  private String alteremail;
//
//  //Constructor for First name. Constructor for last name.
//  public Email(String firstname, String lastname) {
//    this.firstname = firstname;
//    this.lastname = lastname;
//    //System.out.println("Email created for: " + firstname + " " + lastname);
//
//
//    //call methods asking for Department setting private String setdepartment()and randompassword;
//    this.department = setdepartment();
//    //System.out.println("Department: " + this.department);
//
//    // email:  firstname.lastname@department.company.com.
//    email = firstname .toLowerCase()+"."+ lastname.toLowerCase() + "@" + department.toLowerCase()+"."+ companySuffix;
//   // System.out.println("Your Email is: " +  email);
//
//    this.password = randomPassword(passwordlength);
//    //System.out.println("Your Password is: " + this.password);
//
//    }
//
//  private String setdepartment(){
//    System.out.print("What is the employees department?\n" +
//            "Enter # for Department:\n0 for no specific department\n" +
//            "1 for Development\n2 " +
//            "for Sales\n" +
//            "3 for HR\n" +
//            "4 for Public Safety\n5 for Research\n ");
//    Scanner in = new Scanner(System.in);
//
//    int Departchoice = in.nextInt();
//
//    if (Departchoice == 1){return "Development"; }
//    else if (Departchoice == 2){ return "Sales"; }
//    else if (Departchoice == 3){return "HR"; }
//    else if (Departchoice == 4){return "Public Safety"; }
//    else if (Departchoice == 5){return "Research"; }
//    else{ return "(None)"; }
//    }
//
//  // Constructor for random password.
//  private String randomPassword(int length){
//     String passwordSet = "abcdefghijklmnopqrstuvwxyz1234567890)(*&^%$#@!";
//     char[] password = new char[length];
//     for (int i = 0 ; i<length; i++){
//          int randm = (int) (Math.random() * passwordSet.length());//import math lang"Math.random"
//          password[i] = passwordSet.charAt(randm);
//     }
//     return new String(password);
//
//  }
//
//
//   //Constructor for capacity of mailbox
//  public void setMailboxcap(int capacity){
//     this.mailboxcap = capacity;
//  }
//  public void setalteremail (String alteremail){
//     this.alteremail = alteremail;
//  }
//  public void setpassword (String password){
//    this.password = password;
//  }
//  public String getFirstname(){return firstname;}
//  public String getLastname() { return lastname; }
//  public String getPassword() {return password; }
//  public String getEmail() {return email; }
//  public int getMailboxcap() { return mailboxcap;}
//
//  public String ShowInfo(){
//    return "Name:              "+firstname.toUpperCase() + " "+lastname.toUpperCase()+
//    "\n" +"Email:    "+ email+"\n" +"Password:       "
//            + password+"\n"+"Mailbox Capacity:       " + mailboxcap;
//  }
//}
