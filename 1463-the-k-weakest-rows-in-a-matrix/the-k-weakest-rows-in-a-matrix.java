class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]) return Integer.compare(a[1],b[1]);
            return Integer.compare(a[0],b[0]);
        });
        for(int i=0;i<mat.length;i++){
            int soldiers=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    soldiers++;
                }
            }
            pq.add(new int[]{soldiers,i});
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.remove()[1];
        }
        return ans;

    }
}