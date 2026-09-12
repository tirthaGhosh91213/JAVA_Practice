
import java.util.LinkedList;
import java.util.Queue;


public class Build_tree_preorder {
  static class Node{
    int data;
      Node left;
    Node right;
    Node(int data){
      this.data=data;
      this.left=null;
      this.right=null;
    }
  }
  static class BinaryTree{
    static int idx=-1;
    public static Node buildtree(int nodes[]){
      idx++;
      if(nodes[idx]==-1) return null;
      Node newNode =new Node(nodes[idx]);
      newNode.left=buildtree(nodes);
      newNode.right=buildtree(nodes);
      return  newNode;
    }
    public static void preorder(Node root){
      if(root==null) return;
      System.out.print(root.data+" ");
      preorder(root.left);
      preorder(root.right);
    }
    public static void inorder(Node root){
      if(root==null) return;
      preorder(root.left);
      System.out.print(root.data+" ");
      
      preorder(root.right);
  }
  public static void postorder(Node root){
      if(root==null) return;
     
      preorder(root.left);
      preorder(root.right);
      System.out.print(root.data+" ");
}

//  importent ***
public static void levelorder(Node root){
  if(root==null) return ;
  Queue<Node> q=new LinkedList<>();
  q.add(root);
  q.add(null);
  while(!q.isEmpty()){
    Node currnode=q.remove();
    if(currnode==null){
      System.out.println();
      if(q.isEmpty()){
        break;
      }else q.add(null);
    } else {
      System.out.println(currnode.data+" ");
      if(currnode.left!=null){
        q.add(currnode.left);
      }
      if(currnode.right!=null){
        q.add(currnode.right);
      }
    }
  }
}


public static int heightofTree(Node root){
  if(root==null) return 0;
  int lh=heightofTree(root.left);
  int rh=heightofTree(root.right);
  return Math.max(rh, lh)+1;
}

public static int countNodes(Node root){
  if(root==null) return 0;
  int lc=countNodes(root.left);
  int rc=countNodes(root.right);
  return lc+rc+1;
}
public static int sumofnodes(Node root){
  if(root==null) return 0;
  int ls=sumofnodes(root.left);
  int rs=sumofnodes(root.right);
  return ls+rs+root.data;
}
 }
  public static void main(String[] args) {
      int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      BinaryTree tree=new BinaryTree();
      Node root=tree.buildtree(nodes);
    System.out.println(tree.sumofnodes(root));

  }
}
