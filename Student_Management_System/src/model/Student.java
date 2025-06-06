package model;

public class Student {
    public int id;
    public String name;
    public int age;
    public String email;
    public String grade;
    public double score;

    public Student(){}

    public Student(int id, String name, int age, String email, String grade, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.grade = grade;
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                ", score=" + score +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
