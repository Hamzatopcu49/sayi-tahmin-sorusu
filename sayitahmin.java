import java.util.Scanner;

public class sayitahmin {

    public static void main(String[] args) {
 Scanner klavye=new Scanner(System.in);
 int sayi,kere=0,tahmin;
 sayi=(int)(Math.random()*10)+1;
 do{
     kere++;
     System.out.print("LÜTFEN BİR TAHMİN YAPINIZ=");
 tahmin=klavye.nextInt();
 if(tahmin>sayi)
 System.out.println("KÜÇÜK YAZ");
 if(tahmin<sayi)
      System.out.println("BÜYÜK YAZ");
     
 }
 while (tahmin!=sayi);
        System.out.println(kere+"ADIMDA BULDUNUZ");
    
    }
    
}
