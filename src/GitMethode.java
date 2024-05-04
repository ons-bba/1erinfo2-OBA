public class GitMethode {


    public static int sum(int[] array) {
        int total = 0;
        for (int element : array) {
            total += element +1;
        }
        return total;
    }



    public static double average(int[] array) {
        int sum = sum(array);
        return (double) sum / array.length;
    }




    public static boolean isEven(int n) {
        return n % 2 == 0;
    }



    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }




























}
