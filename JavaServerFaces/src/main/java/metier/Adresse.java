package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADRESSE")
public class Adresse {
	
	@Id
	@GeneratedValue
	@Column(name="ADRESSE_ID")
	private long adresseId;
	@Column(name="RUE", nullable=false, length=250)
	private String rue;
	@Column(name="VILLE", nullable=false, length=250)
	private String ville;
	
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adresse(String rue, String ville) {
		super();
		this.rue = rue;
		this.ville = ville;
	}

	public long getAdresseId() {
		return adresseId;
	}

	public void setAdresseId(long adresseId) {
		this.adresseId = adresseId;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
