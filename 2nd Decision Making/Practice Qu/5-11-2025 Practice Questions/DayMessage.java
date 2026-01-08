//Q3. Time of Day Message

//Write a program to input hour (0–23) and display message:

//0–11 → Good Morning

//12–16 → Good Afternoon

//17–20 → Good Evening

//21–23 → Good Night

import java.util.Scanner ;
	class DayMessage{
		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the time");
			int hour =sc.nextInt();
			
			if(hour>=0 && hour<=11){
				System.out.println("Good morning:");
				}
				else if(hour>=13 && hour<=16){
					System.out.println("Good aftronon:");
				}
				else if(hour>=17 && hour<=20){
					System.out.println("Good evining:");
				}	
				else if (hour>=21 && hour<=23){
				System.out.println("Good night:");
				}
			else 	
				System.out.println("Pleas enter the value 0 TO 24");
			}
			
		}
	