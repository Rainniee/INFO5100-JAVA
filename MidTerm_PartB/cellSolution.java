/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermpartb;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
class Cell{
    int x,y;
    Cell(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "["+this.x +", "+this.y+ "]";
    }
}

public class cellSolution {
   
    private boolean isInMaze(int[][] maze, int x, int y){ //keep (x,y) in the maze when moving downward or right
        return x >= 0 && y >= 0 && x < maze.length && y < maze[0].length;
    }
    
    public boolean findUniquePath(int[][]maze,ArrayList<Cell> findPath){
        int col = maze[0].length; //get the collum length of maze
        int row = maze.length; //get the row length of maze
        
        if((col == 0)||(row == 0)||(maze == null)) //maze cannot be null
            return false;      
        if((maze[0][0] == 0)||(maze[row - 1][col - 1] == 0)) //the first point(0,0) and the last point(3,3) cannot be 0
            return false;
        
        return findPathStepByStep(maze, findPath, 0, 0); //the start point is (0,0)
    }
    
    private boolean findPathStepByStep(int[][] maze, ArrayList<Cell> findPath, int x, int y){
        if(!isInMaze(maze, x, y))
            return false;
        if(maze[x][y] == 0) //When get 0, then cannot move
            return false;
        
        findPath.add(new Cell(x,y));
        
        if(x == maze.length -1 && y == maze[0].length -1)
            return true;
        
        // Assume the start point is (x, y), then find the number of all unique paths from (x + 1, y) to destination
        if(findPathStepByStep(maze, findPath, x+1, y)){
            return true;
        }
        // Assume the start point is (x, y), then find the number of all unique paths from (x, y + 1) to destination
        if(findPathStepByStep(maze, findPath, x, y+1)){
            return true;
        }
        
        findPath.remove(findPath.size() - 1);
        return false;
    }
    
    public static void main(String[] args){
        int[][] mazeTest = {{1,0,0,0}, {1,1,0,0}, {0,1,0,0}, {0,1,1,1}};
        cellSolution Q5solution = new cellSolution();
        ArrayList<Cell> findPath = new ArrayList<Cell>();
        Q5solution.findUniquePath(mazeTest, findPath);
        for(Cell c: findPath)
            c.toString();
    }
}
