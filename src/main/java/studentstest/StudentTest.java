package studentstest;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;


public class StudentTest 
{
    public void studentTest()
    {
    	Logger logger =  Logger.getLogger("points");
    	ArrayList <Student> arr = new ArrayList<Student>();
    	Scanner sc = new Scanner(System.in);
    	boolean loop=true;
    	
    	while(loop) {
    	
    	try {
            logger.info("1.Add Details\n2.Exit");
            int x = sc.nextInt();
            if(x==1)
            {
                logger.info("Student Name:");
                String name = sc.next();
                logger.info("Student Age:");
                int age = sc.nextInt();
                logger.info("Student GPA:");
                double gpa = sc.nextDouble();
                arr.add(new Student(name,age,gpa));
            }
            else {
                loop=false;
                
            }
            }catch(InputMismatchException e)
            {
                logger.info("Exception"+e);
                sc.nextLine();
            }
    	}
    	

    	for (int i=0; i<arr.size(); i++){
    	    logger.info(arr.get(i).getName() +" " +arr.get(i).getAge() +" "+arr.get(i).getGpa());
    	    
    	}

    	 Collections.sort(arr,new Comparator<Student>(){
    		 public int compare(Student s1,Student s2) {
    			 return Double.compare(s2.getGpa(), s1.getGpa());
    			 

    		 }
    	 });
    	 logger.info("-------------After Sorted--------------");
    	 
     	for (int i=0; i<arr.size(); i++){
    	    logger.info(arr.get(i).getName() +" " +arr.get(i).getAge() +" "+arr.get(i).getGpa());
    	    
    	}
    	
        
    }
}
