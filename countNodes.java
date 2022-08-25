class TreeNode<T>{
T data;
ArrayList<TreeNode<T> children;
  Treenode(){
   data=0;
    children=new ArrayList<TreeNode<T>>;
  }
public static int countNodes(TreeNode<T> root){
if(root==null)
  return 0;
  int count=1;
  for(int i=0;i<root.children.size();i++){
  count=count+print(root.children.get(i));
  }
return count;
}


}



//Print sum Of all nodes

public static int sumOfAllNode(TreeNode<Integer> root){
        int sum=root.data;
        for(int i=0;i<root.children.size();i++){
            sum=sum+sumOfAllNode(root.children.get(i));
        }
        return sum;

