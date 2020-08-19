/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data.model.search;

import com.data.view.SearchingFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author omkar
 */
public class BinarySearching {
    private Timer t;
    private int count=0;
    private ArrayList<Integer> bIndex=new ArrayList<Integer>();
    
    public void index(int virtualArray[],int element){
        int left=0,right=virtualArray.length;
        while(left<=right){
           int mid=(left+right)/2;
           bIndex.add(mid);
           if(virtualArray[mid]==element){
               return;
           }
           if(element>virtualArray[mid]) left=mid+1;
           else right=mid-1;
        }
    }
    public void binarySearch(SearchingFrame f,int element) throws InterruptedException{
            
            final int virtualArray[]=f.putValue();
            Arrays.sort(virtualArray);
            f.setValue(virtualArray);
            index(virtualArray, element);
            t=new Timer(300,new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    if(count==bIndex.size()){
                        t.stop();
                         JOptionPane.showMessageDialog(f, "No Element Found",  
                                   "Success", JOptionPane.DEFAULT_OPTION);   
                    };
                    CommonOperations.dothis(bIndex.get(count),element,virtualArray,f,t);
                    count++;
                }
            });
            t.start();
            
    }

}
