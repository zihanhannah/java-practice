package Encapsulation;

import javax.imageio.stream.ImageInputStream;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        this(1,1,1990);
    }

    public MyDate(int day, int month, int year) {
        setDate( day, month, year);
    }

    public String toString(){
        return month + "/" + day + "/" + year;
    }

    public static void leapYears(){
        for(int i = 1752; i <= 2020; i = i +4){
            if((i % 4 == 0) && (i % 100 != 0) || (i % 400 ==0)){
                System.out.println("the year" + i + "is a leap year");
            }
        }
    }
    private void setDate(int day, int month, int year) {
        if(valid(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    private boolean valid(int day, int month, int year) {
        if (day > 31 || day < 1 || month > 12 || month < 1) {
            System.out.println("Attempting to create a non-valid date "+
                    month + "/" + day + "/" + year);
            return false;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return (day <= 30);
            case 2:
                return day <= 28 || (day == 29 && year % 4 == 0); }
        return true;
    }

        public int getDay () {
            return day;
        }

        public void setDay ( int day){
            if (valid(day, month, year)) {
                this.day = day;
            }
        }

        public void getMonth () {
            this.month = month;
        }

        public void setMonth ( int month){
            if (valid(day, month, year)) {
                this.month = month;
            }

        }

        public int getYear () {
            return year;
        }

        public void setYear ( int year){
            if (valid(day, month, year)) {
                this.year = year;
            }
        }

        public static void main (String[]args){
                    MyDate date1 = new MyDate(11, 11, 1918);
                    MyDate date2 = new MyDate();
                    date2.setDay(11);
                    date2.setMonth(11);
                    date2.setYear(1918);
                    MyDate date3 = new MyDate();
                    date3.setDate(13, 40, -1);
                    String str1 = date1.toString();
                    String str2 = date2.toString();
                    String str3 = date3.toString();
                    System.out.println(str1);
                    System.out.println(str2);
                    System.out.println(str3);
                    MyDate.leapYears();
            }
}
