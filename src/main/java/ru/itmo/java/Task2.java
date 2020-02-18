package ru.itmo.java;

import static java.lang.Math.abs;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */
    double getFractionalPart(double realNumber) {
        return realNumber - (int)realNumber;
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c) {
        return c;
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b) {
        return a.equals(b);
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively) {
        if (number == null || leftBound == null || rightBound == null || inclusively == null || leftBound > rightBound)
            return false;
        if (inclusively && (number.equals(leftBound) || number.equals(rightBound)))
        {
            return true;
        }
        if (number < rightBound && number > leftBound)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3) {
        if ('0' <= c1 && c1 <= '9' || '0' <= c2 && c2 <= '9' || '0' <= c3 && c3 <= '9'){
            return true;
        }
        return false;
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b) {
        double eps = 1e-6;
        if (abs(a - b) < eps){
            return true;
        }
        return false;
    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n) {
        if (n % 2 == 0){
            return n + 2;
        }
        return n + 1;
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3) {
        return (num1 + 1)/2 + (num2 + 1)/2 + (num3 + 1)/2;
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N) {
        return N % 10 ^ (N / 10) % 10;
    }

}
