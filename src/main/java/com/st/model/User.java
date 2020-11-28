package com.st.model;

// done with odm(object directory mapping) approach
import javax.naming.Name;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.DnAttribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

//@JsonAutoDetect
@Entry(objectClasses = {"top","st-person"})
public final class User {
	//@JsonIgnore
	//@JsonView
	@Id
	private Name dn;
	
	@Attribute(name = "st-eduid")
    @DnAttribute(value = "st-eduid", index = 3)
	private String stEduid;
	
	@Attribute(name="cn")
	private String fullName;
	
	@Attribute(name="givenname")
	private String firstName;
	
     @Attribute(name="mail")
     private String email;
	 
	@Attribute(name="telephoneNumber")
	private String telephoneNumber;
	
	@Attribute(name="mobile")
	private String mobile;
	

	public String getMobileno() {
		return mobile;
	}

	public void setMobileno(String mobileno) {
		this.mobile = mobileno;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Name getDn() {
		return dn;
	}

	public void setDn(Name dn) {
		this.dn = dn;
	}

	public String getStEduid() {
		return stEduid;
	}

	public void setStEduid(String stEduid) {
		this.stEduid = stEduid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "User [dn=" + dn + ", stEduid=" + stEduid + ", fullName=" + fullName + ", firstName=" + firstName
				+ ", email=" + email + ", telephoneNumber=" + telephoneNumber + ", mobileno=" + mobile + "]";
	}

}
