public class QuickFindService {
    private int[] ids;

    public QuickFindService(int N){
        ids = new int[N];
        for (int i = 0; i < N; i++){
            ids[i] = i;
        }
    }

    public void union(int p, int q){
        int pId = ids[p];
        int qId = ids[q];
        for (int i = 0; i < ids.length; i++){
            if (ids[i] == pId) ids[i] = qId;
        }
    }

    public boolean find (int p, int q){
        return ids[p] == ids[q];
    }

    public int[] getIds(){
        return ids;
    }
}