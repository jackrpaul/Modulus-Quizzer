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
			System.out.println("Hello! I am the Modulus Quizzer, and I am now going to quiz you on modules.");
			System.out.println("How many questions would you like to answer?");
			userQuestions = userInput.nextInt();
			System.out.println("Okay, I will now think of " + userQuestions + " questions to ask you.");
			}

		private static void generateQuestions()
		{
			correctAnswer = 0;
			Scanner userInput = new Scanner(System.in);
			for(int i = 0; i < userQuestions; i++)
				{
				int randomNumber = (int)(Math.random()*6 + 1);
				switch (randomNumber)
					{
						case 1:
								{
									firstNumber = (int)(Math.random()*50 + 1);
									secondNumber = firstNumber;
									break;
								}
						case 2:
								{
									firstNumber = (int)(Math.random()*5 + 1);
									secondNumber = (int)(Math.random()*15 + 1);
									break;
								}
						default:
								{
									firstNumber = (int)(Math.random()*25 + 15);
									secondNumber = (int)(Math.random()*15 + 1);
									break;
								}
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
				System.out.println("Way to ace the quiz!");
				}
			}

	}
