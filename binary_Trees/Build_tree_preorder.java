
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
public static int diameter(Node root){
  if(root==null) return 0;
  int lh=heightofTree(root.left);
  int rh=heightofTree(root.right);
  int ldiam=diameter(root.left);
  int rdiam=diameter(root.right);
  int selftDia=lh+rh+1;
  return Math.max(selftDia, Math.max(ldiam,rdiam));
}
static class Info{
  int diam;
  int ht;
  public Info(int diam,int ht){
    this.diam=diam;
    this.ht=ht;
  }
}
public static Info diameter2(Node root){
  if(root==null) return new Info(0, 0);
  Info leftInfo=diameter2(root.left);
  Info rightInfo=diameter2(root.right);
  int diam=Math.max(leftInfo.ht+rightInfo.ht+1, Math.max(leftInfo.diam, leftInfo.diam));
  int ht=Math.max(leftInfo.ht, rightInfo.ht)+1;
  return new Info(diam, ht);
}
public static boolean isIdentical(Node root,Node subRoot){
  if(root==null && subRoot==null) return true;
  else if (root==null || subRoot==null || root.data!=subRoot.data) return false;
  if (!isIdentical(root.left, subRoot.left) ) return false ;
  if(!isIdentical(root.right, subRoot.right) ) return false;
  return true;
}
public static boolean isSubtree(Node root,Node subRoot){
  if(root==null) return false;
  if(root.data==subRoot.data){
    if(isIdentical(root,subRoot)){
      return true;
    }
  }
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  
}
 }
  public static void main(String[] args) {
      int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

      Node subroot=new Node(2);
      subroot.left=new Node(4);
      subroot.right=new Node(5);

      BinaryTree tree=new BinaryTree();
      Node root=tree.buildtree(nodes);
    // System.out.println(tree.diameter2(root).diam);
    System.out.println(tree.isSubtree(root, subroot) );

  }
}
