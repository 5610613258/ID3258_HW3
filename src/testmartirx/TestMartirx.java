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
        for(int i = 0;i < set;i++){
            System.out.print("Enter " + "No." + (i+1) + " Number : ");
            for(int j = 0;j < row;j++){
                for(int k = 0;k < column;k++){
                    n[i][j][k] = sc.nextInt();
                }
            }
        }
       
        Matrix cm = new Matrix(row, column);
        cm.add(set, row, column, n);
        cm.subtact(set, row, column, n);
        cm.multipal(set, row, column, n);
        cm.printadd(column, row);
        cm.printsub(column, row);
        cm.printmul(column, row);
        cm.transpore(cm.add,row,column);
        cm.transpore(cm.sub,row,column);
        cm.transpore(cm.mul,row,column);
    }

}
