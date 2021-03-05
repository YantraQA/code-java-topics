package _12_Session._1_DateFormatConvertion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _1_DateFormatConvertion {
	
	// Different Date Formats
//	dd/MM/yy	- 03/08/06
//	dd/MM/yyyy	- 03/08/2006
//	d/M/yy		- 3/8/06
//	d/M/yyyy	- 3/8/2006
//	ddMMyy		- 30806
//	ddMMyyyy	- 3082006
//	ddMMMyy		- 03Aug06
//	ddMMMyyyy	- 03Aug2006

	public static void main(String[] args) {
		
	String date_1 = convertionDates("dd/MM/yy", "ddMMMyyyy", "03/08/2019");
	System.out.println("The converted date form \"dd/MM/yy\" to \"ddMMMyyyy\" is: " + date_1);
	
	String date_2 = convertionDates("dd/MM/yyyy", "d/M/yy", "03/08/2019");
	System.out.println("The converted date form \"dd/MM/yyyy\" to \"d/M/yy\" is: " + date_2);
	
	String date_3 = convertionDates("ddMMMyyyy", "ddMMMyy", "03Aug19");
	System.out.println("The converted date form \"ddMMMyyyy\" to \"d/M/yy\" is: " + date_3);

	}
	
	public static String convertionDates(String inputPatteren, String outputPatteren, String givenDate)
	{
		SimpleDateFormat inputFormat = new SimpleDateFormat(inputPatteren);
		SimpleDateFormat outputFormat = new SimpleDateFormat(outputPatteren);
		
		Date date = null;
		
		String requiredDate = null;
		
		try {
			date = inputFormat.parse(givenDate);
		} catch (ParseException e) {
			System.out.println(" The given input values cannot be parsed");
			e.printStackTrace();
		}
		requiredDate = outputFormat.format(date);
		
		return requiredDate;
	}

}
