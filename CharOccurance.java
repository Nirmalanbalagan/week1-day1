package week1.day1.classroom;

public class CharOccurance {

	public static void main(String[] args) {
		   
		String str = "Welcome to Chennai";
		System.out.println(str);
		int count = 0;
	    for (int i=0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == 'e')
	        {
	             count++;
	        }
	    }
		System.out.println("occurrence of e: "+count);
	}


	}


