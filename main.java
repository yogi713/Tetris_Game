package Tetris;
import java.util.*;
public class main {
    static int score = 0;

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>(Arrays.asList("s","z","l","ml","t","i","sq"));
        int n = 18;
        int m = 10;
        String a[][] = new String[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i == 0||j == 0||i == n-1||j == m-1) a[i][j] = "* ";
                else a[i][j] = "  ";
            }
        }
        System.out.println(" q-rotate Left\n a-left\n s-down\n d-right\n e-rotate right\n x-drop to bottom");
        boolean loop[] = new boolean[1];
        loop[0] = true;
        String shape;
        int index= 0;
        // Take Shape "SQ" as example : d1-> * * <-d2
        //                              d3-> * * <-d4
        // At max , there are 5 stars(*) (See Shape "T")

        int d1[] = new int [2]; // d1[0] as row , d1[1] as col
        int d2[] = new int [2]; // d2[0] as row , d2[1] as col
        int d3[] = new int [2]; // d3[0] as row , d3[1] as col
        int d4[] = new int [2]; // d4[0] as row , d4[1] as col
        int d5[] = new int [2]; // d5[0] as row , d5[1] as col
        while(loop[0]){
            shape = list.get(index++);
            if(index == 7) index = 0;
            switch (shape) {
                case "s" : {
                    S.set(d1, d2, d3, d4, a);
                    if (S.check(d1, d2, d3, d4, a, loop)) {
                        print(a);
                        Play_Tetris.play(d1, d2, d3, d4, d5, a, loop, shape);
                    }
                    break;
                }
                case "z" : {
                    Z.set(d1, d2, d3, d4, a);
                    if (Z.check(d1, d2, d3, d4, a, loop)) {
                        print(a);
                        Play_Tetris.play(d1, d2, d3, d4, d5, a, loop, shape);
                    }
                    break;
                }
                case "l" : {
                    L.set(d1, d2, d3, d4, a);
                    if (L.check(d1, d2, d3, d4, a, loop)) {
                        print(a);
                        Play_Tetris.play(d1, d2, d3, d4, d5, a, loop, shape);
                    }
                    break;
                }
                case "ml" : {
                    ML.set(d1, d2, d3, d4, a);
                    if (ML.check(d1, d2, d3, d4, a, loop)) {
                        print(a);
                        Play_Tetris.play(d1, d2, d3, d4, d5, a, loop, shape);
                    }
                    break;
                }
                case "t" : {
                    T.set(d1, d2, d3, d4, d5, a);
                    if (T.check(d1, d2, d3, d4, d5, a, loop)) {
                        print(a);
                        Play_Tetris.play(d1, d2, d3, d4, d5, a, loop, shape);
                    }
                    break;
                }
                case "i" : {
                    I.set(d1, d2, d3, a);
                    if (I.check(d1, d2, d3, a, loop)) {
                        print(a);
                        Play_Tetris.play(d1, d2, d3, d4, d5, a, loop, shape);
                    }
                    break;
                }
                case "sq" : {
                    SQ.set(d1, d2, d3, d4, a);
                    if (SQ.check(d1, d2, d3, d4, a, loop)) {
                        print(a);
                        Play_Tetris.play(d1, d2, d3, d4, d5, a, loop, shape);
                    }
                    break;
                }
            }
            if(!loop[0]){ // if loop is false display score
                System.out.println("***********!..Game Over..!************");
                System.out.println("********* YOUR SCORE IS :"+ score+" ***********");
            }
        }
    }
    public static void print(String a[][]){ // printing the matrix
        for(String row[] : a){
            for(String star : row) System.out.print(star+" ");
            System.out.println();
        }
    }
    public static void check_is_row_full(String a[][] , int n , int m){
        int max_star_in_a_row = 8; // in 0-indexed array , at max 8 star can be found if a row is filled with "*"
        int count ;
        boolean  loop = true;
        while(loop){
            loop = false; // next iteration while loop breaks
            // Finding whether a row is filled with "*" or not
            for(int i = 1;i<n-1;i++){
                count = 0;
                for(int j=1;j<m-1;j++){
                    if(a[i][j].equals("  ")) break;
                    else count++; // incrementing by one if a "*" found
                }
                if(count == max_star_in_a_row){ // A row found with full of "*"
                    loop = true; // next time while loop checks if a row  is full of "*" or not
                    for(int k = 1;k<m-1;k++) a[i][k] = "  ";
                    score+=100;
                    for(int j = i-1;j>=1;j--){
                        for(int k=m-2;k>=1;k--){
                            if(a[j][k].equals("* ")){
                                a[j+1][k] =a[j][k];
                                a[j][k] = "  ";
                            }
                        }
                    }
                }
            }
            if(!loop) break;
        }
    }
}















