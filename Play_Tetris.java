package Tetris;
import java.util.*;
public class Play_Tetris {
    public static void play(int d1[], int d2[], int d3[], int d4[], int d5[], String a[][], boolean loop[] , String shape){
        Scanner in = new Scanner(System.in);
        boolean play[] = new boolean[1];
        play[0] = true;
        while(play[0]){
            String button = in.next();
            switch (shape) {
                case "s":
                    switch (button) {
                        case "a":
                            if (S.check_left(d1, d2, d3, d4, a)) S.move_left(d1, d2, d3, d4, a);
                            break;
                        case "d":
                            if (S.check_right(d1, d2, d3, d4, a)) S.move_right(d1, d2, d3, d4, a);
                            break;
                        case "e":
                        case "q":
                            if (S.check_rotate(d1, d2, d3, d4, a)) S.rotate(d1, d2, d3, d4, a);
                            break;
                        case "s":
                            if (S.check_down(d1, d2, d3, d4, a, play)) S.move_down(d1, d2, d3, d4, a);
                            break;
                        case "x":
                            S.drop(d1, d2, d3, d4, a, play);
                            break;
                    }
                    break;
                case "z":
                    switch (button) {
                        case "a":
                            if (Z.check_left(d1, d2, d3, d4, a)) Z.move_left(d1, d2, d3, d4, a);
                            break;
                        case "d":
                            if (Z.check_right(d1, d2, d3, d4, a)) Z.move_right(d1, d2, d3, d4, a);
                            break;
                        case "e":
                        case "q":
                            if (Z.check_rotate(d1, d2, d3, d4, a)) Z.rotate(d1, d2, d3, d4, a);
                            break;
                        case "s":
                            if (Z.check_down(d1, d2, d3, d4, a, play)) Z.move_down(d1, d2, d3, d4, a);
                            break;
                        case "x":
                            Z.drop(d1, d2, d3, d4, a, play);
                            break;
                    }
                    break;
                case "l":
                    switch (button) {
                        case "a":
                            if (L.check_left(d1, d2, d3, d4, a)) L.move_left(d1, d2, d3, d4, a);
                            break;
                        case "d":
                            if (L.check_right(d1, d2, d3, d4, a)) L.move_right(d1, d2, d3, d4, a);
                            break;
                        case "q":
                            if (L.check_left_rotate(d1, d2, d3, d4, a)) L.left_rotate(d1, d2, d3, d4, a);
                            break;
                        case "e":
                            if (L.check_right_rotate(d1, d2, d3, d4, a)) L.right_rotate(d1, d2, d3, d4, a);
                            break;
                        case "s":
                            if (L.check_down(d1, d2, d3, d4, a, play)) L.move_down(d1, d2, d3, d4, a);
                            break;
                        case "x":
                            L.drop(d1, d2, d3, d4, a, play);
                            break;
                    }
                    break;
                case "ml":
                    switch (button) {
                        case "a":
                            if (ML.check_left(d1, d2, d3, d4, a)) ML.move_left(d1, d2, d3, d4, a);
                            break;
                        case "d":
                            if (ML.check_right(d1, d2, d3, d4, a)) ML.move_right(d1, d2, d3, d4, a);
                            break;
                        case "q":
                            if (ML.check_left_rotate(d1, d2, d3, d4, a)) ML.left_rotate(d1, d2, d3, d4, a);
                            break;
                        case "e":
                            if (ML.check_right_rotate(d1, d2, d3, d4, a)) ML.right_rotate(d1, d2, d3, d4, a);
                            break;
                        case "s":
                            if (ML.check_down(d1, d2, d3, d4, a, play)) ML.move_down(d1, d2, d3, d4, a);
                            break;
                        case "x":
                            ML.drop(d1, d2, d3, d4, a, play);
                            break;
                    }
                    break;
                case "t":
                    switch (button) {
                        case "a":
                            if (T.check_left(d1, d2, d3, d4, d5, a)) T.move_left(d1, d2, d3, d4, d5, a);
                            break;
                        case "d":
                            if (T.check_right(d1, d2, d3, d4, d5, a)) T.move_right(d1, d2, d3, d4, d5, a);
                            break;
                        case "q":
                            if (T.check_left_rotate(d1, d2, d3, d4, d5, a)) T.left_rotate(d1, d2, d3, d4, d5, a);
                            break;
                        case "e":
                            if (T.check_right_rotate(d1, d2, d3, d4, d5, a)) T.right_rotate(d1, d2, d3, d4, d5, a);
                            break;
                        case "s":
                            if (T.check_down(d1, d2, d3, d4, d5, a, play)) T.move_down(d1, d2, d3, d4, d5, a);
                            break;
                        case "x":
                            T.drop(d1, d2, d3, d4, d5, a, play);
                            break;
                    }
                    break;
                case "i":
                    switch (button) {
                        case "a":
                            if (I.check_left(d1, d2, d3, a)) I.move_left(d1, d2, d3, a);
                            break;
                        case "d":
                            if (I.check_right(d1, d2, d3, a)) I.move_right(d1, d2, d3, a);
                            break;
                        case "q":
                        case "e":
                            if (I.check_rotate(d1, d2, d3, a)) I.rotate(d1, d2, d3, a);
                            break;
                        case "s":
                            if (I.check_down(d1, d2, d3, a, play)) I.move_down(d1, d2, d3, a);
                            break;
                        case "x":
                            I.drop(d1, d2, d3, a, play);
                            break;
                    }
                    break;
                case "sq":
                    switch (button) {
                        case "a":
                            if (SQ.check_left(d1, d2, d3, d4, a)) SQ.move_left(d1, d2, d3, d4, a);
                            break;
                        case "d":
                            if (SQ.check_right(d1, d2, d3, d4, a)) SQ.move_right(d1, d2, d3, d4, a);
                            break;
                        case "e":
                        case "q":
                            if (SQ.check_rotate(d1, d2, d3, d4, a)) SQ.rotate(d1, d2, d3, d4, a);
                            break;
                        case "s":
                            if (SQ.check_down(d1, d2, d3, d4, a, play)) SQ.move_down(d1, d2, d3, d4, a);
                            break;
                        case "x":
                            SQ.drop(d1, d2, d3, d4, a, play);
                            break;
                    }
                    break;
            }
        }
    }

}
