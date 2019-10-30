import java.util.ArrayList;
import java.util.Scanner;

public class BadHorse {
    ArrayList<TroublesomePair> myPairs = new ArrayList<TroublesomePair>();
    ArrayList<String> caseResults = new ArrayList<>();

    public boolean canBeSplited(ArrayList<TroublesomePair> list) {
        ArrayList<String> firstSplit = new ArrayList<>();
        ArrayList<String> secondSplit = new ArrayList<>();
        firstSplit.add(list.get(0).first);
        secondSplit.add(list.get(0).second);
        //check for first elements in the troublesome pairs from position one
        TroublesomePair pair1;
        TroublesomePair pair2;
        boolean addedToFirstSplit=true;
        boolean existsInFirstSplit=false;
        boolean addedToSecondSplit =true;
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < firstSplit.size(); j++) {
                pair1 = new TroublesomePair(firstSplit.get(j), list.get(i).first);
                pair2 = new TroublesomePair(list.get(i).first, firstSplit.get(j));
                if (!(isThereSuchAPairs(pair1, pair2, myPairs)) && !(isThereThisMemberInTheList(list.get(i).first,firstSplit))) {
                    firstSplit.add(list.get(i).first);
                    break;
                }
                else if(isThereThisMemberInTheList(list.get(i).first,firstSplit)){
                   existsInFirstSplit=true;
                }
                else{
                    addedToFirstSplit=false;
                }

            }

        }
        if(!addedToFirstSplit && !existsInFirstSplit ){
            for (int i = 1; i < list.size(); i++) {
                for (int j = 0; j < secondSplit.size(); j++) {
                    pair1 = new TroublesomePair(secondSplit.get(j), list.get(i).first);
                    pair2 = new TroublesomePair(list.get(i).first, secondSplit.get(j));
                    if (!(isThereSuchAPairs(pair1, pair2, myPairs)) && !(isThereThisMemberInTheList(list.get(i).first,secondSplit))) {
                        secondSplit.add(list.get(i).first);
                        break;
                    }else{
                        addedToSecondSplit=false;
                    }

                }

            }
        }

        if(!addedToFirstSplit && !existsInFirstSplit && !addedToSecondSplit){
           return  false;
        }

        //check for the second element
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < firstSplit.size(); j++) {
                pair1 = new TroublesomePair(firstSplit.get(j), list.get(i).second);
                pair2 = new TroublesomePair(list.get(i).second, firstSplit.get(j));
                if (!(isThereSuchAPairs(pair1, pair2, myPairs)) && !(isThereThisMemberInTheList(list.get(i).second,firstSplit))) {
                    firstSplit.add(list.get(i).second);
                    break;
                }
                else if(isThereThisMemberInTheList(list.get(i).second,firstSplit)){
                    existsInFirstSplit=true;
                }
                else{
                    addedToFirstSplit=false;
                }

            }

        }
        if(!addedToFirstSplit && !existsInFirstSplit ){
            for (int i = 1; i < list.size(); i++) {
                for (int j = 0; j < secondSplit.size(); j++) {
                    pair1 = new TroublesomePair(secondSplit.get(j), list.get(i).second);
                    pair2 = new TroublesomePair(list.get(i).second, secondSplit.get(j));
                    if (!(isThereSuchAPairs(pair1, pair2, myPairs)) && !(isThereThisMemberInTheList(list.get(i).second,secondSplit))) {
                        secondSplit.add(list.get(i).second);
                        break;
                    }else{
                        addedToSecondSplit=false;
                    }

                }

            }
        }

        if(!addedToFirstSplit && !existsInFirstSplit && !addedToSecondSplit){
            return  false;
        }
        printElementsINTheArrayList(firstSplit);
        printElementsINTheArrayList(secondSplit);

        return true;
    }
    public boolean isThereThisMemberInTheList(String str,ArrayList list){
        for(int i=0;i<list.size();i++){
            if(str.equals(list.get(i))){
                return true;
            }
        }
        return false;
    }

    public void printElementsINTheArrayList(ArrayList list) {
        System.out.println("elements in the split");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public boolean isThereSuchAPairs(TroublesomePair pair1, TroublesomePair pair2, ArrayList<TroublesomePair> myPairs) {
        for (int i = 0; i < myPairs.size(); i++) {
            if (pair1.first.equals(myPairs.get(i).first) && pair1.second.equals(myPairs.get(i).second)) {
                return true;
            }
            if (pair2.first.equals(myPairs.get(i).first) && pair2.second.equals(myPairs.get(i).second)) {
                return true;
            }

        }
        return false;

    }

    public ArrayList<TroublesomePair> takeInput() {
        Scanner input = new Scanner(System.in);
        //test cases
        int testCases = input.nextInt();
        // loop through each testcase
        for (int i = 0; i < testCases; i++) {
            int numberOfTroublesomePairs = input.nextInt();

            //ends conflicts in nextLine() below
            input.nextLine();
            for (int j = 0; j < numberOfTroublesomePairs; j++) {
                String names = input.nextLine();
                //trim() eliminates leading and trailing spaces split() splits string as per the parameters given
                String[] splitedString = names.trim().split(" ");
                myPairs.add(new TroublesomePair(splitedString[0], splitedString[1]));

            }
        }
        return myPairs;
    }

    public void printTroublesomePairs(ArrayList list) {
        System.out.println("\t ___Troublesome Pairs____");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\t\t" + list.get(i));
        }
    }
}
