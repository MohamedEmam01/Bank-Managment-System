
package bankmangmentsystem;


public class mylinked<o> {
  Node<o>Head;
    
    
    public class Node<o>{
    o Data;
    Node<o>next;
    
    public Node(o item){
    Data=item;
    next=null;
    }
    }  
    
    public boolean isEmpty(){
 if(Head==null)
     return true;
 return false;
 }
 
 public void insertfirst(o item){
 Node<o>n=new Node<>(item);
 n.Data=item;
 if(isEmpty()){
 n.next=null;
 Head=n;
 }
 else{
 n.next=Head;
 Head=n;
 }
 }
 
 public void display(){
 Node<o>temp=Head;
 while(temp!=null){
     System.out.println(temp.Data);
     temp=temp.next;
 }
 }
 
 public boolean isfound(o item){
 Node<o>temp=Head;
 while(temp!=null){
 if(temp.Data==item)
     return true;
 temp=temp.next;
 }
 return false;
 }


 public int count(){
 int counter=0;
 Node<o>temp=Head;
 while(temp!=null){
 temp=temp.next;
 counter++;
 }
 return counter;
 }
 
 
 public void insertbefore(o item,o nv){
 if(isfound(item)){
 Node<o>n=new Node<>(nv);
 Node<o>temp=Head;
 while(temp.next!=null&&temp.next.Data!=item){
 temp=temp.next;
 }
 n.next=temp.next;
 temp.next=n;
 }
 else
         System.out.println("sooorry");
 }
 
 public void append(o item){
 if(isEmpty())
     insertfirst(item);
 else{
Node<o>temp=Head;
while(temp.next!=null){
temp=temp.next;
}
 Node<o>n=new Node<>(item);
 n.Data=item;
 temp.next=n;
 n.next=null;
 }
 }
 public void insert(o item){
 Node<o>n=new Node<>(item);
 if(isEmpty())
     Head=n;
 else{
 Node<o>temp=Head;
 while(temp.next!=null)
     temp=temp.next;
 temp=temp.next;
 }
 }
 
 
 public boolean delfirst(){
 if(Head!=null){
 Head=Head.next;
 return true;
 }
 return false;
 }
 
 
 
 public boolean del(o item){
 if(isEmpty())
     return false;
 if(Head.Data==item)
     return delfirst();
 else{
 Node<o>temp=Head;
 Node<o>prev=Head.next;
 while(temp!=null){
 if(prev.Data.equals(item)){
 temp.next=prev.next;
 return true;
 }
 temp=prev;
 prev=prev.next;
 }
 return false;
 }
 }
 
}
