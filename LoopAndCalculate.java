import java.util.Scanner;  // Import the Scanner class

public class LoopAndCalculate {
	
	public static void main(String args[])
	{
		float userEnteredValues[] = new float[5];
		Scanner userInput = new Scanner(System.in);
		
		// initialize variables
		int counter = 0;
		float maxValue = 0f;
		float minValue = 0f;
		float total = 0f;
		float average = 0f;
		float interestOfTotal = 0f;
		
		System.out.print("Enter five numbers: ");
		
		// start while loop
		// use 50 as a maximum count to break the while loop to prevent endless loop
		while (counter < userEnteredValues.length || counter > 50)
		{
			
			float currentValue = 0f;
			userEnteredValues[counter] = userInput.nextFloat();
			currentValue = userEnteredValues[counter];
			
			if (counter == 0)
			{
				maxValue = currentValue;
				minValue = currentValue;
				
			}
			else
			{
				if (currentValue > maxValue)
				{
					maxValue = currentValue;
				}
				
				if (currentValue < minValue)
				{
					minValue = currentValue;
				}
				
			}
			counter++;
		}
		
		for (int i = 0; i < userEnteredValues.length; i++)
		{
			total += userEnteredValues[i];
		}
		
		average = total / userEnteredValues.length;
		
		interestOfTotal = total * .2f;
		
		System.out.println("total: " + total);
		System.out.println("average: " + average);
		System.out.println("maximum: " + maxValue);
		System.out.println("minValue: " + minValue);
		System.out.println("interest: " + interestOfTotal);
	}
}
