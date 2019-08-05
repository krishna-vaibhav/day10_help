package beans;

import dao.CustomerDAO;
import rev_eng.Customer;

public class CustomerBean {
	private String email, pass;
	private Customer details;

	public CustomerBean() {
		System.out.println("in bean constr");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer getDetails() {
		return details;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	// B.L
	public String validateUser() throws Exception {
		details = new CustomerDAO().validateCustomer(email, pass);
		if (details != null)
			return "valid";
		return "invalid";
	}

}
