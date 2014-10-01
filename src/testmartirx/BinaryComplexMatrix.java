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
public class BinaryComplexMatrix extends BinaryMatrix{

    public BinaryComplexMatrix(int row, int column) {
        super(row, column);
    }
    @Override
    public void transpore(int add[][],int row, int column) {
        System.out.println("Transpore(Binary)");
        for(int i = 0;i<column;i++){
            for(int j = 0;j<row;j++){
                System.out.print(add[j][i] + "+0i");
                if (j < column - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    @Override
    public void printadd(int column, int row) {
        System.out.println("Add Binary Matrix");
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
}
