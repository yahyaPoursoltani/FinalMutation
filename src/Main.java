
public class Main {
    public static void main(String[] args) {
        for (int x: MutationQuizUtils.deleteAllVal(new int[]{1,2,3,2},2)) {
            System.out.println(x);
        }
    }
}