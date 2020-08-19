package com.data.model.search;

import com.data.view.SearchingFrame;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author omkar
 */
public class CommonOperations {
    public static void colorSet(SearchingFrame obj){
        obj.arrayElementOne.setBackground(Color.white);
        obj.arrayElementTwo.setBackground(Color.white);
        obj.arrayElementThree.setBackground(Color.white);
        obj.arrayElementFour.setBackground(Color.white);
        obj.arrayElementFive.setBackground(Color.white);
        obj.arrayElementSix.setBackground(Color.white);
        obj.arrayElementSeven.setBackground(Color.white);
        obj.arrayElementEight.setBackground(Color.white);
        obj.arrayElementNine.setBackground(Color.white);
        obj.arrayElementTen.setBackground(Color.white);
        obj.arrayElementEleven.setBackground(Color.white);
    }
    public static void Message(SearchingFrame f){
        JOptionPane.showMessageDialog(f, "All the Elements are Sorted",  
                                   "Success", JOptionPane.DEFAULT_OPTION);
    }
    
    public static void dothis(int cnt,int ele,int arr[],SearchingFrame f,Timer t){
        
        switch(cnt){
            case 0:
                if(arr[0]==ele){
                    f.arrayElementOne.setBackground(Color.green);
                    f.arrayElementOne.setOpaque(true);
                    JOptionPane.showMessageDialog(f, "Element Found",  
                                           "Success", JOptionPane.DEFAULT_OPTION);
                    t.stop();
                }
                else{
                    f.arrayElementOne.setBackground(Color.red);
                    f.arrayElementOne.setOpaque(true);
                }
                break;
                
            case 1:
                if(arr[1]==ele){
                    f.arrayElementTwo.setBackground(Color.green);
                    f.arrayElementTwo.setOpaque(true);
                    JOptionPane.showMessageDialog(f, "Element Found",  
                                           "Success", JOptionPane.DEFAULT_OPTION);
                    t.stop();
                }
                else{
                    f.arrayElementTwo.setBackground(Color.red);
                    f.arrayElementTwo.setOpaque(true);
                }
                break;
                
            case 2:
                if(arr[2]==ele){
                    f.arrayElementThree.setBackground(Color.green);
                    f.arrayElementThree.setOpaque(true);
                    JOptionPane.showMessageDialog(f, "Element Found",  
                                           "Success", JOptionPane.DEFAULT_OPTION);
                    t.stop();
                }
                else{
                    f.arrayElementThree.setBackground(Color.red);    
                    f.arrayElementThree.setOpaque(true);
                }
                break;
                
            case 3:
                if(arr[3]==ele){
                    f.arrayElementFour.setBackground(Color.green);
                    f.arrayElementFour.setOpaque(true);
                    JOptionPane.showMessageDialog(f, "Element Found",  
                                           "Success", JOptionPane.DEFAULT_OPTION);
                    t.stop();
                }
                else{
                    f.arrayElementFour.setBackground(Color.red);
                    f.arrayElementFour.setOpaque(true);
                }
                
            case 4:
                if(arr[4]==ele){
                    f.arrayElementFive.setBackground(Color.green);
                    f.arrayElementFive.setOpaque(true);
                    JOptionPane.showMessageDialog(f, "Element Found",  
                                           "Success", JOptionPane.DEFAULT_OPTION);
                    t.stop();
                }
                else{
                    f.arrayElementFive.setBackground(Color.red);
                    f.arrayElementFive.setOpaque(true);
                }
                break;
                
            case 5:
                if(arr[5]==ele){
                    f.arrayElementSix.setBackground(Color.green);
                    f.arrayElementSix.setOpaque(true);
                    JOptionPane.showMessageDialog(f, "Element Found",  
                                           "Success", JOptionPane.DEFAULT_OPTION);
                    t.stop();
                }
                else
                {
                    f.arrayElementSix.setBackground(Color.red);
                    f.arrayElementSix.setOpaque(true);
                }
                break;

            case 6:
                if(arr[6]==ele){
                    f.arrayElementSeven.setBackground(Color.green);
                    f.arrayElementSeven.setOpaque(true);
                    JOptionPane.showMessageDialog(f, "Element Found",  
                                           "Success", JOptionPane.DEFAULT_OPTION);
                    t.stop();
                }
                else{
                    f.arrayElementSeven.setBackground(Color.red);
                    f.arrayElementSeven.setOpaque(true);
                }
                break;
                
            case 7:
                if(arr[7]==ele){
                    f.arrayElementEight.setBackground(Color.green);
                    f.arrayElementEight.setOpaque(true);
                    JOptionPane.showMessageDialog(f, "Element Found",  
                                           "Success", JOptionPane.DEFAULT_OPTION);
                    t.stop();
                }
                else{
                    f.arrayElementEight.setBackground(Color.red);
                    f.arrayElementEight.setOpaque(true);
                }
                break;
                
            case 8:
                if(arr[8]==ele){
                    f.arrayElementNine.setBackground(Color.green);
                    f.arrayElementNine.setOpaque(true);
                    JOptionPane.showMessageDialog(f, "Element Found",  
                                           "Success", JOptionPane.DEFAULT_OPTION);
                    t.stop();
                }
                else{
                    f.arrayElementNine.setBackground(Color.red);
                    f.arrayElementNine.setOpaque(true);
                }
                break;

            case 9:
                if(arr[9]==ele){
                    f.arrayElementTen.setBackground(Color.green);
                    f.arrayElementTen.setOpaque(true);
                    JOptionPane.showMessageDialog(f, "Element Found",  
                                           "Success", JOptionPane.DEFAULT_OPTION);
                    t.stop();
                }
                else{
                    f.arrayElementTen.setBackground(Color.red);
                    f.arrayElementTen.setOpaque(true);
                }
                break;
                
            case 10:
                if(arr[10]==ele){
                    f.arrayElementEleven.setBackground(Color.green);
                    f.arrayElementEleven.setOpaque(true);
                    JOptionPane.showMessageDialog(f, "Element Found",  
                                           "Success", JOptionPane.DEFAULT_OPTION);
                    t.stop();
                }
                else{
                    f.arrayElementEleven.setBackground(Color.red);
                    f.arrayElementEleven.setOpaque(true);
                }

        }
    }
    
}
