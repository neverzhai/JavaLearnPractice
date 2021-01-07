package charpter8;

import java.util.ArrayList;

public class ConstraintAndLimited {
    public static void main(String[] args) {
        //Error
//        Pair<String>[] errorPairs = new Pair<String>[10];
        Pair<String>[] pairs =(Pair<String>[]) new Pair<?>[10];
        ArrayList<Pair<String>> pairs1 = new ArrayList<>();

        Pair<String> stringPair = new Pair<>("xiao", "shuang");
        Pair<String> stringPair1 = new Pair<>("dong", "dong");
        Pair<String>[] array = Constraint.array(stringPair, stringPair1);
    }
}

class Constraint {
    //定义一个泛型方法
    @SafeVarargs
    static <E> E[] array(E...array) {
        return array;
    }
}
