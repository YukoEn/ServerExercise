package fi.haagahelia.CustomerListJDBC.domain;

public class Customer {
    private long id;
    private String firstName, lastName, streetaddress, postcode, postoffice, phone, email;

    public Customer (long id, String firstName, String lastName, String streetaddress, String postcode, String postoffice, String phone, String email ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetaddress = streetaddress;
        this.postcode = postcode;
        this.postoffice = postoffice;
        this.phone = phone;
        this.email = email;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreetaddress() {
		return streetaddress;
	}

	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPostoffice() {
		return postoffice;
	}

	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', streetaddress='%s', postcode='%s', postoffice='%s', phone='%s', email='%s' ]",
                id, firstName, lastName, streetaddress, postcode, postoffice, phone, email);
    }
      


}