package school.entity;

import java.util.List;

public class ClassEntity {
    private String classId;

    private List<StudentEntity> students;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }
}
