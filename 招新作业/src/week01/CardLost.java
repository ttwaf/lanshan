package week01;

public class CardLost extends Lost{

    private String number;//卡号

    public CardLost(String name, int month, int day, String place, String number) {
        super(name, month, day, place);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
