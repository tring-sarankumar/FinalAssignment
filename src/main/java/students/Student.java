package students;
import java.util.Scanner;
import java.util.logging.Logger;
public class Student 
{
    public void students() {
    	Logger log =  Logger.getLogger("CreditCard");
    	


        Scanner sc = new Scanner(System.in);
        try {
        log.info("Enter name:");
        String name =sc.nextLine();

        log.info("Enter grade:");
        char grade=sc.next().charAt(0);
        
        log.info("Enter GPA:");
        float gpa=sc.nextFloat();
        
        StudentLogic obj = new StudentLogic(name, grade, gpa);
        String prof=obj.profile();
        log.info(prof);
        
        log.info("Do You Want To Update GPA: yes/no");
        String updategpa= sc.next();
        
        if(updategpa.equalsIgnoreCase("yes")){
            log.info("Enter New GPA:");
            Float newgpa =sc.nextFloat();
            obj.update(newgpa);
            log.info("Successfully Updated");
            log.fine("Updated Profile {}", obj.profile());
        }
        }catch (Exception e) {
        	log.info("There Was an Exception :"+e);
        }
       
    }
}
