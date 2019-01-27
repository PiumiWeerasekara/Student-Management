package lk.ijse.studentmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "batch")
public class Batch {
    @Id
    @Column(name = "batch_id")
    private String batchID;

    @Column(name = "course_id")
    private int cid;

//    @ManyToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "course_id",referencedColumnName = "course_id", insertable = false, updatable = false)
    private Course course;

    public Batch() {

    }

    public Batch(String batchID, Course course) {
        this.batchID = batchID;
        this.course = course;
    }

    public Batch(String batchID) {
        this.batchID = batchID;
    }

    public Batch(String batchID, int cid) {
        this.batchID = batchID;
        this.cid = cid;
    }

    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchID='" + batchID + '\'' +
                ", cid=" + cid +
                ", course=" + course +
                '}';
    }
}
