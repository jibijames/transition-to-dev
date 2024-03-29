package com.jibi.naima.core.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_info",schema="test")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    
    private String name;

    private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	public User() {}
	
	public User(long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
    
    
}
