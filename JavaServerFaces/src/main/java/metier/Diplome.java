package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DIPLOMES")
public class Diplome {
	
	@Id
	@GeneratedValue
	@Column(name="DIPLOME_ID")
	private long diplomId;
	
	@Column(name="DIPLOME_NAME")
	private String name;

	public Diplome() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Diplome(String name) {
		super();
		this.name = name;
	}

	public long getDiplomId() {
		return diplomId;
	}

	public void setDiplomId(long diplomId) {
		this.diplomId = diplomId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
}
