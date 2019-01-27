package lk.ijse.studentmanagement.dto;


public class BatchDto {
    private String batchID;
    private int cid;
    private CourseDto course;

    public BatchDto() {
    }

    public BatchDto(String batchID, CourseDto course) {
        this.batchID = batchID;
        this.course = course;
    }

    public BatchDto(String batchID, int cid) {
        this.batchID = batchID;
        this.cid = cid;
    }

    public BatchDto(String batchID) {
        this.batchID = batchID;
    }

    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    public CourseDto getCourse() {
        return course;
    }

    public void setCourse(CourseDto course) {
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
        return "BatchDto{" +
                "batchID='" + batchID + '\'' +
                ", cid=" + cid +
                ", course=" + course +
                '}';
    }
}
