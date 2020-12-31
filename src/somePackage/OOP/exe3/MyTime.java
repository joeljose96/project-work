package somePackage.OOP.exe3;

public class MyTime {
    int hour=0;
    int minute=0;
    int second=0;

    public MyTime(){
    }


    public MyTime(int hour, int minute, int second){
        this.setTime(hour, minute, second); //Validation carried out by setTime method
    }

    public void setTime(int hour, int minute, int second){
        this.setHour(hour); //input validation carried out because setter method carries out validation
        this.setMinute(minute);
        this.setSecond(second);
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setHour(int hour){
        if (hour>=0 && hour<=23){
            this.hour=hour;
        } else{
            this.hour=0;
            throw new IllegalArgumentException("invalid hour");
        }
    }

    public void setMinute(int minute){
        if (minute>=0 && minute<=59){
            this.minute=minute;
        } else {
            this.minute=0;
            throw new IllegalArgumentException("invalid  minute");
        }
    }

    public void setSecond(int second){
        if (second>=0 && second<=59){
            this.second=second;
        } else {
            this.second=0;
            throw new IllegalArgumentException("invalid second");
        }
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() { //method type is not int so the 'return this' statement at end prints time(because it has to run the toString method)
        ++second;
        if (second == 60) {  // We are sure that second <= 60 here because of the input validation
            second = 0;
            ++minute;
            if (minute == 60) {
                minute = 0;
                ++hour;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;   // Return this instance, to support chaining
    }

    public MyTime nextMinute(){
        ++minute;
        if (minute==60){
            minute=0;
            hour++;
            if (hour==24){
                hour=0;
            }
        }
        return this;
    }

    public MyTime nextHour(){
        hour++;
        if (hour==24){
            hour=0;
        }
        return this;
    }

    public MyTime previousSecond(){
        second--;
        if (second==-1){
            second=59;
            minute--;
            if (minute==-1){
                minute=59;
                hour--;
                if (hour==-1){
                    hour=23;
                }
            }
        }
        return this;
    }

    public MyTime previousHour(){
        hour--;
        if (hour==-1){
            hour=23;
        }
        return this;
    }

}

