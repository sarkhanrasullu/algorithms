package unionfind;

public class QuickUnionWithPathCompressionUF implements UnionFindI {

    private int[] id;

    public QuickUnionWithPathCompressionUF(int n){
        this.id = new int[n];
        int[] id_ = this.id;
        for(int i=0;i<n;i++){
            id_[i] = i;
        }
    }
    public int[] getArr(){
        return id;
    }

    private int root(int i ){
        int[] id_ = this.id;
        while(i != id_[i]) {
            id[i] = id[id[i]];
            i = id_[i];
        }
        return i;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        id[i] = j;
    }
}
