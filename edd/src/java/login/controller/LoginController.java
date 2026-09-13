// Incluye el package

/**
 * Coméntame ...
 */
class LoginController {

    private final LoginView view;

    /**
     *
     *
     */
    public LoginController(LoginView view) {
	// Implementation...
    }

    /**
     *
     *
     */
    public void initSesion() {

	String mail;
	String password = view.requestPassword();

	List<UserDTO> usersDB = getUSersDB();

	for (UserDTO user : usersDB) {
	    if (user.getMail().equals(mail)
		&& user.getPassword().equals(password)) {
		// Show Welcome
		return;
	    }
	}

	view.showError();
    }

    /**
     *
     *
     */
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
	    usersDB.add(userDTO);
	}

	return usersDB;
    }
    

}
