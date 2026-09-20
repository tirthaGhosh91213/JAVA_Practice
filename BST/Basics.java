import java.util.List;

public class Basics {
  public static  class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }
  }
  public static Node insert(Node root,int data){
    if(root==null){
      root=new Node(data);
      return root;
    }
    if(root.data<data){
      root.right=insert(root.right, data);
    }else {
      root.left=insert(root.left, data);
    }
    return root;
  }
  public static void inorder(Node root){
    if(root==null) return ;
    inorder(root.left);
    System.out.println(root.data+" ");
    inorder(root.right);
  }
  public static boolean search(Node root, int key){
    if(root==null) return false;
    if(root.data==key){
      return true;
    }
    if(root.data>key){
     return  search(root.left, key);
    }
    else  return search(root.right, key);
  }
  public static Node delete(Node root,int val){
    if(root.data>val){
      root.left=delete(root.left, val); 
    }
    else if(root.data<val){
      root.right=delete(root.right, val);
    }else {
      if(root.left==null && root.right==null) return null;
     if(root.left==null){
      return root.right;
     }else if(root.right==null){
      return root.left;
     }
     Node IS=findinordersuccessor(root.right);
     root.data=IS.data;
     root.right=delete(root.right, IS.data);
    }
    return root;
  }
  public static Node findinordersuccessor(Node root){
    while(root.left!=null){
     root= root.left;
    }
    return root;
  }
  public static void printinRange(Node root, int k1,int k2){
    if(root==null) return ;
    if(root.data>=k1 && root.data<=k2){
      printinRange(root.left,k1,k2);
      System.out.print(root.data+" ");
      printinRange(root.right, k1, k2);
    }
    else if(root.data>k1){
      printinRange(root.left, k1, k2);
    }else printinRange(root.right, k1, k2);
  }

  public static void printRoot_Leaf(Node root,List<Integer> list){
   
   if(root==null) return ;
    list.add(root.data);
     if(root.left==null && root.right==null){
      for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+"-> ");
      }
      System.out.println("null");
    }
    printRoot_Leaf(root.left,list);
    printRoot_Leaf(root.right,list);
    list.remove(list.size()-1);
  }
  public static Node mirror(Node root){
    if(root==null) return null;
    Node leftMirror=mirror(root.left);
    Node rightMirror=mirror(root.right);
    root.left=rightMirror;
    root.right=leftMirror;
    return root;
  }
  public static void preorder(Node root){
    if(root==null) return;
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
  }
  public static void main(String[] args) {
    int[] values={5,1,3,4,2,7};
    Node root=null;
    for(int i=0;i<values.length;i++){
      root=insert(root, values[i]);
    }
    // inorder(root);
    // System.out.println(search(root, 10));
    // root=delete(root, 1);
    // inorder(root);
    // printinRange(root, 2, 7);
    //  List<Integer> list=new ArrayList<>();
    // printRoot_Leaf(root,list);
    root=mirror(root);
    preorder(root);
  }
}
