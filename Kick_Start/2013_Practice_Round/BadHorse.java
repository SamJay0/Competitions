import java.util.Scanner;
class BadHorse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //testcases
        int testCases = input.nextInt();
        for(int i =0; i<testCases;i++){
            //number of troublesome pairs
            System.out.print("enter number of troublesome pairs: ");
            int numberOfTroublesomePairs=input.nextInt();
            for(int j=0; j<numberOfTroublesomePairs;j++){
                System.out.println("enter names of the troublesome pair");
                String first =input.nextLine();
                String second = input.nextLine();
            }
            input.nextLine();
        }
        

    }
}