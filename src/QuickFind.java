public class QuickFind {


    private int[] ids;

    public  QuickFind(int N){
        ids = new int[N];
        for(int i=0 ; i< N ; i++) {
            ids[i] = i;
        }
    }

    public boolean connected (int p, int q){
        return  ids[p] == ids[q];
    }

    public void union(int p , int q){
        int idP = ids[p];
        int idQ = ids[q];
        for (int i =0 ; i < ids.length ; i++){
            if(ids[i] == idP) ids[i] = idQ;
        }
    }
    public static void main(String[] args) {
        System.out.println("osama");
    }



}
