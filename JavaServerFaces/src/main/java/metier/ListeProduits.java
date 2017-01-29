package metier;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="liste")
public class ListeProduits {
	
	private static Produit[] test = new Produit[] {
			new Produit("test", "url", "creator", "productName")
		};

	public static Produit[] getTest() {
		return test;
	}

	public static void setTest(Produit[] test) {
		ListeProduits.test = test;
	}
 
}
