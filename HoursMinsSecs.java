package mypackage;
public class HoursMinsSecs{
	public static void main (String [] args){
	int inputSecs = Integer.parseInt(args[0]);
	int HH = inputSecs / 3600;
	int rs = inputSecs - (HH * 3600);
	int MM = rs / 60;
	int SS = rs - (MM * 60);
	System.out.println(inputSecs + " seconds in HH:MM:SS is: " + HH + ":" + MM + ":" + SS);
	}

}