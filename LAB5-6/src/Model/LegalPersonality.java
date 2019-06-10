package Model;
//date java import
import java.util.Date;
//abstract class
public abstract class LegalPersonality {
	//atributes
	private String name;
	private int nit;
	private String dirCorrespon;
	private int tel;
	private int employeeCuant;
	private int actPesos;
	private Date consDate;
	private OrgType consType;
	private String legalRepreName;
	private Cubicle[][][] building;
	
	//builder
	public LegalPersonality(String name, int nit, String dirCorrespon, int tel,
			int employeeCuant, int actPesos, Date consDate, OrgType consType,
			String legalRepreName, Cubicle[][][] building) {
		this.name = name;
		this.nit = nit;
		this.dirCorrespon = dirCorrespon;
		this.tel = tel;
		this.employeeCuant = employeeCuant;
		this.actPesos = actPesos;
		this.consDate = consDate;
		this.consType = consType;
		this.legalRepreName = legalRepreName;
		this.building = building;
		initializeBuilding();
	}
	
	//method for initializing the building matrix
	/**
	*
	*	@return void , this is just for initializing the building of the cubicle matrix
	*/
	private void initializeBuilding() {
		for (int floor = 0; floor < building.length; floor++) {
			for (int i = 0; i < building[0].length; i++) {
				for (int j = 0; j < building[0][0].length; j++) {
					building[floor][i][j]=new Cubicle(floor+"-"+i+"-"+j);
				}
			}
		}
		
	}

	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit = nit;
	}
	public String getDirCorrespon() {
		return dirCorrespon;
	}
	public void setDirCorrespon(String dirCorrespon) {
		this.dirCorrespon = dirCorrespon;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getEmployeeCuant() {
		return employeeCuant;
	}
	public void setEmployeeCuant(int employeeCuant) {
		this.employeeCuant = employeeCuant;
	}
	public int getActPesos() {
		return actPesos;
	}
	public void setActPesos(int actPesos) {
		this.actPesos = actPesos;
	}
	public Date getConsDate() {
		return consDate;
	}
	public void setConsDate(Date consDate) {
		this.consDate = consDate;
	}
	public OrgType getConsType() {
		return consType;
	}
	public void setConsType(OrgType consType) {
		this.consType = consType;
	}
	public String getLegalRepreName() {
		return legalRepreName;
	}
	public void setLegalRepreName(String legalRepreName) {
		this.legalRepreName = legalRepreName;
	}
	public Cubicle[][][] getBuilding() {
		return building;
	}
	public void setBuilding(Cubicle[][][] building) {
		this.building = building;
	}
	
	
}

