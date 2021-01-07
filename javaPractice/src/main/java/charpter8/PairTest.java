package charpter8;

import java.util.Date;

public class PairTest {
    public static void main(String[] args) {

        String[] strings = {"mary", "shuanger", "xiao", "li"};
        Pair<String> stringPair = ArrayAlg.minMax(strings);
//        System.out.println("min: "+ stringPair.getFirst());
//        System.out.println("max: "+ stringPair.getSecond());

        Pair<String> stringPair1 = Pair.makePair(String::new);
        stringPair1.setFirst("deee");
        stringPair1.setSecond("ddddd");


        Pair<Date> datePair = Pair.makePair(Date::new);
        datePair.setFirst(new Date());

        System.out.println(datePair.getFirst());

        Pair<String> comparablePair = new Pair<>();

    }
}

class ArrayAlg{
    static  Pair<String> minMax(String[] a){
        if(a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for (String s: a){
            if(s.compareTo(min) < 0) min = s;
            if(s.compareTo(max) > 0) max = s;
        }
        return new Pair<>(min, max);
    }
}
