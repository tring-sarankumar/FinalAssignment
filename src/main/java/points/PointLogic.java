package points;
import java.util.logging.Logger;

public class PointLogic implements cloneable{

	Float x;
	Float y;
	Logger log =  Logger.getLogger("PointLogic");
	PointLogic(Float x,Float y){
		this.x=x;
		this.y=y;
	}
        boolean testEqual() {
		return x.equals(y);
	} 

	protected PointLogic point() {
		try {
			return (PointLogic) super.clone();
			
		}catch(CloneNotSupportedException e) {
			log.info("error"+e);
			return this;
			
		}
		
	}

}
