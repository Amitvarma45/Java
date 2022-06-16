package Corejava;
import java.util.Scanner;
class TriviaGame 
{	
	//static variables
	public static int[] points = {3,3,3,3,3};
	public static String[] answers = {"LOTUS","TIGER","HOCKEY","DELHI","PEACOCK"};
	//static triviaMethod
	public static int triviaMethod(String[] questions, String[] stt) 
	{
		//Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		String str;
		int point=0;
		for(int i=0;i<5;i++) 
		{
			System.out.println(questions[i]);
			System.out.println(stt[i]);
			if(stt[i].toUpperCase().equals(answers[i]))
			{
				System.out.println("Correct!");
				point+=points[i];
				System.out.println("");
			}
			else 
			{
				System.out.println("Wrong answer");
				System.out.println("");
			}
		}
		return point;			
	}
	public static void main(String[] args) {
		int point;		
		//One Dimentional Array
		String[] stt=new String[5];
		
		//adding questions
		String[] questions = {
				"Question 1: What is the National Flower of INDIA?",
				"Question 2: What is the National Animal of INDIA?",
				"Question 3: What is the National Game of INDIA?",
				"Question 4: What is the Capital of INDIA ?",
				"Question 5: What is the National Bird of INDIA ?",
				
		};
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println(questions[i]);
			stt[i]=sc.nextLine();
		}		
		point=triviaMethod(questions,stt);
		System.out.println("Final score: "+point);
		if(point==15) 
		{
			System.out.println("You are the Winner!");
			
		}
		else if(point>3 && point<15)
		{
			System.out.println("You are Runnerup!!");
		}
		else
		{
			System.out.println("Better Luck Next Time!!");	
	    }
     }
}
