package week01;

public class Lost {

    private String name;
    private int month;
    private int day;
    private String place;

    public Lost(String name, int month, int day, String place) {
        this.name = name;
        this.month = month;
        this.day = day;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
