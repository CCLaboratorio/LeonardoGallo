// Incluye el package

/**
 * Coméntame ...
 */
class LoginController {

    private final LoginView view;

    public LoginController(LoginView view) {
	// Implementation...
    }

    public void initSesion() {

	String username;
	String password;

    }

    public List<UserDTO> getUsersDB() {
	List<UsertDTO> usersDB = new ArrayList<>();

	List<String[]> data = DBReader.getData("resources/users.txt");

	for(String[] element: data) {
	    UserDTO userDTO = new UserDTO(Integer.parseInt(element[0]),
					  element[1],
					  element[2].
					  element[3],
					  element[4]
					  );
	}
    }
    

}
