package login.view;

import java.util.Scanner;

/**
 *
 * Complete the comment...
 */
public class LoginView {

    Scanner sc;

    /**
     * Complete the comment...
     */
    public LoginView() {
	sc = new Scanner(System.in);
    }

    /**
     * Complete the comment...
     */
    public String requestMail() {
	System.out.println("Ingresa Correo: ");
	return sc.nextLine();
    }

    /**
     * Complete the comment...
     */
    public String requestPassword() {
	System.out.println("");
	return "";
    }

    /**
     * Complete the comment...
     */
    public void showWelcome() {
	System.out.println();
	System.out.println("");
    }

    /**
     * Complete the comment...
     */
    public void showError() {
	System.out.println();
	System.out.println("Credenciales erroneas...");
    }
    
}
