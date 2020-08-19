/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data.main;

import static java.lang.System.out;
import java.util.ArrayList;

/**
 *
 * @author omkar
 */
public class Try {
    static ArrayList<Integer> bIndex=new ArrayList<Integer>();
    
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
    public static void main(String[] args) {
        Try t=new Try();
        int arr[]={1,3,4,5,6,7,8,9};
        t.index(arr, 3);
        for(Integer a:bIndex) out.println(a);
    }
}
