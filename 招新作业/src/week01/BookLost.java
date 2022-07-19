package week01;

public class BookLost extends Lost{

    private int grade;//年级

    public BookLost(String name, int month, int day, String place, int grade) {
        super(name, month, day, place);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
