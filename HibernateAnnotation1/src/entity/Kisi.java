package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_kisi",catalog="mydatabase")
public class Kisi implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="kisi_id")
	private Integer kisiId;
	
	@Column(name="kisi_ad")
	private String kisiAd;
	
	@Column(name="kisi_soyad")
	private String kisiSoyad;
	
	
	
	
	
	public Kisi() {
		
	}



	public Kisi(String kisiAd, String kisiSoyad) {
		
		this.kisiAd = kisiAd;
		this.kisiSoyad = kisiSoyad;
		
	}



	public Integer getKisiId() {
		return kisiId;
	}



	public void setKisiId(Integer kisiId) {
		this.kisiId = kisiId;
	}



	public String getKisiAd() {
		return kisiAd;
	}



	public void setKisiAd(String kisiAd) {
		this.kisiAd = kisiAd;
	}



	public String getKisiSoyad() {
		return kisiSoyad;
	}



	public void setKisiSoyad(String kisiSoyad) {
		this.kisiSoyad = kisiSoyad;
	}



	
	
	
	
	
	
	

}
