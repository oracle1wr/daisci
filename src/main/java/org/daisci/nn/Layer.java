package org.daisci.nn;

/**
 * Created by dkudryavtsev on 4/28/15.
 */
public class Layer {
    private int cols;
    private int rows;
    private double[][] weight;
    private double[][] activity;

    public Layer(int rows, int cols) {
        this.cols = cols;
        this.rows = rows;

        weight = new double[rows][cols];
        activity = new double[rows][cols];
    }

    public double[][] getActivity(){
        return activity;
    }

    public double getActivity(int row, int col){
        return activity[row][col];
    }

    public double[][] getWeight(){
        return weight;
    }

    public double getWeight(int row, int col){
        return weight[row][col];
    }

}
