package percolation;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

/**
 * Used to model a percolation system by creating a 2D structure and verifying the statistical amount of sites needed
 * for percolation to take place.
 */
public class Percolation
{
    private boolean[][] grid;
    private WeightedQuickUnionUF UF;
    private int N;

    //create an N by N grid with all sites blocked
    public Percolation(int N) {
        if (N <= 0)
            throw new IllegalArgumentException("N value cannot be smaller than or equal to 0");
        
    this.N = N;
    this.grid = new boolean[N][N];
    this.UF = new WeightedQuickUnionUF(N);

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            grid[i][j] = false;
        }

    }

    }
    // open site (row i, column j) if it is not already open
    public void open(int i, int j){
        if (grid[i][j] == true) {
            return;
        } else
            grid[i][j] = true;

    }

    //is site (row i, column j) open?
    public boolean isOpen(int i, int j) {


        return false;
    }

    //is site (row i, column j) full?
    public boolean isFull(int i, int j) {
        return false;
    }

    //Does the system percolate?
    public boolean percolates() {
        return false;
    }

    private int xyto1D(int row, int column) {
       return (row * N) + column;
    }

    public static void main(String[] args) {

    }
}
