public class MathExamples {
    public static void main(String[] args) {
        int Value = -45;
        System.out.println(Math.abs(-45));

        double Score1 = 3.5;
        double Score2 = 7.8;
        System.out.println(Math.max(3.5, 7.8));

        int Test1 = 99;
        int Test2 = 23;
        System.out.println(Math.min(99, 23));

        double var1 = 8.9;
        System.out.println(Math.floor(8.9));

        double var2 = 5.2;
        System.out.println(Math.ceil(5.2));

        double num3 = 9.6;
        System.out.println(Math.round(9.6));

        double mornTemp = -3.7;
        double afterTemp = 12.4;
        System.out.println(Math.abs(mornTemp - afterTemp));
        System.out.println(Math.max(-3.7, 12.4));
        System.out.println(Math.min(-3.7, 12.4));
        System.out.println(Math.round(12.4));
        System.out.println(Math.floor(-3.7));

        double price = 10.876;
        double roundNbr = (double) Math.round(price * 100) / 100;
        System.out.println(roundNbr);

        int seconds = 320;
        int fullMinutes = seconds / 60;
        System.out.println(fullMinutes);

        double fullMinutes2 = seconds / 60.0;
        System.out.println(Math.ceil(fullMinutes2));
        System.out.println(Math.floor(fullMinutes2));

        double price1 = 3.87;



    }
}
