/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmangmentsystem;

import bankmangmentsystem.Employee;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Dell
 */
public class myarray<o> implements List<o>{
    int size;
    int cap;
    o[]arr;
    
    public myarray(){
    size=0;
    cap=100;
    arr=(o[])new Object[cap];
    }


    @Override
    public int size() {
    return size; 
    }

    @Override
    public boolean isEmpty() {
    if(size==0)
        return true;
    return false;
    }

    @Override
    public boolean contains(Object o) {
    for(o e:arr)
        if(e.equals(o))
            return true;
    return false;
    }

    @Override
    public Iterator<o> iterator() {
    o[]copy=Arrays.copyOf(arr, size);
    return Arrays.asList(copy).iterator();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void cp(){
    if(size==cap){
    cap*=2;
    o[]run=(o[])new Object[cap];
    System.arraycopy(arr, 0,run, 0, size);
    run=arr;
    }
    } 
    
    
    @Override
    public boolean add(o e) {
    cp();
    arr[size]=e;
    size++;
    return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends o> list) {
    cp();
    for(o e:list)
        add(e);
    return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends o> list) {
    for(int i=size-1;i>=0;i--){
    arr[i+list.size()]=arr[i];
    }    
    
    for(o e:list){
    arr[index]=e;
     size++;
    }
    size+=list.size();
    return true;
    }
   

    @Override
    public boolean removeAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public o get(int i) {
    if(i<size)
        return arr[i];
    else
        return null;
    }

    public boolean getID(int item) {
    for(int i=0 ; i<arr.length;i++){
        if(arr[i].equals(item)){
            return true;
        }
    }
    return false;
    }
    @Override
    public o set(int i, o e) {
    o last=arr[i];
    if(i<size)
        arr[i]=e;
    else
        return null;
    return last;
    }

    @Override
    public void add(int index, o e) {
    for(int i=size-1;i>=0;i--){
    arr[i+1]=arr[i];
    }  
    arr[index]=e;
    size++;
    }

    @Override
    public o remove(int i) {
   if(i>=0&&i<size){
   o r=arr[i];
   for(int in=i;in<size-1;in++){
   arr[in]=arr[in+1];
   }
   size--;
   return r;
   }  
   return null;
    }

    @Override
    public int indexOf(Object o) {
    for(int i=0;i<size;i++)
        if(o.equals(arr[i]))
            return i;
    return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
    for(int i=size-1;i>=0;i--)
        if(o.equals(arr[i]))
            return i;
    return -1;
    }

    @Override
    public ListIterator<o> listIterator() {
    o[]copy=Arrays.copyOf(arr, size);
    return Arrays.asList(copy).listIterator();
    }

    @Override
    public ListIterator<o> listIterator(int i) {
    o[]copy=Arrays.copyOf(arr, size);
    return Arrays.asList(copy).listIterator(i);
    }

    @Override
    public List<o> subList(int i, int i1) {
    if(i>0&& i1<size){
    o[]c=Arrays.copyOfRange(arr, i, i1);
    return Arrays.asList(c);
    }   
    else
        return Arrays.asList((o[])new Object[0]);
    }
//    public boolean linearSearch(myarray<Employee> myArray,int item)
//    {
//        for(int i=0;i<myArray.size-1;i++){
//            
//            if(myArray.arr[i].getEm_ID()==item){
//                
//            return true ;
//            }
//       
//    }
//        return false;
//    }
    public  void insertSort(myarray <Employee>array) {
        for(int i =1;i<array.size;i++){
        int j=i-1;
        Employee item=array.get(i);
        while(j>=0&&array.get(j).getEm_ID()>item.getEm_ID()){
        array.set(j+1, array.get(j));
        j--;
        }
        array.set(j+1, item);
        }
    }
    
}