public class StudentGroup {
    final private static String emptyGroup = "The group is empty";
    private String groupSubject;
    private Student[] student;
    private int freePlaces;

    StudentGroup() {
        this.student = new Student[5];
        this.freePlaces = 5;
    }

    StudentGroup(String groupSubject) {
        this();
        this.groupSubject = groupSubject;
    }

    void addStudent(Student s) {
        if (!s.getSubject().equals(groupSubject)) {
            System.out.println("Wrong group");
        } else {
            if (freePlaces < 1) {
                System.out.println("There are no free place");
            } else {
                student[5 - freePlaces] = s;
                freePlaces--;
            }
        }
    }

    void emptyGroup() {
        this.student = new Student[5];
        this.freePlaces = 5;
    }

    String theBestStudent() {
        if (isEmpty()) {
            return emptyGroup;
        } else {
            String result = "";
            double grade = 0;
            for (int i = 0; i < this.student.length; i++) {
                if (!isNull(student[i])) {
                    if (student[i].getGrade() > grade) {
                        grade = student[i].getGrade();
                        result = student[i].getName();
                    }
                }
            }
            return result;
        }
    }

    void printStudentInGroup() {
        if (isEmpty()) {
            System.out.println(emptyGroup);
        }

        for (int i = 0; i < this.student.length; i++) {
            if (!isNull(student[i])) {
                printHelper(student[i]);
            } else {
                break;
            }
        }
    }

    private void printHelper(Student student) {
        System.out.printf("Name:%s\nSubject:%s\nGrade:%.2f\nYear in college:%d\nAge:%d\nIs degree:%b\nMoney:%.2f",
                student.getName(), student.getSubject(), student.getGrade(), student.getYearInCollege(),
                student.getAge(), student.isDegree(), student.getMoney());
        System.out.println();
        System.out.println();
    }

    private boolean isNull(Student student) {
        return student == null;
    }

    private boolean isEmpty() {
        return freePlaces == 5;
    }
}
