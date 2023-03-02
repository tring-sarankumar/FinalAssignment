package shape;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;
public class Shape {
    public void shape() {
        Logger log = Logger.getLogger("Shape");
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                log.info("1.Triangle,2.rectangle, 3.circle, 4.Cancel . Enter 1/2/3/4");
                int shapetype = sc.nextInt();
                if (shapetype == 1) {
                	try {
                        log.info("Enter The Length 1:");
                        Float trilength1 = sc.nextFloat();
                        log.info("Enter The Length 2:");
                        Float trilength2 = sc.nextFloat();
                        log.info("Enter The Length 3:");
                        Float trilength3 = sc.nextFloat();
                        ShapeLogic obj = new ShapeLogic("triangle", trilength1, trilength2, trilength3);
                        obj.perimeter();
                        obj.area();
                	}catch(InputMismatchException e) {
                		log.info("Exception:" + e);
                		break;
                	}

                } else if (shapetype == 2) {
                	try {
                        log.info("Enter The Length:");
                        Float rectanglelength = sc.nextFloat();
                        log.info("Enter The width:");
                        Float rectanglewidth = sc.nextFloat();
                        ShapeLogic obj = new ShapeLogic("rectangle", rectanglelength, rectanglewidth);
                        obj.perimeter();
                        obj.area();
                    }catch(InputMismatchException e) {
                		log.info("Exception:" + e);
                		break;
                	}

                }
                
                else if (shapetype == 3) {
                try {
                    log.info("Enter The Radius:");
                    Float circleradius = sc.nextFloat();
                    ShapeLogic obj = new ShapeLogic("circle", circleradius);
                    obj.perimeter();
                    obj.area();
                }catch(InputMismatchException e) {
            		log.info("Exception:" + e);
            		break;
            	}
                              

                } else if (shapetype == 4) {
                    break;
                }
            }
        } catch (Exception e) {
            log.info("Exception:" + e);
        } 

    }

}
