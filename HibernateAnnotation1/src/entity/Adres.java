package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="tbl_adres",catalog="mydatabase")
public class Adres implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="AdresId")
	private Integer id;
	
	@Column(name="sehir_ad")
	private String sehirAd;
	
	@Column(name="adres_detay")
	private String adresDetay;
	
	@JoinColumn(name = "kisi_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Kisi kisi;
	
	public Adres() {
		
	}

	public Adres(String sehirAd, String adresDetay) {
	
		this.sehirAd = sehirAd;
		this.adresDetay = adresDetay;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSehirAd() {
		return sehirAd;
	}

	public void setSehirAd(String sehirAd) {
		this.sehirAd = sehirAd;
	}

	public String getAdresDetay() {
		return adresDetay;
	}

	public void setAdresDetay(String adresDetay) {
		this.adresDetay = adresDetay;
	}

	public Kisi getKisi() {
		return kisi;
	}

	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}

	
	
	
	

}
