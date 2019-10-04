package unionfind;

//UnionFind or Dynamic Connectivity
public interface UnionFindI {
    public boolean connected(int p, int q);

    public void union(int p, int q);
}
