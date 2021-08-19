package snakeandladderd4.com;
public class snakeandladderd4 {
public static void main(String[] args) {
	
	System.out.println("Snake and Ladder game palyed with single player at start position 0");
	int Rolling = (int)Math.floor(Math.random()*10) % 6+1;
	System.out.println("Rolling :" + Rolling);
		
		int  position = 0;
	    int check = (int) Math.floor(Math.random()*10)%3;
        if (check == 0) {

            System.out.println("no palyer ");
        }
        else if (check == 1) {
            position += Rolling;
            System.out.println(" ladder come ");
        }
        else {
            position -= Rolling;
            System.out.println("snake come ");
        }
    }
}
				