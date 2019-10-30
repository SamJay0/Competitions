public class TroublesomePair {
    String first;
    String second;
    public TroublesomePair(String first,String second){
        this.first=first;
        this.second=second;
    }

    @Override
    public String toString() {
        return ""+first+" and "+second;
    }
}
