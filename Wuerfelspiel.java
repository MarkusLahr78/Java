import java.util.Scanner;

class Wuerfelspiel{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
int e=0;
System.out.println("Erste gew�rfelte Zahl");
int a=scanner.nextInt();
System.out.println("Zweite gew�rfelte Zahl");
int b=scanner.nextInt();
if 

((a==1)&&(b==2))
{
e=1000;
System.out.print("Das Ergebnis betr�gt " +e);
}
if (a==b)
{
e=a*100;
System.out.print("Das Ergebnis betr�gt "+e);
}
else if (a>b)
{

System.out.print("Das Ergebnis betr�gt "+a+b);
}
if (a<b)
{System.out.print("Das Ergebnis betr�gt "+b+a);
}
}
}
