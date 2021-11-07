package util;

import org.hibernate.Session;

import entity.Adres;
import entity.Kisi;

public class Test {
	
	public static void main(String[] args) {
		
		try {
			
			Session session = HibernateUtil.getSessionfactory().openSession();
			session.beginTransaction();
			
			Kisi kisi=new Kisi("Ayla","Y�lmaz");
			
			Adres adres= new Adres();
			adres.setSehirAd("�stanbul");
			adres.setAdresDetay("Kad�k�y");
			adres.setKisi(kisi);
			
			session.save(adres);
			session.getTransaction().commit();
			session.close();
			System.out.println("Kay�t i�lemi ba�ar�l�");
			

			
			
		} catch (Exception e) {
			
			
		}
	}

}
