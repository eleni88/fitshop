/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.validator.constraints.NotEmpty;


/**
 *
 * @author Eleni
 */
@Entity
@Table(name = "app_user") //, catalog = "fitshop", schema = "", uniqueConstraints = {
public class AppUser implements Serializable {

//    private static final long serialVersionUID = 1L;
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
////    @Basic(optional = false)
////    @Column(nullable = false)
//    
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 30)
//    @Column(name = "sso_id", nullable = false, length = 30)
//    private String ssoId;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 100)
//    @Column(nullable = false, length = 100)
//    private String password;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 30)
//    @Column(name = "first_name", nullable = false, length = 30)
//    private String firstName;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 30)
//    @Column(name = "last_name", nullable = false, length = 30)
//    private String lastName;
//    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 30)
//    @Column(nullable = false, length = 30)
//    private String email;
//    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
//    private List<Sales> salesList;
//    
//    @NotEmpty
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "app_user_user_profile", 
//             joinColumns = { @JoinColumn(name = "user_id") }, 
//             inverseJoinColumns = { @JoinColumn(name = "user_profile_id") })
//    private Set<UserProfile> userProfiles = new HashSet<UserProfile>();
//    
//
//    public AppUser() {
//    }
//
//    public AppUser(Integer id) {
//        this.id = id;
//    }
//
//    public AppUser(Integer id, String ssoId, String password, String firstName, String lastName, String email) {
//        this.id = id;
//        this.ssoId = ssoId;
//        this.password = password;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//    }
//
//    public Set<UserProfile> getUserProfiles() {
//        return userProfiles;
//    }
//
//    public void setUserProfiles(Set<UserProfile> userProfiles) {
//        this.userProfiles = userProfiles;
//    }
//    
//    
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getSsoId() {
//        return ssoId;
//    }
//
//    public void setSsoId(String ssoId) {
//        this.ssoId = ssoId;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @XmlTransient
//    public List<Sales> getSalesList() {
//        return salesList;
//    }
//
//    public void setSalesList(List<Sales> salesList) {
//        this.salesList = salesList;
//    }
//
//
//    
//
//
//
//    
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((id == null) ? 0 : id.hashCode());
//        result = prime * result + ((ssoId == null) ? 0 : ssoId.hashCode());
//        return result;
//    }
// 
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (!(obj instanceof AppUser))
//            return false;
//        AppUser other = (AppUser) obj;
//        if (id == null) {
//            if (other.id != null)
//                return false;
//        } else if (!id.equals(other.id))
//            return false;
//        if (ssoId == null) {
//            if (other.ssoId != null)
//                return false;
//        } else if (!ssoId.equals(other.ssoId))
//            return false;
//        return true;
//    }
//    
//
//    @Override
//    public String toString() {
//        return "AppUser{" + "id=" + id + ", ssoId=" + ssoId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + '}';
//    }
    
    
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty
	@Column(name="sso_id", unique=true, nullable=false)
        
	private String ssoId;
	
	@NotEmpty
	@Column(name="password", nullable=false)
	private String password;
		
	@NotEmpty
	@Column(name="first_name", nullable=false)
	private String firstName;

	@NotEmpty
	@Column(name="last_name", nullable=false)
	private String lastName;

	@NotEmpty
	@Column(name="email", nullable=false)
	private String email;

	@NotEmpty
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "app_user_user_profile", 
             joinColumns = { @JoinColumn(name = "user_id") }, 
             inverseJoinColumns = { @JoinColumn(name = "user_profile_id") })
	private Set<UserProfile> userProfiles = new HashSet<UserProfile>();

    public AppUser() {
    }

    public AppUser(Integer id, String ssoId, String password, String firstName, String lastName, String email) {
        this.id = id;
        this.ssoId = ssoId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public AppUser(String firstName) {
        this.firstName = firstName;
    }
        
        

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSsoId() {
		return ssoId;
	}

	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<UserProfile> getUserProfiles() {
		return userProfiles;
	}

	public void setUserProfiles(Set<UserProfile> userProfiles) {
		this.userProfiles = userProfiles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ssoId == null) ? 0 : ssoId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof AppUser))
			return false;
		AppUser other = (AppUser) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ssoId == null) {
			if (other.ssoId != null)
				return false;
		} else if (!ssoId.equals(other.ssoId))
			return false;
		return true;
	}



    @Override
    public String toString() {
        return "AppUser{" + "id=" + id + ", ssoId=" + ssoId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + '}';
    }
        
        
 
}
