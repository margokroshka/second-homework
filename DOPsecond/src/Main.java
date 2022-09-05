import java.util.Random;
import java.util.Scanner;


//дополнительное задание 1а
public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int xx = scann.nextInt();
        System.out.println(xx);

        Random random = new Random();
        int y = random.nextInt(99);
        System.out.println(y);

        double A=xx-( xx *15/100);
        System.out.println("A= "+A);
        int B=y;
        System.out.println("B= "+B);
        System.out.println("Результат первой задачи "+((10*A)+(2*B)));

//дополнительное задание 1б

        Scanner scann1 = new Scanner(System.in);
        int xx1 = scann1.nextInt();
        System.out.println(xx);

        Random random1 = new Random();
        int y1 = random1.nextInt(99);
        System.out.println(y);
        double A1=xx1-( xx1 *50/100);
        System.out.println("A= "+A1);
        int B1=y1;
        System.out.println("B= "+B1);
        System.out.println("Результат второй задачи "+((7*A1)+B1));

        //дополнительное задание 1в

        Scanner scann2 = new Scanner(System.in);
        int xx2 = scann2.nextInt();
        System.out.println(xx);

        Random random2 = new Random();
        int y2 = random2.nextInt(99);
        System.out.println(y);
        double A2=xx2-( xx2 *10/100);
        System.out.println("A= "+A2);
        int B2=y2;
        System.out.println("B= "+y2);
        System.out.println("Результат третьей задачи "+((2*A2)+(3*B2)));

// Второе Доп Задание
public class Main {
   public static void main(String[] args) {
       Scanner scann = new Scanner(System.in);
       int x = scann.nextInt();

       Random random = new Random();
       int y = random.nextInt(30);
       System.out.println(y);

       int A=x;
       int B=y;

       Scanner С1 = new Scanner(System.in);
       int С = С1.nextInt();
       System.out.println("Сумма покупок клиента "+С);

       if (С==A+B)
       {
           System.out.println("Сумма скидки в 10%= "+(double)((A+B)*10/100));
           System.out.println("За две покупки вы получаете скидку 10% окончательная цена = "+(С-((A+B)*10/100)));

       }else{
           System.out.println("Вам не предоставляется скидка "+С);
       }

// Третье и Четвертое Доп Задание
public class Main {
    public static void main(String[] args) {
        double x =5;
        double y =10;
        // динамическая инициализация переменной c
        double c = Math.sqrt ((x*x) +(y*y));
        System.out.println(c);

        Scanner scann = new Scanner(System.in);
        double xx = scann.nextInt();
        Scanner scann1 = new Scanner(System.in);
        int yy = scann1.nextInt();
        double cc = Math.sqrt ((xx*xx) +(yy*yy));
        System.out.println(cc);

// Пятое Доп Задание
public class Main {
    public static void main(String[] args) {
        Scanner Q1 = new Scanner(System.in);
        int q = Q1.nextInt();
        Scanner W1 = new Scanner(System.in);
        int w = W1.nextInt();
        int A = q % w;
        System.out.println(A);
        int B = q / w;
        System.out.println(B);
        System.out.println(q + " / " + w + " = " + B + " и " + A + " в остатке");


// шестое доп задание
public class Main {
    public static void main(String[] args) {
        Scanner M1 = new Scanner(System.in);
        int n = M1.nextInt();
        int m = n / 100;
        System.out.println(m);
        int m1 = n % 10;
        System.out.println(m1);
        int m2 = n / 10;
        System.out.println(m2);
        int m3 = (m2 % 10);
        System.out.println(m3);
        int nS = m1 + m + m3;
        System.out.println(nS);

// седьмое доп задание
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        float f = random.nextFloat();
        System.out.println(f);
        float k = Math.round(f);
        System.out.println(k);


// восьмое доп задание
public class Main {
    public static void main(String[] args) {
        System.out.println("Привет!");
        long z = 2147483647 + 1;

// девятое доп задание
public class Main {
    public static void main(String[] args) {
        int x = 5, y = 7, z = 0, k = 9;
        z = x*x + y*y;
        System.out.println("Первое выражение!"+z);
        z = x*x*x;
        System.out.println("второе выражение!"+z);
        k = x / z;
        System.out.println("третье выражение!"+k);

// десятое доп задание
public class Main {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2, k = 3, x1 = 4, y1 = 5, z1 = 6, k1 = 7, x2 = 8, y2 = 9;
        int r = (x+y+z+k+x1+y1+z1+x2+y2)/10;
        System.out.println("Сумма int"+r);
        double x0 = 0, y0 = 1, z0 = 2, k0 = 3, x10 = 4, y10 = 5, z10 = 6, k10 = 7, x20 = 8, y20 = 9;
        double r10 = (x0+y0+z0+k0+x10+y10+z10+x20+y20)/10;
        System.out.println("Сумма double"+r10);

// 11 ?????
public class Main {
     public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int x = in.nextInt();
     System.out.println(Integer.toBinaryString(x));
    }
}