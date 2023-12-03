import java.util.Scanner;

public class SicakSoguk {

	public static void main(String[] args) {
		int rastgeleSayi= (int)(Math.random()*100);
		Scanner input= new Scanner(System.in);
		
		System.out.println("Sıcak soğuk oyununa hoş geldiniz. Bilgisayarın rastgele seçtiği sayıyı 10 adımda bulmaya çalışacaksınız. İyi eğlenceler :) ");
		System.out.println("0'la 99 arasında bir sayı giriniz: ");
		
		
		for(int i=0; i<10; i++) {
			int giris= input.nextInt();
			if(rastgeleSayi<giris) {
				if(giris-rastgeleSayi<6) {
					System.out.println("Sıcak aşağı");
				}
				
				else {
					System.out.println("Soğuk aşağı");
				}
			
			}
			else if(rastgeleSayi>giris) {
				if(rastgeleSayi-giris<6) {
					System.out.println("Sıcak yukarı");
				}
				
				else {
					System.out.println("Soğuk yukarı");
				}
					
			}
			
			else  {
				System.out.println("Tebrikler doğru bildiniz :)");
			}
			
			
		}//for
		
		System.out.println("Maalesef kaybettiniz. Bilgisayarın seçtiği sayi : "+ rastgeleSayi);
		
		
		

	}

}
