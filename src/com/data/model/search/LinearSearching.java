package com.data.model.search;

import com.data.view.SearchingFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author omkar
 */
public class LinearSearching {
    private Timer t;
    private static int count=0;
    public void linearSearch(SearchingFrame f,int element) throws InterruptedException{
            
            final int virtualArray[]=f.putValue();
            f.setValue(virtualArray);
            t=new Timer(300,new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    if(count>10){
                        t.stop();
                         JOptionPane.showMessageDialog(f, "No Element Found",  
                                   "Success", JOptionPane.DEFAULT_OPTION);   
                    };
                    CommonOperations.dothis(count-1,element,virtualArray,f,t);
                    count++;
                }
            });
            t.start();
            
    }
    
}
