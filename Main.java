import java.util.Scanner;

public class Main {
    static int tritiling(int n){
        int[][] db = new int[n+1][8];
        db[0][7] = 1;

        for (int i = 1; i < n+1; i++){
            db[i][0] += db[i-1][7];
            db[i][1] += db[i-1][6];
            db[i][3] += db[i-1][7];
            db[i][3] += db[i-1][4];
            db[i][4] += db[i-1][3];
            db[i][6] += db[i-1][7];
            db[i][6] += db[i-1][1];
            db[i][7] += db[i-1][3];
            db[i][7] += db[i-1][6];
            db[i][7] += db[i-1][0];
        }
        return db[n][7];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());

        while (input != -1){
            int result = tritiling(input);
            System.out.println(result);
            input = Integer.parseInt(sc.nextLine());
        }
    }
}
