package percolation;

public class UnionedObjects
{
    int [] Parent;
    int [] size;
    int count;

    public UnionedObjects(int N) {
        Parent = new int[N];
        size = new int[N];
        count = N;
        for (int i = 0; i < N; i++) {
            size[i] = 1;
            Parent[i] = i;
        }

    }

    /**
     * Finds the Parent of the location you're looking for.
     * @return
     */
    public int find(int N) {
        validate(N);
        while (Parent[N] != N) {
            N = Parent[N];
        }
        return N;
    }

    /**
     * Verifies whether or not 2 locations are connected and in the same subset.
     * @return
     */
    public boolean connected(int q, int p){
        return find(p) == find(q);
    }

    /**
     * Validates whether or not the location you're attempting to use within the allotted range.
     * @return
     */
    public boolean validate(int n) {
        return (n <= Parent.length && n >= 0);
    }

    public int count() {
        return count;
    }

    public void union(int q, int p) {
        int rootQ = find(q);
        int rootP = find(p);

        if (size[rootQ] <= size[rootP])
        {
           Parent[rootQ] = rootP;
           size[rootP] += size[rootQ];
        } else {
            Parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        count--;
    }
}
