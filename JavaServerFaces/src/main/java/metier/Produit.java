package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class Produit {
	
	@Id
	@GeneratedValue
	@Column(name="code")
	private String produitID;
	
	@Column(name="url", nullable=false, length=255)
	private String url;
	
	@Column(name="creator", nullable=true, length=255)
	private String creator;
	
	@Column(name="product_name", nullable=false, length=255)
	private String productName;

	public Produit(String produitID, String url, String creator, String productName) {
		super();
		this.produitID = produitID;
		this.url = url;
		this.creator = creator;
		this.productName = productName;
	}
	
	
	public static Produit[] productList() {
		return productList();
	}
	
	
}