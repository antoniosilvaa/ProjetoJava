package ProjetoJava;

public class arraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;

        dias[1][0] = 27;
        dias[1][1] = 24;
        dias[1][2] = 25;

        dias[2][0] = 21;
        dias[2][1] = 18;
        dias[2][2] = 20;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <dias[0].length ; j++) {
                System.out.println(dias[i][j]);

            }

        }
        System.out.println("------------------------------");
        for (int[] arrBase : dias){
            for (int num : arrBase){
                System.out.println(num);
            }
        }
        }
    }

