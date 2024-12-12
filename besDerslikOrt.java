package ortalamaHesaplama;
import java.util.Scanner;
public class besDerslikOrt {

	public static void main(String[] args) {
		double toplam,a,puan=0.00;
		int katSayi,toplamP=0,toplamKatSayi=0;
		boolean disiplinCezasi=false,zayifiVar=false;
		Scanner oku = new Scanner(System.in);
		do {
		System.out.println("Matematik dersinden aldığınız notu giriniz: ");
		puan=oku.nextDouble();
		System.out.println("Haftalık matematik dersi sayınızı giriniz: ");
		katSayi=oku.nextInt();
		if(puan<50) {zayifiVar=true;}
		}
		while(puan>100);
		toplamKatSayi+=katSayi;
		toplamP+=puan*katSayi;
			
		
		
		do {
		System.out.println("Edebiyat dersinden aldığınız notu giriniz: ");
		puan=oku.nextDouble();
		System.out.println("Haftalık edebiyat dersi sayınızı giriniz: ");
		katSayi=oku.nextInt();
		if(puan<50) {zayifiVar=true;}
		}
		while(puan>100);
		toplamKatSayi+=katSayi;
		toplamP+=puan*katSayi;
		
		do {
		System.out.println("Tarih dersinden aldığınız notu giriniz: ");
		puan=oku.nextDouble();
		System.out.println("Haftalık tarih dersi sayınızı giriniz: ");
		katSayi=oku.nextInt();
		if(puan<50) {zayifiVar=true;}
		}
		while(puan>100);
		toplamKatSayi+=katSayi;
		toplamP+=puan*katSayi;
		
		do {
		System.out.println("Coğrafya dersinden aldığınız notu giriniz: ");
		puan=oku.nextDouble();
		System.out.println("Haftalık coğrafya dersi sayınızı giriniz: ");
		katSayi=oku.nextInt();
		if(puan<50) {zayifiVar=true;}
		}
		while(puan>100);
		toplamKatSayi+=katSayi;
		toplamP+=puan*katSayi;
		
		do {
		System.out.println("Fizik dersinden aldığınız notu giriniz: ");
		puan=oku.nextDouble();
		System.out.println("Fizik matematik dersi sayınızı giriniz: ");
		katSayi=oku.nextInt();
		if(puan<50) {zayifiVar=true;}
		}
		while(puan>100);
		toplamKatSayi+=katSayi;
		toplamP+=puan*katSayi;
		
		System.out.println("Daha önce disiplin cezası aldınız mı(evet için 1 hayır için 0)?");
		a=oku.nextDouble();
		System.out.println("Daha önce takdir almadığınız bir eğitim yılı oldu mu(evet için 1 hayır için 0)?");
		int b=oku.nextInt();
		oku.close();
		if(a==1) {
			disiplinCezasi=true;
		}
		toplam=toplamP/toplamKatSayi;
		if(disiplinCezasi|| zayifiVar) {
			System.out.println("Belge almaya uygun değilsiniz.");
		}
		else if(toplam>=85) {
			System.out.println("Tebrikler Takdir Belgesi almaya layıksınız.");
		}
		else if(toplam>=75) {
			System.out.println("Tebrikler Teşekkür Belgesi almaya layıksınız.");
		}
		else {
			System.out.println("Üzgünüm belge almak için yeterli değilsiniz.");
		}
		if(b==0){
			System.out.println("Tebrikler Üstün Başarı Belgesi almaya hak kazandınız");
		}	
		System.out.println("Ortalamanız: "+toplam);
	}
	

}
