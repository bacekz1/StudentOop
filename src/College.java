public class College {
    public static void main(String[] args) {
        Student go6o = new Student("Georgi","Math",19);
        Student mariika = new Student("Mariq","physics",20);
        Student pe6o = new Student("Petar","Math",31);
        StudentGroup math = new StudentGroup("Math");
        pe6o.setMoney(153);
        go6o.setMoney(10000);
        math.addStudent(mariika);
        math.addStudent(pe6o);
        go6o.setGrade(1);
        go6o.setGrade(5.21);
        math.addStudent(go6o);
        math.printStudentInGroup();
        System.out.println(math.theBestStudent());
        math.emptyGroup();
        math.printStudentInGroup();
    }
}
