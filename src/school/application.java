package school;

import school.entity.StudentEntity;

public class application {
    public static void main(String[] args) {
        StudentEntity stu1 = new StudentEntity("Sam", 23, 1, "11011201");
        System.out.println(stu1.toString());
    }
}
