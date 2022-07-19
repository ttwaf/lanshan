package week01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//
        Lost[] lostArray = new Lost[6];
        lostArray[0] = new Lost("水杯", 5,25, "一教");
        lostArray[1] = new Lost("项链", 4,24, "二教");
        lostArray[2] = new CardLost("小明的学生卡", 3,26,"三教","0000001" );
        lostArray[3] = new CardLost("大黄的学生卡", 3,3, "食堂", "0000002");
        lostArray[4] = new BookLost("计算机网络", 1,2, "四教",2 );
        lostArray[5] = new BookLost("高等数学", 2,19, "食堂",1 );
//测试排序
        Solution test1 = new Solution();
        test1.sortLost(lostArray);
//测试按关键字搜索：一教，二教，三教，四教，食堂
        Scanner myScanner = new Scanner(System.in);
        String keyword = myScanner.next();
        test1.selectByKeyword(lostArray,keyword);
    }
}
