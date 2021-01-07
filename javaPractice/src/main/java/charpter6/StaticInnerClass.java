package charpter6;

public class StaticInnerClass {
    static class Pair {
        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }

    public Pair minMax(double[] numbers){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
         for (double num : numbers){
             if(num > max) max = num;
             if(num < min) min = num;
         }

         return new Pair(min,max);
    }
}
