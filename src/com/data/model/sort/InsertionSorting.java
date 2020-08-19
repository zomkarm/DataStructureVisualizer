
package com.data.model.sort;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import com.data.view.SortingFrame;
/**
 *
 * @author omkar
 */
public class InsertionSorting {
    private Timer t;
    private static int count=0;

    private ArrayList<ArrayList> ls=new ArrayList();
    ArrayList putVal(int arr[]){
        ArrayList l=new ArrayList();
        for(int i:arr) l.add(i);
        return l;
    }   
    void Insertion(int virtualArray[]){
        ArrayList l=new ArrayList();
        int i, key, j;  
                for (i = 1; i < 11; i++) 
                {  
                    key = virtualArray[i];  
                    j = i - 1;  
                    while (j >= 0 && virtualArray[j] > key) 
                    {  
                        virtualArray[j + 1] = virtualArray[j];  
                        j = j - 1;  
                    }  
                    virtualArray[j + 1] = key;
                    l=putVal(virtualArray);
                    ls.add(l);
                }  
    }
    int[] convert(ArrayList l){
        int arr[]=new int[11];
        for(int i=0;i<l.size();i++) arr[i]=(Integer)l.get(i);
        return arr;
    }
    public void InsertionSort(SortingFrame f) throws InterruptedException{
            int virtualArray[]=new int[11];
            virtualArray=f.putValue();
            f.setValue(virtualArray);
            Insertion(virtualArray);
            t=new Timer(200,new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                       int[] arr=convert(ls.get(count));
                      if(count==ls.size()-1){
                          t.stop();
                          Message(f);
                      }
                      f.setValue(arr);
                      count++;
                }
            });
            t.start();
            
    }
    public void Message(SortingFrame f){
        JOptionPane.showMessageDialog(f, "All the Elements are Sorted",  
                                   "Success", JOptionPane.DEFAULT_OPTION);
    }
}
