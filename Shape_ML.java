package Tetris;

public class ML {
  
        public static void set(int d1[], int d2[], int d3[], int d4[], String a[][]) {
            d1[0] = 2;d1[1] = 4;
            d2[0] = 3;d2[1] = 4;
            d3[0] = 4;d3[1] = 4;
            d4[0] = 4;d4[1] = 3;
        }
        public static boolean check(int d1[], int d2[], int d3[], int d4[], String a[][],boolean loop[]){
            if (a[d1[0]][d1[1]].equals("  ") && a[d2[0]][d2[1]].equals("  ") &&
                    a[d3[0]][d3[1]].equals("  ") && a[d4[0]][d4[1]].equals("  ")) {
                a[d1[0]][d1[1]] = "* ";
                a[d2[0]][d2[1]] = "* ";
                a[d3[0]][d3[1]] = "* ";
                a[d4[0]][d4[1]] = "* ";
                return true;
            }
            return loop[0] = false;
        }
        public static boolean check_left(int d1[], int d2[], int d3[], int d4[], String a[][]){
            if(d1[1] == d3[1]){
                return (a[d1[0]][d1[1] - 1].equals("  ") && a[d2[0]][d2[1] - 1].equals("  ")) && (
                        a[d3[0]][d3[1] - 1].equals("  ") || a[d4[0]][d4[1] - 1].equals("  "));
            }else return (a[d3[0]][d3[1] - 1].equals("  ") && a[d4[0]][d4[1] - 1].equals("  ")) ||
                        (a[d1[0]][d1[1] - 1].equals("  ") && a[d4[0]][d4[1] - 1].equals("  "));
        }
        public static void move_left(int d1[], int d2[], int d3[], int d4[], String a[][]){
            a[d1[0]][d1[1]--] = "  ";
            a[d2[0]][d2[1]--] = "  ";
            a[d3[0]][d3[1]--] = "  ";
            a[d4[0]][d4[1]--] = "  ";

            a[d1[0]][d1[1]] = "* ";
            a[d2[0]][d2[1]] = "* ";
            a[d3[0]][d3[1]] = "* ";
            a[d4[0]][d4[1]] = "* ";
            main.print(a);
        }
        public static boolean check_right(int d1[], int d2[], int d3[], int d4[], String a[][]){
            if(d1[1] == d3[1]){
                return (a[d1[0]][d1[1] + 1].equals("  ") && a[d2[0]][d2[1] + 1].equals("  ")) &&
                        (a[d3[0]][d3[1] + 1].equals("  ") || a[d4[0]][d4[1] + 1].equals("  "));
            }else return (a[d1[0]][d1[1] + 1].equals("  ") && a[d4[0]][d4[1] + 1].equals("  ")) ||
                        (a[d3[0]][d3[1] + 1].equals("  ") && a[d4[0]][d4[1] + 1].equals("  "));
        }
        public static void move_right(int d1[], int d2[], int d3[], int d4[], String a[][]){
            a[d1[0]][d1[1]++] = "  ";
            a[d2[0]][d2[1]++] = "  ";
            a[d3[0]][d3[1]++] = "  ";
            a[d4[0]][d4[1]++] = "  ";

            a[d1[0]][d1[1]] = "* ";
            a[d2[0]][d2[1]] = "* ";
            a[d3[0]][d3[1]] = "* ";
            a[d4[0]][d4[1]] = "* ";
            main.print(a);
        }
        public static boolean check_left_rotate(int d1[], int d2[], int d3[], int d4[], String a[][]) { // for E
            if(d1[1] == d2[1] && d1[0] < d2[0]){
                if(a[d1[0]+1][d1[1]-1].equals("  ") && a[d3[0]-1][d3[1]+1].equals("  ")
                        && a[d4[0]][d4[1]+2].equals("  ")){
                    a[d1[0]][d1[1]] = "  ";
                    a[d3[0]][d3[1]] = "  ";
                    a[d4[0]][d4[1]] = "  ";
                    d1[0]++;d1[1]--;
                    d3[0]--;d3[1]++;
                    d4[1]+=2;
                    return true;
                }
            } else if(d1[0] == d2[0] && d2[1] < d1[1]){
                if(a[d1[0]-1][d1[1]-1].equals("  ") && a[d3[0]+1][d3[1]+1].equals("  ")
                        && a[d4[0]+2][d4[1]].equals("  ")){
                    a[d1[0]][d1[1]] = "  ";
                    a[d3[0]][d3[1]] = "  ";
                    a[d4[0]][d4[1]] = "  ";
                    d1[0]--;d1[1]--;
                    d3[0]++;d3[1]++;
                    d4[0]+=2;
                    return true;
                }
            } else if(d1[1]==d2[1] && d2[0]<d1[0]){
                if  (a[d1[0]-1][d1[1]+1].equals("  ") && a[d3[0]+1][d3[1]-1].equals("  ")
                        && a[d4[0]][d4[1]-2].equals("  ")){
                    a[d1[0]][d1[1]] = "  ";
                    a[d3[0]][d3[1]] = "  ";
                    a[d4[0]][d4[1]] = "  ";
                    d1[0]--;d1[1]++;
                    d3[0]++;d3[1]--;
                    d4[1]-=2;
                    return true;
                }
            } else if(a[d1[0]+1][d1[1]+1].equals("  ") && a[d3[0]-1][d3[1]-1].equals("  ")
                    && a[d4[0]-2][d4[1]].equals("  ")){
                    a[d1[0]][d1[1]] = "  ";
                    a[d3[0]][d3[1]] = "  ";
                    a[d4[0]][d4[1]] = "  ";
                    d1[0]++;d1[1]++;
                    d3[0]--;d3[1]--;
                    d4[0]-=2;
                    return true;
            }return false;
        }
        public static void left_rotate(int d1[], int d2[], int d3[], int d4[], String a[][]) { // for E
            a[d1[0]][d1[1]] = "* ";
            a[d2[0]][d2[1]] = "* ";
            a[d3[0]][d3[1]] = "* ";
            a[d4[0]][d4[1]] = "* ";
            main.print(a);
        }
        public static boolean check_right_rotate(int d1[], int d2[], int d3[], int d4[], String a[][]) { // for E
            if(d1[1] == d2[1] && d1[0] < d2[0]){
                if(a[d1[0]+1][d1[1]+1].equals("  ") &&
                        a[d3[0]-1][d3[1]-1].equals("  ") && a[d4[0]-2][d4[1]].equals("  ")){
                    a[d1[0]][d1[1]] = "  ";
                    a[d3[0]][d3[1]] = "  ";
                    a[d4[0]][d4[1]] = "  ";
                    d1[0]++;d1[1]++;
                    d3[0]--;d3[1]--;
                    d4[0]-=2;
                    return true;
                }
            } else if(d1[0] == d2[0] && d2[1] < d1[1]){
                if(a[d1[0]+1][d1[1]-1].equals("  ") && a[d3[0]-1][d3[1]+1].equals("  ")
                        && a[d4[0]][d4[1]+2].equals("  ")){
                    a[d1[0]][d1[1]] = "  ";
                    a[d3[0]][d3[1]] = "  ";
                    a[d4[0]][d4[1]] = "  ";
                    d1[0]++;d1[1]--;
                    d3[0]--;d3[1]++;
                    d4[1]+=2;
                    return true;
                }
            } else if(d1[1]==d2[1] && d2[0]<d1[0]){
                if(a[d1[0]-1][d1[1]-1].equals("  ") &&
                        a[d3[0]+1][d3[1]+1].equals("  ") && a[d4[0]+2][d4[1]].equals("  ")){
                    a[d1[0]][d1[1]] = "  ";
                    a[d3[0]][d3[1]] = "  ";
                    a[d4[0]][d4[1]] = "  ";
                    d1[0]--;d1[1]--;
                    d3[0]++;d3[1]++;
                    d4[0]+=2;
                    return true;
                }
            } else if(a[d1[0]-1][d1[1]+1].equals("  ") &&
                        a[d3[0]+1][d3[1]-1].equals("  ") && a[d4[0]][d4[1]-2].equals("  ")){
                    a[d1[0]][d1[1]] = "  ";
                    a[d3[0]][d3[1]] = "  ";
                    a[d4[0]][d4[1]] = "  ";
                    d1[0]--;d1[1]++;
                    d3[0]++;d3[1]--;
                    d4[1]-=2;
                    return true;
            }return false;
        }
        public static void right_rotate(int d1[], int d2[], int d3[], int d4[], String a[][]) { // for E
            a[d1[0]][d1[1]] = "* ";
            a[d2[0]][d2[1]] = "* ";
            a[d3[0]][d3[1]] = "* ";
            a[d4[0]][d4[1]] = "* ";
            main.print(a);
        }
        public static boolean check_down(int d1[], int d2[], int d3[], int d4[], String a[][],boolean play[]) {
            if(d1[1] == d2[1]){
                if((a[d4[0]+1][d4[1]].equals("  ")) &&
                        (a[d3[0]+1][d3[1]].equals("  ") || a[d1[0]+1][d1[1]].equals("  "))){
                    a[d1[0]++][d1[1]] = "  ";
                    a[d2[0]++][d2[1]] = "  ";
                    a[d3[0]++][d3[1]] = "  ";
                    a[d4[0]++][d4[1]] = "  ";
                    return true;
                }
            }else if((a[d1[0]+1][d1[1]].equals("  ") && a[d2[0]+1][d2[1]].equals("  "))
                    && a[d3[0]+1][d3[1]].equals("  ") || a[d4[0]+1][d4[1]].equals("  ")){
                a[d1[0]++][d1[1]] = "  ";
                a[d2[0]++][d2[1]] = "  ";
                a[d3[0]++][d3[1]] = "  ";
                a[d4[0]++][d4[1]] = "  ";
                return true;
            }
            main.check_is_row_full(a, a.length , a[0].length);
            return play[0] = false;
        }
        public static void move_down(int d1[], int d2[], int d3[], int d4[], String a[][]) {
            a[d1[0]][d1[1]] = "* ";
            a[d2[0]][d2[1]] = "* ";
            a[d3[0]][d3[1]] = "* ";
            a[d4[0]][d4[1]] = "* ";
            main.print(a);
        }
        public static void drop(int d1[], int d2[], int d3[], int d4[], String a[][] , boolean play[]) {
            while(play[0]){
                if(ML.check_down(d1, d2, d3, d4, a, play)) ML.move_down(d1, d2, d3, d4, a);
            }
        }
}

