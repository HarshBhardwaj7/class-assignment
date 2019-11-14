import java.util.*;
class Node
{
int item;
Node l;
Node r;
 public Node(int k)
{
   item=k;
   l=null;
    r=null;
}

}

class RevTree1 
{ 
    
 Node root; 
  
    public RevTree1() 
    { 
        root = null; 
 } 
  
    
 void treeprint() 
 { 

 int h =3;
 int i; 
 for (i=h; i>=1; i--) 
  display(root, i); 
    } 
  
    
  
  
    
 void display(Node root ,int lev)   { 
    if (root == null) 
       return; 
   if (lev== 1) 
  System.out.print(root.item + " "); 
  else if (lev>1) 
  { 
    display(root.l, lev-1); 
    display(root.r, lev-1); 
  } 
 } 
      
    
 public static void main(String args[]) 
 { 
  RevTree1 tree = new RevTree1(); 
  tree.root= new Node(40); 
  tree.root.l= new Node(30); 
  tree.root.r= new Node(70); 
   tree.root.r.l= new Node(50); 
   tree.root.r.r= new Node(80); 
    tree.root.l.l=new Node(20);
     tree.root.l.r=new Node(35);
         
   System.out.println("This is answer"); 
    tree.treeprint(); 
} 
}




     