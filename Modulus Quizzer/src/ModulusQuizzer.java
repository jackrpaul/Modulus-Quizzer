import java.util.Scanner;
public class ModulusQuizzer
	{
		static int userQuestions, firstNumber, secondNumber, questionAnswer, userAnswer, correctAnswer;
		public static void main(String[] args)
			{
			greetUser();
			generateQuestions();
			giveOverview();
			}

		private static void greetUser()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello! I am the ULTRA Modulus Quizzer, and I am now going to quiz you on modules.");
			System.out.println("How many questions would you like to answer, mortal?");
			userQuestions = userInput.nextInt();
			System.out.println("Okay, I will now think of " + userQuestions + " questions to ask you.");
			}

		private static void generateQuestions()
		{
			correctAnswer = 0;
			Scanner userInput = new Scanner(System.in);
			for(int i = 0; i < userQuestions; i++)
				{
				if (i == 1)
					{
						firstNumber = (int)(Math.random()*50 + 1);
						secondNumber = firstNumber;
					}
				else if (i == 2)
					{
						firstNumber = (int)(Math.random()*5 + 1);
						secondNumber = (int)(Math.random()*15 + 1);
					}
				else
					{
						firstNumber = (int)(Math.random()*25 + 10);
						secondNumber = (int)(Math.random()*15 + 1);
					}
				questionAnswer = firstNumber % secondNumber;
				System.out.println(firstNumber + "%" + secondNumber + " is?");
				userAnswer = userInput.nextInt();
				if (userAnswer == questionAnswer)
					{
					System.out.println("That is correct!");
					correctAnswer++;
					}
				else
					{
					System.out.println("That is incorrect!");
					}
				}
				
			}

		private static void giveOverview()
			{
			System.out.println("You finished!");
			System.out.println("You got " + correctAnswer + " out of " + userQuestions + " correct.");
			if (correctAnswer == userQuestions)
				{
				System.out.println("YOU ARE A MASTER");
				}
			}

	}
