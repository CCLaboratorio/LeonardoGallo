package login.dto;

/**
 * Persistencia de la información de un usuario.
 * @author lgallo
 * @since 27/08/2026
 */
public class UserDTO {

    private String id;
    private String name;
    private String mail;
    private String key;
    private String rol;

    /**
     * Coméntame ...
     */
    public UserDTO() {
	id = "0";
	name = "Felipe Sánchez";
	mail = "felipe.sanchez@gmail.com";
	key = "123";
	rol = "standar";
    }

    /**
     *
     * Coméntame ...
     */
    public String getName() {
	return name;
    }

    /**
     * Coméntame ...
     * @param name ...
     */
    public void setName(String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return this.name;
    }

    /**
     * Prueba local del DTO
     */
    public static void main(String[] args) {
	UserDTO u = new UserDTO();
	System.out.println(u);
    }
}
