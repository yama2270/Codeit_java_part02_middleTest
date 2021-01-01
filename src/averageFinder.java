public class averageFinder {
    double computeAverage(int[] intArray) {

        double plus = 0;

        for(int i=0; i<intArray.length; i++) {
            plus = plus + intArray[i];
        }

        return plus/ intArray.length;
    }
}
