package arraylst;
import java.util.Arrays;
import java.util.logging.Logger;

public class Arr{
	Logger log = Logger.getLogger("Array");
	int newValue;
	int arrSize=2;
	
	int []ar= new int[arrSize];
	
	void insert(int newValue) {
		for(int i =0;i<ar.length;i++) {
		    ar[i]=newValue;		
		}
	}
	
    void remove(){
        int[] temp1 = new int[ar.length-1];
        for(int i = 0; i < ar.length-1; i++){
            temp1[i] = Arrays.copyOf(ar, i);
        }
        ar = temp1;
        arrSize--;
    }
	
	
	void display() {
		for(int i =0;i<ar.length;i++) {
			log.fine("The value : {}", ar[i]);
		}
	}
}
