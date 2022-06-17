
import java.util.Scanner;

public class SwitchDemo {

public static void main(String[] args) 
{
	
		Scanner scan=new Scanner(System.in);
System.out.println("please enter the number between 1 to 5 to select musical instrument");
int instrument=scan.nextInt();
String musicinstrument="";
switch(instrument)
{
case 1:
	musicinstrument ="guitar";
break;
case 2:
	 musicinstrument ="piano";
break;
case 3:
	 musicinstrument ="drums";
case 4:
	 musicinstrument ="flute";
break;
case 5:
	 musicinstrument ="ukelele";
break;
}

System.out.println("you have selected: "+ musicinstrument);
}
}
