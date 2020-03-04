package ro.unitbv.javadatatype;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Hello world");
     
     Scanner scanner=new Scanner(System.in);
     System.out.println("Introdu nr 1: ");
     int nr1=scanner.nextInt();
     //int nr2=scanner.nextInt();
     
     //afisam output-ul
     System.out.println("numarul citit este:"+nr1);
     System.out.println("Introdu nr 2: ");
     
     int nr2=scanner.nextInt();
     System.out.println("numarul 2 citit este: "+nr2);
     int suma=nr1+nr2;
     System.out.println("suma este: "+suma);
     System.out.println("diferenta este: " +(nr1-nr2));
     System.out.println("produsul este: "+(nr1*nr2));
     //nr1/nr3 afisat cu zecimale
     System.out.println("media este: "+((nr1+nr2)/2));
     if(nr1>nr2)
    	 System.out.println("Distanta este "+(nr1+nr2)/2);
     System.out.println("distanta intre 2 intregi este ");
     if(nr1>nr2)
    	 System.out.println("intregul maxim este:"+nr1+"(Nr 1)");
     else
    	 System.out.println("intregul maxim este: "+nr2+"(Nr 2");
     
     }

}
