package somePackage.OOP.exe3;

public class MyDate {
    int year;
    int month;
    int day;
    final String[] MONTHS={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
    "Oct", "Nov", "Dec"};
    final String[] DAYS={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    final int[] DAYS_IN_MONTHS={31,28,31,30,31,30,31,31,30,31,30,31};

    public boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public boolean isValidDate(int year, int month, int day){
        if (month==1||month==3||month==5||month==7||month==8|| month==10 || month==12){
            return day >= 1 && day <= 31;
        }
        if (month==4||month==6||month==9||month==11){
            return day >= 1 && day <= 30;
        }
        if(month==2){
            if(isLeapYear(year)){
                return day >= 1 & day <= 29;
            } else return day >= 1 & day <= 28;
        } else return false;
    }

    public MyDate(int year, int month, int day){
        this.isValidDate(year,month,day);
    }

    public void setDate(int year, int month, int day){
        if (this.isValidDate(year,month,day)){
            this.year=year;
            this.month=month;
            this.day=day;
        }else{
            throw new IllegalArgumentException("Invalid year, month or day!");
        }
    }

    public void setYear(int year){
        if (year>=1&&year<=9999){
            this.year=year;
        }else {
            throw new IllegalArgumentException("Invalid year");
        }
    }

    public void setMonth(int month){
        if (month>=1 && month<=12){
            this.month=month;
        } else {
            throw new IllegalArgumentException("Invalid month");
        }
    }
}
