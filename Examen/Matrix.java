package com.example.exampalc;
// УКАЖИ СВОЙ ПЭКЕДЖ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// УКАЖИ СВОЙ ПЭКЕДЖ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// УКАЖИ СВОЙ ПЭКЕДЖ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


public class Matrix {
    private final int[][] data;
    private final int rows;
    private final int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    public void setElement(int row, int column, int value) {
        data[row][column] = value;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);

        matrix.setElement(0, 0, 1);
        matrix.setElement(0, 1, 2);
        matrix.setElement(0, 2, 3);

        matrix.setElement(1, 0, 4);
        matrix.setElement(1, 1, 5);
        matrix.setElement(1, 2, 6);

        matrix.setElement(2, 0, 7);
        matrix.setElement(2, 1, 8);
        matrix.setElement(2, 2, 9);

        matrix.print();
    }
}

