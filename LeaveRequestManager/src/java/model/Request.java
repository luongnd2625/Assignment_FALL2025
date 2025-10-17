package model;

import java.util.Date;

public class Request {
    private int requestId;
    private User user;
    private Date fromDate;
    private Date toDate;
    private String reason;
    private String status;
    private User processedBy;
    private String processReason;

    public Request() {
    }

    public Request(int requestId, User user, Date fromDate, Date toDate, String reason, String status, User processedBy, String processReason) {
        this.requestId = requestId;
        this.user = user;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.reason = reason;
        this.status = status;
        this.processedBy = processedBy;
        this.processReason = processReason;
    }

    public int getRequestId() {
        return requestId;
    }

    public User getUser() {
        return user;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }

    public User getProcessedBy() {
        return processedBy;
    }

    public String getProcessReason() {
        return processReason;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setProcessedBy(User processedBy) {
        this.processedBy = processedBy;
    }

    public void setProcessReason(String processReason) {
        this.processReason = processReason;
    }
    
   
}
