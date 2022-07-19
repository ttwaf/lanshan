package week01;

class Solution extends Test {

    /**
     * 失物排序方法
     *
     * @param lostArray 待排序的失物数组
     */
    public void sortLost(Lost[] lostArray) {

        int num = lostArray.length;
        int[] n = new int[num];
//n[i]为重新编排顺序后的数组的序号
        for (int i = 0; i < num; i++) {
            n[i] = i;
        }
//冒泡排序
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                //判断月份
                if (lostArray[n[j]].getMonth() > lostArray[n[j + 1]].getMonth()) {
                    int temp1 = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp1;
                }
            }
        }
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                //判断同月份日期
                if (lostArray[n[j]].getMonth() == lostArray[n[j + 1]].getMonth()
                        && lostArray[n[j]].getDay() > lostArray[n[j + 1]].getDay()) {
                    int temp1 = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp1;
                }
            }
        }

//输出所有失物
        for (int i = 0; i < num; i++) {
            System.out.println("失物名字：" + lostArray[n[i]].getName());
            System.out.println("丢失时间：" + lostArray[n[i]].getMonth() + "月" + lostArray[n[i]].getDay() + "日");
            System.out.println("丢失地点：" + lostArray[n[i]].getPlace());
            if (lostArray[n[i]] instanceof CardLost) {
                System.out.println("卡号：" + ((CardLost) lostArray[n[i]]).getNumber());
            }
            if (lostArray[n[i]] instanceof BookLost) {
                System.out.println("年级：" + ((BookLost) lostArray[n[i]]).getGrade());
            }
            System.out.println("=======================================");
        }

    }


    /**
     * 按关键字搜索失物的方法，这里假设按照失物的领取地点进行搜索
     *
     * @param lostArray 失物数组
     * @param keyword   用户输入的关键字
     * @return 返回查找到的失物
     */
    public Lost[] selectByKeyword(Lost[] lostArray, String keyword) {
        String[] names = {"一教", "二教", "三教", "四教", "食堂"};
        int flag=0;
        for (int i = 0; i < names.length; i++) {
            if (keyword.equals(names[i])) {
                System.out.println("找到了！！！");
                System.out.println("失物名字：" + lostArray[i].getName());
                System.out.println("丢失时间：" + lostArray[i].getMonth() + "月" + lostArray[i].getDay() + "日");
                if (lostArray[i] instanceof CardLost) {
                    System.out.println("卡号：" + ((CardLost) lostArray[i]).getNumber());
                }
                if (lostArray[i] instanceof BookLost) {
                    System.out.println("年级：" + ((BookLost) lostArray[i]).getGrade());
                }
                System.out.println("=======================================");
                flag = 1;
            }
        }
        if (flag==0){
            System.out.println("很抱歉还没找到");
        }
        return lostArray;
    }
}
