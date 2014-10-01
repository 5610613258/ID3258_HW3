/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmartirx;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TestMartirx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int set;
        int row;
        int column;

        // Input set, column, row
        System.out.print("Enter Matrix set(s) : ");
        set = sc.nextInt();
        System.out.print("Enter Column(s) size : ");
        column = sc.nextInt();
        System.out.print("Enter Row(s) size : ");
        row = sc.nextInt();
        // Input Number in Matrix
        int[][][] n = new int[set][row][column];
        for (int i = 0; i < set; i++) {
            System.out.print("Enter " + "No." + (i + 1) + " Number : ");
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {
                    n[i][j][k] = sc.nextInt();
                }
            }
        }

        Matrix m = new Matrix(row, column);
        ComplexMatrix cm = new ComplexMatrix(row, column);
        System.out.println("Normal Matrix");
        m.add(set, row, column, n);
        m.subtact(set, row, column, n);
        m.multipal(set, row, column, n);
        m.printadd(column, row);
        m.printsub(column, row);
        m.printmul(column, row);
        m.transpore(m.add, row, column);
        m.transpore(m.sub, row, column);
        m.transpore(m.mul, row, column);
        System.out.println("Complex Matrix");
        cm.printadd(m.add, column, row);
        cm.printsub(m.sub, column, row);
        cm.printmul(m.mul, column, row);
        cm.transpore(m.add, row, column);
        cm.transpore(m.sub, row, column);
        cm.transpore(m.mul, row, column);

        // Input Number in Matrix
        int[][][] N = new int[set][row][column];
        for (int i = 0; i < set; i++) {
            System.out.print("Enter " + "No." + (i + 1) + " Number (0 or 1): ");
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {
                    N[i][j][k] = sc.nextInt();
                }
            }
        }
        BinaryMatrix bm = new BinaryMatrix(row, column);
        System.out.println("Binary Matrix");
        bm.add(set, row, column, N);
        bm.printadd(column, row);
        bm.transpore(bm.add, row, column);
        
        BinaryComplexMatrix bcm = new BinaryComplexMatrix(row, column);
        bcm.transpore(bm.add, row, column);
        bcm.printadd(column, row);
    }

}
