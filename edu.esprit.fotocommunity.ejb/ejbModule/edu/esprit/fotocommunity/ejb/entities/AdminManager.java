package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Adminstrator
 *
 */
@Entity(name="tab_administrators")

public class AdminManager implements Serializable {

	   
	@Id
	private Integer ID;
	private String NAME;
	private String PROFESSION;
	private String EMAIL;
	private String Role;
	private String TEL;
	private String CITY;
	private static final long serialVersionUID = 1L;

	public AdminManager() {
		super();
	}   
	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}   
	public String getNAME() {
		return this.NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}   
	public String getPROFESSION() {
		return this.PROFESSION;
	}

	public void setPROFESSION(String PROFESSION) {
		this.PROFESSION = PROFESSION;
	}   
	public String getEMAIL() {
		return this.EMAIL;
	}

	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}   
	public String getRole() {
		return this.Role;
	}

	public void setRole(String Role) {
		this.Role = Role;
	}   
	public String getTEL() {
		return this.TEL;
	}

	public void setTEL(String TEL) {
		this.TEL = TEL;
	}   
	public String getCITY() {
		return this.CITY;
	}

	public void setCITY(String CITY) {
		this.CITY = CITY;
	}
   
}
