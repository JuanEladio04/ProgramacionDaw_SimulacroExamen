package jepm.usersGestion.model;

public class Language {
	
	private int id;
	private String descripcion;
	private int idPais;
	/**
	 * 
	 */
	public Language() {
		super();
	}
	/**
	 * @param id
	 * @param descripcion
	 * @param idPais
	 */
	public Language(int id, String descripcion, int idPais) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.idPais = idPais;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the idPais
	 */
	public int getIdPais() {
		return idPais;
	}
	/**
	 * @param idPais the idPais to set
	 */
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	@Override
	public String toString() {
		return descripcion;
	}
	
	

}