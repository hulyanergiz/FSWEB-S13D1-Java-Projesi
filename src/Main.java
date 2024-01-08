
public class Main {

    public static void main(String[] args){
        System.out.println("shouldWakeUp");
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));

        System.out.println("hasTeen");
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));

        System.out.println("isCatPlaying");
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));

        System.out.println("rectangular area");
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));

        System.out.println("circular area");
        System.out.println(area(5.0));
        System.out.println(area(-1));
    }


    public static boolean shouldWakeUp(boolean isBarking,int hour) {
        if(hour<0 || hour>23) {
        return false;
        }
        if (!isBarking) {
            return false;
        }
        return hour < 8 || hour > 20;
    }
    public static boolean hasTeen(int... age){
        for(int i:age){
            if (i>=13&& i<=19){
                return true;
            }
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer,int temperature){
        int minTemperature=25;
        int maxTemperature=35;
        if(isSummer){
            maxTemperature=45;

        }
        return temperature>=minTemperature&&temperature<=maxTemperature;
    }
    public static double area(double side1,double side2){
        if(side1<0||side2<0){
            return -1;
        }
        return side1*side2;
    }

    public static double area(double radius){
        if(radius<0){
            return -1;
        }
        return radius*radius*Math.PI;
    }

}