package doit.chap02;

public class Int2Darray {
    public static void main(String[] args){
        int[][] x = new int[2][4];

        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                x[i][j] = i+1*j;
            }
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                System.out.println("x[" + i +"][" + j + "] = " + x[i][j]);
            }
        }

    }
}
