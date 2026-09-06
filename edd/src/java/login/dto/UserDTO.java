package login.dto;

/**
 * Persistence of user information.
 * @author lgallo
 * @since 27/08/2026
 * @version 1
 */
public class UserDTO {

    private String id;
    private String name;
    private String mail;
    private String password;
    private String rol;

    /**
     * Complete the comment...
     */
    public UserDTO() {
	// Complete this...
    }

    /**
     *
     * Complete the comment...
     */
    public String getName() {
	return name;
    }

    /**
     * Complete the comment...
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
     * Local test of DTO
     */
    public static void main(String[] args) {
	UserDTO u = new UserDTO();
	System.out.println(u);
    }
}
