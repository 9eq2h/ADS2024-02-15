package by.it.group310901.lisovitskii.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить рекурсивный способ вычисления чисел Фибоначчи
 */

public class FiboA {
    private long startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        // .calc(n)
        var fibo = new FiboA();
        int n = 33;
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", n, fibo.calc(n), fibo.time());

        // .slowA(n)
        fibo = new FiboA();
        n = 34;
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", n, fibo.slowA(n), fibo.time());
    }

    private long time() {
        long res = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        return res;
    }

    // Здесь простейший вариант, в котором код совпадает с математическим определением чисел Фибоначчи
    // Время O(2^n)
    private int calc(int n) {
        return (n == 0 || n == 1) ? n : calc(n - 1) + calc(n - 2);
    }

    // Здесь нужно реализовать вариант без ограничения на размер числа, в котором код совпадает с математическим
    // определением чисел Фибоначчи
    // Время O(2^n)
    BigInteger slowA(Integer n) {
        return (n == 0 || n == 1) ? BigInteger.valueOf(n) : slowA(n - 1).add(slowA(n - 2));
    }
}
