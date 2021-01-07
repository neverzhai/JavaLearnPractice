package charpter3;

public class StringPractice {
    public static void main(String[] args){
        String helloWorld = "Hello World";

        System.out.println("length: "+ helloWorld.length());
        System.out.println("charAt: "+ helloWorld.charAt(2));
        System.out.println("codePoint"+ helloWorld.codePoints().toArray());
        int[] codePoints = helloWorld.codePoints().toArray();
        for (int number: codePoints){
            System.out.print(number);
        }
        System.out.println();
        System.out.println("equals: "+ helloWorld.equals("hello world"));
        System.out.println("equal ignorecase: "+ helloWorld.equalsIgnoreCase("hello world"));

        System.out.println("startWith: "+ helloWorld.startsWith("He"));
        System.out.println("endWith:" + helloWorld.endsWith("ld"));
        System.out.println("replace: " + helloWorld.replace("lo", "lp"));
        System.out.println("subString: "+ helloWorld.substring(0, 5));
        System.out.println("to lowercase: "+ helloWorld.toLowerCase());
        System.out.println("to upper case: " + helloWorld.toUpperCase());
        System.out.println("join: "+ String.join(",", "hello", "shuanger", "Jack"));
    }
}

