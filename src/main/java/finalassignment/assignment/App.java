package finalassignment.assignment;


import java.util.Scanner;

import java.util.logging.Logger;

import bank.Bank;
import creditcard.CreditCard;
import databaseconnection.DatabaseConnectionMain;
import points.Points;
import shape.Shape;
import students.Student;
import studentstest.StudentTest;
import calculator.MainCalculator;
import collections.*;
import contacts.MainContact;
import frequency.Files;
import tictactoe.Game;
import arraylst.*;

public class App 
{
    public static void main( String[] args ) 
    
    {
    	Logger log =  Logger.getLogger("Final Assignment");
    	Scanner sc = new Scanner(System.in);
		boolean loop=true;
		while(loop){
    	log.info("\n 1.Bank \n 2.Credit Card \n 3.DataBase Connection \n 4.Points \n 5.Shapes \n 6.Students \n 7.Students Test \n 8.Calculator \n 9.Collections \n 10.Contacts \n 11.Frequency \n 12.TicTacToe \n 13.Array / ArrayList \n 14.exit");
    	
    	int opt=sc.nextInt();
    	switch(opt) {
    	
    	case 1:
    	Bank bank = new Bank();
    	bank.bankMain();
    	break;
    	
    	case 2:
    	CreditCard creditcard = new CreditCard();
    	creditcard.creditCardMain();
    	break;
    	
    	case 3:
    		DatabaseConnectionMain db = new DatabaseConnectionMain();
    		db.dbMain();
    		break;
    		
    	case 4 :
    		Points pointObj=new Points();
    		pointObj.point();
    		break;
    	
    	case 5 :
    		Shape shapeObj= new Shape();
    		shapeObj.shape();
    		break;
	    case 6:
		    Student studentObj= new Student();
		    studentObj.students();
		    break; 		
	    case 7:
	    	StudentTest studentTestObj = new StudentTest();
	    	studentTestObj.studentTest();
		    break; 
	    case 8:
	    	MainCalculator calc = new MainCalculator();
	    	calc.calculate();
		    break; 
	    case 9:
	    	
	    	log.info("1.HashTree 2.HashMap 3.HashSet");
	    	int option = sc.nextInt();
	    	if(option==1) {
		    	Hashtree obj=new Hashtree();
		    	obj.hashTree();
	    	}
	    	else if(option==2) {
		    	Hashmap obj2 = new Hashmap();
		    	obj2.hashMap();
	    	}
	    	else if(option==3) {

		    	Hashset obj3=new Hashset();
		    	obj3.hashSet();
	    	}
	    	break;
	    case 10:
	    	MainContact obj = new MainContact();
	    	obj.contacts();  	
		    break;
		    
	    case 11:
	    	Files fre = new Files();
	    	fre.frequency();
	    	break;
	    	
	    case 12:
	    	Game tictac = new Game();
	    	tictac.game();
	    	break;
	    case 13:
	    	log.info("1.Array 2.ArrayList");
	    	int options = sc.nextInt();
	    	if(options==1) {
	    	     Array ar = new Array();
	    	     ar.array();
	    	}
	    	else if(options==2) {
	    	     ArrList arlst = new ArrList ();
	    	     arlst.arrlst();
	    	}
		break;
		case 14:
		    loop=false;
		    break;
		default:
			log.info("Enter Correct Option");
    	}
	}

		
	}
    	
    	
    }

