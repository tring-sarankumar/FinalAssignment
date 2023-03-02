package creditcard;
import java.util.logging.Logger;

public class CreditCardLogic implements cloneable{
	String name;
	Integer cardno;
	Integer expdate;
	Logger log =  Logger.getLogger("CreditCard");
	
	CreditCardLogic(String name,Integer cardno,Integer expdate){
		this.name=name;
		this.cardno=cardno;
		this.expdate=expdate;
	}
	
	boolean checkNum(Integer newno) {
		return newno.equals(cardno);
	}
	
	CreditCardLogic credit() {
		try {
			return (CreditCardLogic) super.clone();
			
		}catch(CloneNotSupportedException e){
			log.info("Cloning err");
			return this;
		}
	}

}
