package snakeandladderd4.com;

public class UC4PlayerReachWinngPosition {
	
	static int total = 0;
	static int count = 0;
	static int winning = 100;
	/*
	 * @Purpose: To get random number using random function and check position of player.
	 */
     static void RollingDie() {
		int Rolling = (int)Math.floor(Math.random()*10) % 6+1;
		System.out.println("Rolling :" + Rolling);
	     
		if (total <= 100) {  
		 total=total+Rolling;
          System.out.println("Player in the position = "+ total);
          
			switch (total) {
			
			    case 10:
					System.out.println("ladder");
					total=total+10;
					System.out.println("after ladder = "+total);
					break;
				case 20:
					System.out.println("snake");
					total=total-5;
					System.out.println("after snake = "+total);
					break;
				case 30:
					System.out.println("ladder");
					total=total+10;
					System.out.println("after ladder = "+total);
					break;
				case 40:
					System.out.println("snake");
					total=total-5;
					System.out.println("after snake = "+total);
					break;
				case 50:
					System.out.println("ladder");
					total=total+10;
					System.out.println("after ladder = "+total);
					break;
				case 60:
					System.out.println("snake");
					total=total-5;
					System.out.println("after snake = "+total);
					break;
				case 70:
					System.out.println("ladder");
					total=total+10;
					System.out.println("after ladder = "+total);
					break;
				case 80:
					System.out.println("snake");
					total=total-5;
					System.out.println("after snake = "+total);
					break;
				case 90:
					System.out.println("ladder");
					total=total+10;
					System.out.println("after ladder = "+total);
					break;
				case 100:
					System.out.println("Exit");
					break;
				}
		}
		   else 
		   {
			   RollingDie();
		   }
	}
     /*
      *@Purpose: To check which position will get .
      *@return: int data type
      */
    static void checkPlayer(int check) { 
	
       switch (check) { 
		    case 0:
				System.out.println("No play");
				break;
			case 1:
				RollingDie();
				System.out.println("ladder come");
				break;
			case 2:
				RollingDie();
				System.out.println("snake come");
				break;
			default:
				System.out.println("Wrong");
		}
	}

	public static void main(String[] args) {

		int position = 0;
		System.out.println("Player Start at the  position = " + position);

		while (total <= 100) {
			
		int check = (int) Math.floor((Math.random() * 10) % 3);

		 checkPlayer(check);
		}
	}
}
