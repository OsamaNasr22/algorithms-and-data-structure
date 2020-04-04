public class QuickUnion {

    private int[] ids ;

    public  QuickUnion(int N){
        ids = new int[N];
        for (int i = 0 ; i< N ; i++){
            ids[i] = i;
        }
    }
    public boolean connected(int p , int q){
        return  root(p) == root(q);
    }

    private int root(int i){
        while (i != ids[i] ) i = ids[i];
        return  i;
    }

    public void union(int p , int q){
        int i = root(p);
        int j = root(q);
        ids[i] = j;
    }
}
