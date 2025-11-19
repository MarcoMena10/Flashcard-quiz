import java.util.ArrayList;

import java.util.Scanner;
// the random method as a whole was an idea from chatgpt to simplify math.random
import java.util.Random;

import java.util.Collections;

public class Quiz
	{
		 static Scanner userIntInput = new Scanner(System.in);
		 static FlashCardSet fullSet = new FlashCardSet(); // this is the full set that contains every card
		 // A list that will hold the flashcards for the specific quiz/test
		 static ArrayList<FlashCard> testSet = new ArrayList<>(); // creates a new arraylist where a set will be filled with only the desired category
		 static int score = 0;
		 // category idea inspired by chatgpt
		  private static String selectedCategory = "";
		
		public static void main(String[] args)
			{ 
				
				FlashCardSet.fillSet(); // fill the set
				askSet(); // ask what flash cards the user wants to be quizzed on
			    makeSet(); // create the test
				giveTest(); // give the test
				reportScore(); // report user score
				
			}
			public static void askSet()
			{
				System.out.println("1. Important Figures");
				System.out.println("2. Important Dates");
				System.out.println("3. Important Events");
				System.out.println("4. Important Laws");
				System.out.println("5. All categories");
			    System.out.print("Enter choice. Please press the respective number for the category you wish to study ");
			    int choice = userIntInput.nextInt();
			    userIntInput.nextLine(); 
			    
			    switch (choice) 
			    {
				case 1:
						{
							selectedCategory = "Important Figures";
							break;
						}
				case 2: 
						{
							selectedCategory = "Important Dates";
							break;
						}
				case 3:
						{
							selectedCategory = "Important Events";
							break;
						}
				case 4:
						{
							selectedCategory = "Important Laws";
							break;
						}
				case 5:
						{
							selectedCategory = "ALL";
							break; 
						}
			    }
			}
			public static void makeSet()
			{
				// gets all available flash cards
				 ArrayList<FlashCard> allCards = fullSet.getSet();
				 // filters cards by specific set
				    for (int i = 0; i < allCards.size(); i++) 
				    {
				    	//all available flashcards are retreived, 
				        FlashCard card = allCards.get(i);
				        // flashacrds are called by their given category or if the user selects all, all flashcards are retreived
				        if (selectedCategory.equals("ALL") || card.getCategory().equals(selectedCategory)) 
				        {
				            testSet.add(card);
				        }
				    }				    
				    {
				        System.out.println("Loaded " + testSet.size() + " flashcards about " + selectedCategory);
				    }
			}
			public static void giveTest()
			{
				   System.out.println("\nStarting Quiz");
				   // random number generator, an idea to help simplify the random code, idea from chatgpt
				    Random rand = new Random();

				    for (int i = 0; i < testSet.size(); i++) 
				    	{
				    	// loop through each card in the quiz
				        FlashCard correctCard = testSet.get(i);
				        String correctAnswer = correctCard.getBack();

				        // Build answer choices
				        ArrayList<String> choices = new ArrayList<>();
				        choices.add(correctAnswer);

				        // Add 3 random incorrect answers
				        while (choices.size() < 4) 
				        {
				            FlashCard randomCard = fullSet.getSet().get(rand.nextInt(fullSet.getSet().size()));
				            String wrongAnswer = randomCard.getBack();
				            if (!choices.contains(wrongAnswer)) 
				            {
				                choices.add(wrongAnswer);
				            }
				        }

				        // Shuffle the choices
				        Collections.shuffle(choices);

				        // Ask the question
				        System.out.println("\nQuestion " + (i + 1) + ": " + correctCard.getFront());

				        for (int j = 0; j < choices.size(); j++) 
				        {
				            System.out.println((j + 1) + ". " + choices.get(j));
				        }
				        // Get user's answer
				        System.out.print("Enter your answer (1–4): ");
				        int userChoice = -1;
				        while (userChoice < 1 || userChoice > 4) 
				        {
				            if (userIntInput.hasNextInt()) 
				            {
				                userChoice = userIntInput.nextInt();
				                userIntInput.nextLine(); // consume newline, idea from chatgpt. all newline code is
				                if (userChoice < 1 || userChoice > 4) 
				                {
				                    System.out.print("Please enter 1–4: ");
				                }
				            } 
				            else 
				            {
				            	userIntInput.nextLine(); // discard invalid input
				                System.out.print("Invalid Input. Please enter 1–4: ");
				            }
				        }
				        // Check answer. if the answer input equals the set value for an answer, it is correct
				        String selectedAnswer = choices.get(userChoice - 1);
				        if (selectedAnswer.equals(correctAnswer)) 
				        {
				            System.out.println("Correct!");
				            score++;
				            correctCard.setMastered(true);
				        } 
				        else 
				        {
				            System.out.println(" Incorrect.");
				            System.out.println("The correct answer was: " + correctAnswer);
				        }
				    }
			}
			public static void reportScore()
			{
				// reports the score the user got out oof the amount of cards they were given
				 System.out.println("You answered " + score + " out of " + testSet.size() + " correctly.");	 
				 
			}	
	}
