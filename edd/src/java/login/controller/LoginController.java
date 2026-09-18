package login.controller;

import login.view.LoginView;
import java.util.List;
import login.dto.UserDTO;
import util.DBReader;
    
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
	this.view = view;
    }

    /**
     *
     *
     */
    public void initSesion() {

	String mail;
	String password;

	view.showWelcome();
	mail = view.requestMail();
	password = view.requestPassword();

	List<UserDTO> usersDB = getUsersDB();

	for (UserDTO user : usersDB) {
	    if (user.getMail().equals(mail)
		&& user.getPassword().equals(password)) {
		
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
