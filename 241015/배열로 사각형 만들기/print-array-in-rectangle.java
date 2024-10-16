public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr2d = new int[5][5];

        for (int i = 0; i < n; i++) {
            arr2d[0][i] = 1;
            arr2d[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                arr2d[i][j] = arr2d[i - 1][j] + arr2d[i][j - 1];
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}