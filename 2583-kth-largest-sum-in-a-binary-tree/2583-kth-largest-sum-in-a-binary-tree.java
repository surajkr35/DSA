class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int len = q.size();
            long sum = 0;

            for(int i = 0; i < len; i++){
                TreeNode temp = q.poll();
                sum += temp.val;

                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
            pq.offer(sum);

            if(pq.size() > k){
                pq.poll();
            }
        }

        if(pq.size() < k){
            return -1;
        }

        return pq.poll();
    }
}