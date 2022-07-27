public class Student {

    private String name;
    private String subject;
    private double grade;
    private int yearInCollege;
    private int age;
    private boolean isDegree;
    private double money;

    Student() {
        this.grade = 4.0;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.money = 0;
    }

    public Student(String name, String subject, int age) {
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    String getSubject() {
        return subject;
    }

    String getName() {
        return name;
    }

    double getGrade() {
        return grade;
    }

    int getYearInCollege() {
        return yearInCollege;
    }

    int getAge() {
        return age;
    }

    boolean isDegree() {
        return isDegree;
    }

    double getMoney() {
        return money;
    }

    void setGrade(double grade) {
        if (grade<2 || grade>6){
            System.out.println("Grade should be between 2 and 6");
        }
        this.grade = grade;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    void upYear() {
        if (!isDegree) {
            yearInCollege++;
        } else {
            System.out.println("Тhe student has already graduated");
        }
        if (yearInCollege == 4) {
            isDegree = true;
        } else if (yearInCollege > 4) {
            System.out.println("How?! Why broke my code ;(");
        }
    }

    double receiveScholarship(double min, double amount) {
        if (grade > min && age < 30) {
            return money += amount;
        } else {
            return -1;
        }
    }

}
