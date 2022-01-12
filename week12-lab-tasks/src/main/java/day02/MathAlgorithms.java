package day02;

public class MathAlgorithms {

    public int findGreatestCommonDivisor(int numberFirst, int numberSecond) {
        int commonDivisor = 1;
        for (int i = Math.max(numberFirst, numberSecond); i > 1; i--) {
            if (numberFirst % i == 0 && numberSecond % i == 0) {
                commonDivisor = i;
                return commonDivisor;
            }
        }
        return commonDivisor;
    }

    public int findWithEuclideanAlgorithm(int numberFirst, int numberSecond) {
        while (numberFirst != numberSecond) {
            if (numberFirst > numberSecond) {
                numberFirst -= numberSecond;
            } else {
                numberSecond -= numberFirst;
            }
        }
        return numberFirst;
    }
}