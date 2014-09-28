/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmartirx;

/**
 *
 * @author Administrator
 */
public class Matrix {

    // field
    public int[][] add;
    public int[][] sub;
    public int[][] mul;

    // constructor
    public Matrix(int row, int column) {
        this.add = new int[row][column];
        this.sub = new int[row][column];
        this.mul = new int[row][column];
    }

    // method
    public void add(int set, int row, int column, int n[][][]) {
        for (int i = 0; i < set; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {
                    add[j][k] += n[i][j][k];
                }
            }
        }
    }

    public void subtact(int set, int row, int column, int n[][][]) {
        for (int i = 0; i < set; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {
                    if (i == 0) {
                        sub[j][k] = n[i][j][k];
                    } else {
                        sub[j][k] -= n[i][j][k];
                    }
                }
            }
        }

    }

    public void multipal(int set, int row, int column, int n[][][]) {

        if (row == column) {
            int a = 0;
            int size = row;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    for (int k = 0; k < size; k++) {
                        mul[i][j] += n[a][i][k] * n[a + 1][k][j];
                    }
                }
            }
        } else {
            System.out.print("Can't do Matrix multiplication");
        }
    }

    public void transpore(int mul[][],int row, int column) {
        System.out.println("Transpore");
        for(int i = 0;i<column;i++){
            for(int j = 0;j<row;j++){
                System.out.print(mul[j][i]);
                if (j < column - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void printadd(int column, int row) {
        System.out.println("Add Matrix");
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < column; k++) {
                System.out.print(add[j][k]);
                if (k < column - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void printsub(int column, int row) {
        System.out.println("Subtact Matrix");
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < column; k++) {
                System.out.print(sub[j][k]);
                if (k < column - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void printmul(int column, int row) {
        System.out.println("Multiplication Matrix");
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < column; k++) {
                System.out.print(mul[j][k]);
                if (k < column - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
