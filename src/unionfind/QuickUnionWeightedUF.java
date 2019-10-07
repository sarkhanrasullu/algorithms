package unionfind;

public class QuickUnionWeightedUF implements UnionFindI {

    private int[] id;
    private int[] sz;

    public QuickUnionWeightedUF(int n){
        this.id = new int[n];
        this.sz = new int[n];
        for(int i=0;i<n;i++){
            this.id[i] = i;
            this.sz[i] = 1;
        }
    }

    private int root(int i ){
        int[] id_ = this.id;
        while(i != id_[i]) i = id_[i];
        return i;
    }
    public int[] getArr(){
        return id;
    }
    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if( i == j ) return;
        if( sz[i]<sz[j] ) {
            id[i] = j; sz[j] += sz[i];
        } else {
            id[j] = i; sz[i] += sz[j];
        }
    }
}
