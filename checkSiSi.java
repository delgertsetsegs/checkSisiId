package homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkSiSi {
	
	public static boolean checkRegNum(String sisi) {
		//String pattern="(([\u0410-\u042F]{2}|[\u0430-\u044F]{2})[//d]{8})";
		//Pattern pattern =Pattern.compile("([a-zA-Z]{2}[0-9]{8})");
		Pattern pattern =Pattern.compile("[\\d]{2}[m,b,d,M,B,D][\\d](SEAS|SIRPA|SAS|BS|sas|bs|seas|sirpa)[\\d]{4}");
		Matcher matcher = pattern.matcher(sisi);
        if (matcher.find()){
            return true;
        }
        return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pattern p=new Pattern.("[,\\s]+");

		Scanner input = new Scanner(System.in);
		System.out.println("Sisi id гаа оруулна уу:");
		String sisi = input.nextLine();
		if(checkRegNum(sisi)==true) {
			System.out.print("Зөв утга оруулсан байна.");
		}
		else 
			System.out.print("Та sis-гээ зөв оруулна уу.");

	}

}

