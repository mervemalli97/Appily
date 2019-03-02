package com.nyo.appily.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "chores", schema = "public", catalog = "dalmm4hdjlfmnd")
@EntityListeners({AuditingEntityListener.class})
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true )
public class ChoresEntity {
    @Id
    @Column(name = "choreid")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long choreid;

    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "isChoreDone")
    private Boolean isChoreDone;
    @Column(name = "assignedUser")
    private String assignedUser;
    @Column(name = "doneByUser")
    private String doneByUser;

    @Basic
    @Column(name = "choreid")
    public long getChoreId() {
        return choreid;
    }

    @Basic
    @Column(name = "title", nullable = true, length = -1)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "isChoreDone", nullable = true)
    public Boolean getChoreDone() {
        return isChoreDone;
    }

    public void setChoreDone(Boolean choreDone) {
        isChoreDone = choreDone;
    }

    @Basic
    @Column(name = "assignedUser", nullable = true, length = -1)
    public String getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(String assignedUser) {
        this.assignedUser = assignedUser;
    }

    @Basic
    @Column(name = "doneByUser", nullable = true, length = -1)
    public String getDoneByUser() {
        return doneByUser;
    }

    public void setDoneByUser(String doneByUser) {
        this.doneByUser = doneByUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChoresEntity that = (ChoresEntity) o;

        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (isChoreDone != null ? !isChoreDone.equals(that.isChoreDone) : that.isChoreDone != null) return false;
        if (assignedUser != null ? !assignedUser.equals(that.assignedUser) : that.assignedUser != null) return false;
        if (doneByUser != null ? !doneByUser.equals(that.doneByUser) : that.doneByUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isChoreDone != null ? isChoreDone.hashCode() : 0);
        result = 31 * result + (assignedUser != null ? assignedUser.hashCode() : 0);
        result = 31 * result + (doneByUser != null ? doneByUser.hashCode() : 0);
        return result;
    }

}
