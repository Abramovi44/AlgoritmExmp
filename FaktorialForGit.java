package GitExmp;

public class FaktorialForGit {
    public int num;

    public FaktorialForGit(int num) {
        this.num = num;
    }
    private static int fact(int num){
        int naturalFirst = 1;
        int naturalEnd = naturalFirst;
        for (int i = 1; i < num; i++) {
            naturalEnd = naturalEnd * (naturalFirst + i);

        }
        return naturalEnd;
    }
    public int getFact(){
        return fact(this.num);
    }
}
