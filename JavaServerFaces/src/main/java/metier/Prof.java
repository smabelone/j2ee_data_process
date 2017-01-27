package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROF")
public class Prof {
	
	@Id
	@GeneratedValue
	@Column(name="PROF_ID")
	private long profId;
	
	@Column(name="PROF_NAME", nullable=false, length=100)
	private String name;

	public Prof() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prof(String name) {
		super();
		this.name = name;
	}

	public long getProfId() {
		return profId;
	}

	public void setProfId(long profId) {
		this.profId = profId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
