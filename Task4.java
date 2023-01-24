package Project11;

public class Task4 {
    public static void main(String[] args) {
        int[][] numbers = { {1, 8, 3},{11, 5, 6}, {7, 12, 9}
        };
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j <numbers.length ; j++)
                if(numbers[i][j]%2==0){
                    System.out.println(numbers[i][j]);
                }
        }
    }
}


