/*There is a snake in an n x n matrix grid and can move in four possible directions. 
Each cell in the grid is identified by the position: grid[i][j] = (i * n) + j.

The snake starts at cell 0 and follows a sequence of commands.

You are given an integer n representing the size of the grid and an array of strings commands 
where each command[i] is either "UP", "RIGHT", "DOWN", and "LEFT". It's guaranteed that the snake will
remain within the grid boundaries throughout its movement.

Return the position of the final cell where the snake ends up after executing commands.

 

Example 1:

Input: n = 2, commands = ["RIGHT","DOWN"]

Output: 3

Explanation:

0	1
2	3
0	1
2	3
0	1
2	3
Input: n = 3, commands = ["DOWN","RIGHT","UP"]

Output: 1

Explanation:

0	1	2
3	4	5
6	7	8
0	1	2
3	4	5
6	7	8
0	1	2
3	4	5
6	7	8
0	1	2
3	4	5
6	7	8 */

import java.util.List;

public class javaSnakeInMatrix {
    public int finalPositionOfSnake(int n, List<String> command){
        int position = 0;
        for(String command1 : command){
            if(command1.equals("UP")){
                position = position - n;
                }
                else if(command1.equals("RIGHT")){
                    position = position + 1;
                    }
                    else if(command1.equals("DOWN")){
                        position = position + n;
                        }
                        else if(command1.equals("LEFT")){
                            position = position - 1;
                            }
                       }
                         return position;
    }

    }
