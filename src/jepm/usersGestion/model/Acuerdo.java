package jepm.usersGestion.model;

public class Acuerdo {
	private int id;
	private String desription;
	private int idIdioma;
	/**
	 * 
	 */
	public Acuerdo() {
		super();
	}
	/**
	 * @param id
	 * @param desription
	 * @param idIdioma
	 */
	public Acuerdo(int id, String desription, int idIdioma) {
		super();
		this.id = id;
		this.desription = desription;
		this.idIdioma = idIdioma;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the desription
	 */
	public String getDesription() {
		return desription;
	}
	/**
	 * @param desription the desription to set
	 */
	public void setDesription(String desription) {
		this.desription = desription;
	}
	/**
	 * @return the idIdioma
	 */
	public int getIdIdioma() {
		return idIdioma;
	}
	/**
	 * @param idIdioma the idIdioma to set
	 */
	public void setIdIdioma(int idIdioma) {
		this.idIdioma = idIdioma;
	}
	@Override
	public String toString() {
		return desription;
	}
	
	

}
