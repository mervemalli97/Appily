package com.nyo.appily.Models;

import javax.persistence.*;

@Entity
@Table(name = "notes", schema = "public", catalog = "dalmm4hdjlfmnd")
public class NotesEntity {

    @Id
    @Column(name = "noteid")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long noteid;
    private String title;
    private String text;
    private String timeStamp;
    private String leftByUser;

    @Id
    @Column(name = "noteid", nullable = false)
    public long getNoteid() {
        return noteid;
    }


    public void setNoteid(int noteid) {
        this.noteid = noteid;
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
    @Column(name = "text", nullable = true, length = -1)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "timeStamp", nullable = true, length = -1)
    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Basic
    @Column(name = "leftByUser", nullable = true, length = -1)
    public String getLeftByUser() {
        return leftByUser;
    }

    public void setLeftByUser(String leftByUser) {
        this.leftByUser = leftByUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NotesEntity that = (NotesEntity) o;

        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (timeStamp != null ? !timeStamp.equals(that.timeStamp) : that.timeStamp != null) return false;
        if (leftByUser != null ? !leftByUser.equals(that.leftByUser) : that.leftByUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (timeStamp != null ? timeStamp.hashCode() : 0);
        result = 31 * result + (leftByUser != null ? leftByUser.hashCode() : 0);
        return result;
    }
}
