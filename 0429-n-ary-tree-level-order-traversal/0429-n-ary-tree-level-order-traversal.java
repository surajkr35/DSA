class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<Node> q = new LinkedList<>();
        
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < n; i++){
                Node temp = q.remove();

                list.add(temp.val);

                for(Node child : temp.children){
                    if(child != null){
                        q.add(child);
                    }
                }
            }
            ans.add(list);
            
        }
        return ans;
    }
}
// class Solution {
//     public List<List<Integer>> levelOrder(Node root) {
//         List<List<Integer>> ans = new ArrayList<>();

//         if(root == null){
//             return ans;
//         }

//         List<Integer> list = new ArrayList<>();
//         Queue<Node> q = new LinkedList<>();
        
//         q.add(root);
//         q.add(null);

//         while(!q.isEmpty()){
//             Node temp = q.remove();

//             if(temp == null){
//                ans.add(list);
//                list = new ArrayList<>();

//                if(!q.isEmpty()){
//                 q.add(null);
//                }
//             }
//             else {
//                 list.add(temp.val);
//                 for(Node child : temp.children){
//                     if(child != null){
//                         q.add(child);
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
// }