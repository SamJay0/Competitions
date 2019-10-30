import java.util.ArrayList;

public class Test {
    static BadHorse badHorse=new BadHorse();
     static ArrayList<TroublesomePair> myPairs=new ArrayList<>();
    public static void main(String[] args) {
        myPairs=badHorse.takeInput();
        System.out.println(badHorse.canBeSplited(myPairs));


    }
}
