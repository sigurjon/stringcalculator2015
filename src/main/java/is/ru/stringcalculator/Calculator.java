package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text) throws Exception{
		if(text.equals("")){
			return 0;
		}

		else if (text.contains(",")&& text.contains("\n")){
			return sum(testSplitAndNewline(text));
		}

		else if(text.contains(",")){
			return sum(splitNumbers(text));
		}

		else if(text.contains("\n")){
			return sum(testNewLine(text));
		}
		
		else
			return 1;
	}


	private static int toInt(String number) throws Exception{
		return Integer.parseInt(number);
	}
	
	private static String[] splitNumbers(String numbers)throws Exception{
	    return numbers.split(",");
	}

	private static String[] testNewLine(String numbers)throws Exception{
	    return numbers.split("\n");
	}
      
    private static int sum(String[] numbers) throws Exception{
 	    int total = 0;
        for(String number : numbers){
        	if(toInt(number) < 0){
        		throw new Exception("Negative number!");
        	}
        }
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }

    private static String[] testSplitAndNewline(String numbers) throws Exception{
	    return numbers.split("\n|\\,");
	} 


}

