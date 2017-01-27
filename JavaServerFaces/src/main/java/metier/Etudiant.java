package metier;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ETUDIANTS")
public class Etudiant {
	@Id
	@GeneratedValue
	@Column(name="ETUDIANT_ID")
	private long etudiantId;
	
	@Column(name="ETUDIANT_NAME", nullable=false, length=100)
	private String name;
	
	@Column(name="SEX")
	private char sex;
	
	@Column(name="SALAIRE")
	private double salaire;
	
	@Embedded
	@Column(name="Info")
	private Info InfoPerso;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Adresse adresse;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Course cours;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="DIPLOME_ETUDIANT",
	joinColumns = {@JoinColumn(name="ETUDIANT_ID")}, 
	inverseJoinColumns = {@JoinColumn(name="DIPLOME_ID")})
	Set<Diplome> diplome = new HashSet<Diplome>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="PROF_ETUDIANT",
	joinColumns = {@JoinColumn(name="ETUDIANT_ID")}, 
	inverseJoinColumns = {@JoinColumn(name="PROF_ID")})
	Set<Prof> profs = new HashSet<Prof>(); 

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String name, char sex, double salaire, Info infoPerso) {
		super();
		this.name = name;
		this.sex = sex;
		this.salaire = salaire;
		InfoPerso = infoPerso;
	}

	public long getEtudiantId() {
		return etudiantId;
	}

	public void setEtudiantId(long etudiantId) {
		this.etudiantId = etudiantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Info getInfoPerso() {
		return InfoPerso;
	}

	public void setInfoPerso(Info infoPerso) {
		InfoPerso = infoPerso;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Course getCours() {
		return cours;
	}

	public void setCours(Course cours) {
		this.cours = cours;
	}

	public Set<Diplome> getDiplome() {
		return diplome;
	}

	public void setDiplome(Set<Diplome> diplome) {
		this.diplome = diplome;
	}

	public Set<Prof> getProfs() {
		return profs;
	}

	public void setProfs(Set<Prof> profs) {
		this.profs = profs;
	}

}
