package util;

import org.hibernate.Session;

import entity.Adres;
import entity.Kisi;

public class Test {
	
	public static void main(String[] args) {
		
		try {
			
			Session session = HibernateUtil.getSessionfactory().openSession();
			session.beginTransaction();
			
			Kisi kisi=new Kisi("Ayla","Yýlmaz");
			
			Adres adres= new Adres();
			adres.setSehirAd("Ýstanbul");
			adres.setAdresDetay("Kadýköy");
			adres.setKisi(kisi);
			
			session.save(adres);
			session.getTransaction().commit();
			session.close();
			System.out.println("Kayýt iþlemi baþarýlý");
			

			
			
		} catch (Exception e) {
			
			
		}
	}

}
