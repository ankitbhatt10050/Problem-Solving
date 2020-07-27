// package Recurrsion;
// import java.util.*;
// public class PrintAllPossibleBT {
//    public static Map<Integer, List<TreeNode>> memo = new HashMap();
//     public class TreeNode {
//              int val;
//              TreeNode left;
//              TreeNode right;
//              TreeNode() {}
//              TreeNode(int val) { this.val = val; }
//              TreeNode(int val, TreeNode left, TreeNode right) {
//                  this.val = val;
//                  this.left = left;
//                  this.right = right;
//              }
//          }
//     public static List<TreeNode> allPossibleFBT(int N) {
//         if (!memo.containsKey(N)) {
//             List<TreeNode> ans = new LinkedList();
//             if (N == 1) {
//                 ans.add(new TreeNode(0));
//             } 
//             else if (N % 2 == 1) {
//                 for (int x = 0; x < N; ++x) {
//                     int y = N - 1 - x;
//                     for (TreeNode left: allPossibleFBT(x))
//                         for (TreeNode right: allPossibleFBT(y)) {
//                             TreeNode bns = new TreeNode(0);
//                             bns.left = left;
//                             bns.right = right;
//                             ans.add(bns);
//                         }
//                 }
//             }
//             memo.put(N, ans);
//         }

//         return memo.get(N);
//     }
//     public static void main(String[]args)
//         {
//             Scanner s=new Scanner(System.in);
//             int N=s.nextInt();
           
//            List<TreeNode>x=new ArrayList<TreeNode>();
//             x= allPossibleFBT(N);
//             System.out.print(x);
//         }
// }