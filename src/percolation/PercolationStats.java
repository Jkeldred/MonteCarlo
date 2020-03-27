package percolation;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class PercolationStats
{


    public PercolationStats(int N, int T) {
        if (N <= 0 || T <= 0)
            throw new IllegalArgumentException("T or N value cannot be less than or equal to 0.");

    }

    //sample mean of percolation threshold
    public double mean() {
        return 0;
    }

    //sample standard deviation
    public double stddev() {
        return 0;
    }

    //low endpoint of 95% confidence interval
    public double confidenceLow() {
        return 0;
    }

    //high endpoint of 95% confidence interval
    public double confidenceHigh() {
        return 0;
    }
}

