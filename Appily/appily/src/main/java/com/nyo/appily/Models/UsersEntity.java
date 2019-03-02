package com.nyo.appily.Models;

import javax.persistence.*;

@Entity
@Table(name = "users", schema = "public", catalog = "dalmm4hdjlfmnd")
public class UsersEntity {

    @Id
    @Column(name = "userid")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long userid;
    private String usrName;
    private String usrSurname;
    private String email;
    private String password;
    private String dislikedChore;

    @Id
    @Column(name = "userid", nullable = false)
    public long getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "usrName", nullable = true, length = -1)
    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    @Basic
    @Column(name = "usrSurname", nullable = true, length = -1)
    public String getUsrSurname() {
        return usrSurname;
    }

    public void setUsrSurname(String usrSurname) {
        this.usrSurname = usrSurname;
    }

    @Basic
    @Column(name = "email", nullable = true, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password", nullable = true, length = -1)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "dislikedChore", nullable = true, length = -1)
    public String getDislikedChore() {
        return dislikedChore;
    }

    public void setDislikedChore(String dislikedChore) {
        this.dislikedChore = dislikedChore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (usrName != null ? !usrName.equals(that.usrName) : that.usrName != null) return false;
        if (usrSurname != null ? !usrSurname.equals(that.usrSurname) : that.usrSurname != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (dislikedChore != null ? !dislikedChore.equals(that.dislikedChore) : that.dislikedChore != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usrName != null ? usrName.hashCode() : 0;
        result = 31 * result + (usrSurname != null ? usrSurname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (dislikedChore != null ? dislikedChore.hashCode() : 0);
        return result;
    }
}
