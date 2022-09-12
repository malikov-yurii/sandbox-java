package tmp.lesson04.practice;

/**
 * Created by Malikov on 4/20/2017.
 */
public class ThirdTask {

    public static void main(String[] args) {
        System.out.println(
                "method getYearsToReachSumByRate1 :\n"
                        + getYearsToReachSumByRate1(10_000, 10, 110_000) + '\n'
                        + getYearsToReachSumByRate1(10_000, 10, 11_000) + '\n'
                        + getYearsToReachSumByRate1(10_000, 10, 11_001) + '\n'
                        + getYearsToReachSumByRate1(10_000, 10, 9_000) + '\n'
                        + getYearsToReachSumByRate1(10_000, 10, 10_000) + '\n'
                        + "method getYearsToReachSumByRate2 :\n"
                        + getYearsToReachSumByRate2(10_000, 10, 110_000) + '\n'
                        + getYearsToReachSumByRate2(10_000, 10, 11_000) + '\n'
                        + getYearsToReachSumByRate2(10_000, 10, 11_001) + '\n'
                        + getYearsToReachSumByRate2(10_000, 10, 9_000) + '\n'
                        + getYearsToReachSumByRate2(10_000, 10, 10_000) + '\n'
                        + "method getYearsToReachSumByRate3 :\n"
                        + getYearsToReachSumByRate3(10_000, 10, 110_000) + '\n'
                        + getYearsToReachSumByRate3(10_000, 10, 11_000) + '\n'
                        + getYearsToReachSumByRate3(10_000, 10, 11_001) + '\n'
                        + getYearsToReachSumByRate3(10_000, 10, 9_000) + '\n'
                        + getYearsToReachSumByRate3(10_000, 10, 10_000) + '\n'
                        + "method getYearsToReachSumByRate4 :\n"
                        + getYearsToReachSumByRate4(10_000, 10, 110_000) + '\n'
                        + getYearsToReachSumByRate4(10_000, 10, 11_000) + '\n'
                        + getYearsToReachSumByRate4(10_000, 10, 11_001) + '\n'
                        + getYearsToReachSumByRate4(10_000, 10, 9_000) + '\n'
                        + getYearsToReachSumByRate4(10_000, 10, 10_000) + '\n'
                        + "method getYearsToReachSumByRate5 :\n"
                        + getYearsToReachSumByRate5(10_000, 10, 110_000) + '\n'
                        + getYearsToReachSumByRate5(10_000, 10, 11_000) + '\n'
                        + getYearsToReachSumByRate5(10_000, 10, 11_001) + '\n'
                        + getYearsToReachSumByRate5(10_000, 10, 9_000) + '\n'
                        + getYearsToReachSumByRate5(10_000, 10, 10_000) + '\n'
                        + "method getYearsToReachSumByRate6 :\n"
                        + getYearsToReachSumByRate6(10_000, 10, 110_000) + '\n'
                        + getYearsToReachSumByRate6(10_000, 10, 11_000) + '\n'
                        + getYearsToReachSumByRate6(10_000, 10, 11_001) + '\n'
                        + getYearsToReachSumByRate6(10_000, 10, 9_000) + '\n'
                        + getYearsToReachSumByRate6(10_000, 10, 10_000) + '\n'
                        + "method getYearsToReachSumByRate7 :\n"
                        + getYearsToReachSumByRate7(10_000, 10, 110_000) + '\n'
                        + getYearsToReachSumByRate7(10_000, 10, 11_000) + '\n'
                        + getYearsToReachSumByRate7(10_000, 10, 11_001) + '\n'
                        + getYearsToReachSumByRate7(10_000, 10, 9_000) + '\n'
                        + getYearsToReachSumByRate7(10_000, 10, 10_000) + '\n'
                        + "method getYearsToReachSumByRate8 :\n"
                        + getYearsToReachSumByRate8(10_000, 10, 110_000) + '\n'
                        + getYearsToReachSumByRate8(10_000, 10, 11_000) + '\n'
                        + getYearsToReachSumByRate8(10_000, 10, 11_001) + '\n'
                        + getYearsToReachSumByRate8(10_000, 10, 9_000) + '\n'
                        + getYearsToReachSumByRate8(10_000, 10, 10_000) + '\n'
                        + "method getYearsToReachSumByRate9 :\n"
                        + getYearsToReachSumByRate9(10_000, 10, 110_000) + '\n'
                        + getYearsToReachSumByRate9(10_000, 10, 11_000) + '\n'
                        + getYearsToReachSumByRate9(10_000, 10, 11_001) + '\n'
                        + getYearsToReachSumByRate9(10_000, 10, 9_000) + '\n'
                        + getYearsToReachSumByRate9(10_000, 10, 10_000) + '\n'
                        + "method getYearsToReachSumByRate10 :\n"
                        + getYearsToReachSumByRate10(10_000, 10, 110_000) + '\n'
                        + getYearsToReachSumByRate10(10_000, 10, 11_000) + '\n'
                        + getYearsToReachSumByRate10(10_000, 10, 11_001) + '\n'
                        + getYearsToReachSumByRate10(10_000, 10, 9_000) + '\n'
                        + getYearsToReachSumByRate10(10_000, 10, 10_000) + '\n'
        );

        getYearsToReachSumByRate11(10_000, 10, 11_000);


    }

    private static int getYearsToReachSumByRate1(double sum, double rate, double desiredSum) {
        int years = 0;
        while (sum < desiredSum) {
            sum *= 1 + rate / 100;
            years++;
        }
        return years;
    }

    private static int getYearsToReachSumByRate2(double sum, double rate, double desiredSum) {
        int years = 0;
        if (sum < desiredSum) {
            do {
                sum *= 1 + rate / 100;
                years++;
            } while (sum < desiredSum);
        }
        return years;
    }

    private static int getYearsToReachSumByRate3(double sum, double rate, double desiredSum) {
        int years = 0;
        for (; sum < desiredSum; years++) {
            sum *= 1 + rate / 100;
        }
        return years;
    }

    private static int getYearsToReachSumByRate4(double sum, double rate, double desiredSum) {
        int years = 0;
        while (true) {
            if (sum < desiredSum) {
                sum *= 1 + rate / 100;
            } else {
                return years;
            }
            years++;
        }
    }

    private static int getYearsToReachSumByRate5(double sum, double rate, double desiredSum) {
        int years = 0;
        do{
            if (sum < desiredSum) {
                sum *= 1 + rate / 100;
            } else {
                return years;
            }
            years++;
        }while (true);
    }

    private static int getYearsToReachSumByRate6(double sum, double rate, double desiredSum) {
        int years = 0;
        for(;;) {
            if (sum < desiredSum) {
                sum *= 1 + rate / 100;
            } else {
                return years;
            }
            years++;
        }
    }

    private static int getYearsToReachSumByRate7(double sum, double rate, double desiredSum) {
        int years = 0;
        while (true) {
            if (sum < desiredSum) {
                sum *= 1 + rate / 100;
            } else {
                break;
            }
            years++;
        }
        return years;
    }

    private static int getYearsToReachSumByRate8(double sum, double rate, double desiredSum) {
        int years = 0;
        label:
        while (true) {
            if (sum >= desiredSum) {
                break label;
            }
            sum *= 1 + rate / 100;
            years++;
        }
        return years;
    }

    private static int getYearsToReachSumByRate9(double sum, double rate, double desiredSum) {
        int years = 0;
        label:
        do{
            if (sum >= desiredSum) {
                break label;
            }
            sum *= 1 + rate / 100;
            years++;
        }while (true);
        return years;
    }

    private static int getYearsToReachSumByRate10(double sum, double rate, double desiredSum) {
        int years = 0;
        label:
        for(;;) {
            if (sum >= desiredSum) {
                break label;
            }
            sum *= 1 + rate / 100;
            years++;
        }
        return years;
    }

    private static void getYearsToReachSumByRate11(double sum, double rate, double desiredSum) {
        int years = 0;

        while (true) {
            if (sum < desiredSum) {
                sum *= 1 + rate / 100;
            } else {
                System.out.println("years in method11() = " + years);
                System.exit(0);
            }
            years++;
        }

    }

}
