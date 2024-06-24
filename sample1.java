//BANK MANAGEMENT SYSTEM

import java.io.*;
import java.util.*;

public class sample1{
public static void main(String[] args){
System.out.println("Enter you name and customer id");
BankAccount obj1=new BankAccount();
obj1.menu();
}   
}

class BankAccount{double bal=0;
double prevTrans=0;

public void deposit(double amount){
if(amount!=0){
bal+=amount;
prevTrans=amount;
}
}
public void withdraw(double amt){
if(amt!=0 && bal>=amt){
bal-=amt;
prevTrans=-amt;
}
else if(bal<amt){
System.out.println("Balance insufficient");
}
}
public void getPrevTrans(){
if(prevTrans>0){
System.out.println("Deposited>>"+prevTrans);
}
else if(prevTrans<0){
System.out.println("Withdrawn>>"+Math.abs(prevTrans));
}
else{
System.out.println("No transactions occured");
}
}
public void balance(){
if(bal<0){
    System.out.println("Insufficient balance");
}
else{
    System.out.println("The Account Balanc is>>"+bal);
}

}
public void menu(){
char options;
Scanner sc=new Scanner(System.in);
BankAccount s=new BankAccount();
String name=sc.next();
String customerid=sc.next();
System.out.println("Welcome "+name);
System.out.println("Your ID:"+customerid);
System.out.println("\n");
do{
System.out.println("a) Check Balance");
System.out.println("b) Deposit Amount");
 System.out.println("c) Withdraw Amount");
 System.out.println("d) Previous Transaction");
 System.out.println("e) Exit");

System.out.println("***************************************************");
System.out.println("Choose an Option");
options=sc.next().charAt(0);
System.out.println("\n");

switch(options){
case 'a':
System.out.println("'...............................");
s.balance();
System.out.println("................................");
System.out.println("\n");
break;

case 'b':
System.out.println("'...............................");
System.out.println("Enter amount to deposit");
System.out.println("................................");
double amt=sc.nextDouble();
s.deposit(amt);
System.out.println("\n");
break;

case 'c':
System.out.println("'...............................");
System.out.println("Enter amount to withdraw");
System.out.println("................................");
double amtW=sc.nextDouble();
s.withdraw(amtW);
System.out.println("\n");
break;

case 'd':
System.out.println("'...............................");
System.out.println("Previous Transaction");
s.getPrevTrans();
System.out.println("................................");
System.out.println("\n");
break;

case 'e':
System.out.println(".................................");
break;

default:
System.out.println("Option does not exist");
break;
}
}
while(options !='e');
System.out.println("Thank You");

}
}