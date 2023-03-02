package shape;
import java.util.logging.Logger;

public class ShapeLogic {
	Logger log = Logger.getLogger("Shape");
    String type;
    float trilength1; 
    float trilength2;
    float trilength3;
    float rectanglelength;
    float rectanglewidth;
    float circleradius;

    ShapeLogic(String type,float circleradius){
        this.type=type;
        this.circleradius=circleradius;
    }
    ShapeLogic(String type,float reactanglelength, float reactanglewidth){
        this.type=type;
        this.rectanglelength=reactanglelength;
        this.rectanglewidth=reactanglewidth;
    }
    ShapeLogic(String type,Float trilength1,Float trilength2,Float trilength3){
        this.type=type;
        this.trilength1=trilength1;
        this.trilength2=trilength2;
        this.trilength3=trilength3;
    }

    protected void perimeter(){
        float peri=0;
        if("triangle".equalsIgnoreCase(type)){
            peri =trilength1 + trilength2 + trilength3;
        }
        else if("rectangle".equalsIgnoreCase(type)){
            peri=2*(rectanglelength + rectanglewidth);
        }
        else if("circle".equalsIgnoreCase(type)){
            peri=2 * 3.14f * circleradius;

        }
        
	 log.fine("The Perimeter is {}", peri);
        
    }

    protected void area(){
        float shapearea=0;
        if("triangle".equalsIgnoreCase(type)){
            shapearea =(trilength2 + trilength3) / 2;
        }
        else if("rectangle".equalsIgnoreCase(type)){
            shapearea=rectanglelength * rectanglewidth;
        }
        else if ("circle".equalsIgnoreCase(type)){
            shapearea=3.14f * circleradius * circleradius;
        }

       log.fine("The Area is {}", shapearea);
        
    }
    
}
