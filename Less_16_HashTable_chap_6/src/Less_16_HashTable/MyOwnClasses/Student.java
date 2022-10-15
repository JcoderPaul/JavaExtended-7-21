package Less_16_HashTable.MyOwnClasses;

import java.util.Objects;

public final class Student implements Comparable<Student> {
    private final String name;
    private final String surname;
    private final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }
    // В случае сортировки сначала идет имя, если оно совпадает, затем фамилия
    @Override
    public int compareTo(Student anotherStudent) {
        if(this.name.compareTo(anotherStudent.name) == 0) {
            return this.surname.compareTo(anotherStudent.surname);
        } else {
            return this.name.compareTo(anotherStudent.name);
        }
    }
}
