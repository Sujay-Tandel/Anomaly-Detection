// =========================================================
// 
// Assignment P1 Anomoly Detection
// ---------------------------------------------------------
// Author:      Sujay Tandel
// Date:        6/20/2019
// =========================================================

public class P1 { 
    public static void main(String[] args) {
        Readfile read = new Readfile();
        double[][] data = read.readData();
        ComputePoints calculate = new ComputePoints();
        calculate.generate(data, read.getNumber(), read.getDimension(), data.length);
    }
}