package charpter8;

public class PairWithDiffTypeTest {
    public static void main(String[] args){
        String[] strings = {"mary", "shuanger", "xiao", "li"};
        Integer[] integers = {2, 56, 34, 66};

        PairWithDiffType<String, Integer> stringIntegerPairWithDiffType = MaxType.maxType(strings, integers);
        System.out.println(stringIntegerPairWithDiffType.getFirst());
        System.out.println(stringIntegerPairWithDiffType.getSecond());
    }
}

class MaxType {
    static PairWithDiffType<String, Integer> maxType(String[] strings, Integer[] integers){
        String firstMax = strings[0];
        Integer secondMax = integers[0];
        for(String s : strings){
            if(s.compareTo(firstMax) > 0) firstMax = s;
        }
        for (Integer i : integers){
            if(i.compareTo(secondMax) > 0) secondMax = i;
        }
        return new PairWithDiffType<>(firstMax, secondMax);
    }
}
