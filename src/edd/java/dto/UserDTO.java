package dto;

/**
 * Persistencia de la informacion de un usuario.
 * @author lgallo
 * @since 27/08/2026
 */
public class UserDTO {

    private String name;
    private String mail;

    /**
     *
     *
     */
    public String getName() {
	return name;
    }

    /**
     * @param name ....
     */
    public void setName(String name) {
	this.name = name;
    }

}
