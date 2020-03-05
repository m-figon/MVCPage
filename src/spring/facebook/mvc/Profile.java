package spring.facebook.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

public class Profile {
	private String firstName;
	
	//@NotNull(message="is required")
	//@Size(min=1)
	private String lastName;
	private String country;
	private String relationshipStatus;
	private LinkedHashMap<String, String> countryOptions;
	public Profile() {
		countryOptions= new LinkedHashMap<>();
		countryOptions.put("Brazil", "Brazil");
		countryOptions.put("France", "France");
		countryOptions.put("Germany", "Germany");
		countryOptions.put("Poland", "Poland");
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRelationshipStatus() {
		return relationshipStatus;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}
}
