package switchcase;
import java.util.Scanner;
public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int note;
            System.out.println("geben sie ihere Note ein");
            Scanner my = new Scanner(System.in);
            note = my.nextInt();
            switch(note) {
            case 1:
            	System.out.println("sehr gut");
            	break;
            case 2:
            	System.out.println("gut");
            	break;
            case 3:
            	System.out.println("befriedigend");
            	break;
            case 4:
            	System.out.println("ausreichend");
            	break;
            case 5:
            	System.out.println("mangelhaft");
            	break;
            case 6:
            	System.out.println("ungenügend");
            	break;
            	default:
            		System.out.println("Fehlemeldung");
            }
	}

}
