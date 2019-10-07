package unionfind;

public class  QuickFindUF implements UnionFindI {

    private int[] id;
    public int[] getArr(){
        return id;
    }
    public QuickFindUF(int n){
        this.id = new int[n];
        int[] id_ = this.id;
        for(int i=0;i<n;i++){
            id_[i] = i;
        }
    }

    @Override
    public boolean connected(int p, int q){
        return this.id[p] == this.id[q];
    }

    @Override
    public void union(int p, int q){
        int[] id_ = this.id;
        int pid = id_[p];
        int qid = id_[q];

        for(int i=0;i< id_.length;i++){
            if(id_[i]==pid) id_[i] = qid;
        }
    }

}
