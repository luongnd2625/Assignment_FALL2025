package model;

import java.util.Date;

public class Agenda {
    private int agendaId;
    private User user;
    private Date workDate;
    private String status; //Check present or leave

    public Agenda() {
    }

    public Agenda(int agendaId, User user, Date workDate, String status) {
        this.agendaId = agendaId;
        this.user = user;
        this.workDate = workDate;
        this.status = status;
    }

    public int getAgendaId() {
        return agendaId;
    }

    public User getUser() {
        return user;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public String getStatus() {
        return status;
    }

    public void setAgendaId(int agendaId) {
        this.agendaId = agendaId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
