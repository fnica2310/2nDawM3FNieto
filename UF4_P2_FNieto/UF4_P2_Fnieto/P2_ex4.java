package UF4_P2_Fnieto;
//Pido los nombres de las clases exactas, no puedes poner P2_ex4 en este caso.
public class P2_ex4 {
    private int day;
    private int month;
    private int year;
    public P2_ex4() {
        day = 1;
        month = 1;
        year = 2023;
    }
    public P2_ex4(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setDay(int day) {
        if (isValidDate(day, month, year)) {
            this.day = day;
        }
    }
    public void setMonth(int month) {
        if (isValidDate(day, month, year)) {
            this.month = month;
        }
    }
    public void setYear(int year) {
        if (isValidDate(day, month, year)) {
            this.year = year;
        }
    }
    private boolean isValidDate(int day, int month, int year) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }
        int maxDaysInMonth = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDaysInMonth = 30;
        } else if (month == 2) {
        	//No hemos dado las terciarias aún... así que es sospechoso su uso...
            maxDaysInMonth = isLeapYear(year) ? 29 : 28;
        }
        return day <= maxDaysInMonth;
    }
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}