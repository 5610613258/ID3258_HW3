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
public class ComplexMatrix extends Matrix {

    public ComplexMatrix(int row, int column) {
        super(row, column);
    }

    @Override
    public void transpore(int mul[][], int row, int column) {
        System.out.println("Transpore(Complex)");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(mul[j][i] + "+0i");
                if (j < column - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void printadd(int add[][], int column, int row) {
        System.out.println("Add Complex Matrix");
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < column; k++) {
                System.out.print(add[j][k] + "+0i");
                if (k < column - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void printsub(int sub[][], int column, int row) {
        System.out.println("Subtact Complex Matrix");
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < column; k++) {
                System.out.print(sub[j][k] + "+0i");
                if (k < column - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

        public void printmul(int mul[][],int column, int row) {
        System.out.println("Multiplication Complex Matrix");
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < column; k++) {
                System.out.print(mul[j][k] + "+0i");
                if (k < column - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
