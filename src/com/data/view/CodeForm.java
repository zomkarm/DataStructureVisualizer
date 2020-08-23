/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author omkar
 */
public class CodeForm extends javax.swing.JFrame {

    /**
     * Creates new form CodeForm
     */
    public CodeForm() {
        initComponents();
        data[1]="/* C++ program to implement basic stack \n" +
"   operations */\n" +
"#include <bits/stdc++.h> \n" +
"  \n" +
"using namespace std; \n" +
"  \n" +
"#define MAX 1000 \n" +
"  \n" +
"class Stack { \n" +
"    int top; \n" +
"  \n" +
"public: \n" +
"    int a[MAX]; // Maximum size of Stack \n" +
"  \n" +
"    Stack() { top = -1; } \n" +
"    bool push(int x); \n" +
"    int pop(); \n" +
"    int peek(); \n" +
"    bool isEmpty(); \n" +
"}; \n" +
"  \n" +
"bool Stack::push(int x) \n" +
"{ \n" +
"    if (top >= (MAX - 1)) { \n" +
"        cout << \"Stack Overflow\"; \n" +
"        return false; \n" +
"    } \n" +
"    else { \n" +
"        a[++top] = x; \n" +
"        cout << x << \" pushed into stack\\n\"; \n" +
"        return true; \n" +
"    } \n" +
"} \n" +
"  \n" +
"int Stack::pop() \n" +
"{ \n" +
"    if (top < 0) { \n" +
"        cout << \"Stack Underflow\"; \n" +
"        return 0; \n" +
"    } \n" +
"    else { \n" +
"        int x = a[top--]; \n" +
"        return x; \n" +
"    } \n" +
"} \n" +
"int Stack::peek() \n" +
"{ \n" +
"    if (top < 0) { \n" +
"        cout << \"Stack is Empty\"; \n" +
"        return 0; \n" +
"    } \n" +
"    else { \n" +
"        int x = a[top]; \n" +
"        return x; \n" +
"    } \n" +
"} \n" +
"  \n" +
"bool Stack::isEmpty() \n" +
"{ \n" +
"    return (top < 0); \n" +
"} \n" +
"  \n" +
"// Driver program to test above functions \n" +
"int main() \n" +
"{ \n" +
"    class Stack s; \n" +
"    s.push(10); \n" +
"    s.push(20); \n" +
"    s.push(30); \n" +
"    cout << s.pop() << \" Popped from stack\\n\"; \n" +
"  \n" +
"    return 0; \n" +
"} ";
        data[2]="// C or C++ program for insertion and \n" +
"// deletion in Circular Queue \n" +
"#include<bits/stdc++.h> \n" +
"using namespace std; \n" +
"  \n" +
"struct Queue \n" +
"{ \n" +
"    // Initialize front and rear \n" +
"    int rear, front; \n" +
"  \n" +
"    // Circular Queue \n" +
"    int size; \n" +
"    int *arr; \n" +
"  \n" +
"    Queue(int s) \n" +
"    { \n" +
"       front = rear = -1; \n" +
"       size = s; \n" +
"       arr = new int[s]; \n" +
"    } \n" +
"  \n" +
"    void enQueue(int value); \n" +
"    int deQueue(); \n" +
"    void displayQueue(); \n" +
"}; \n" +
"  \n" +
"  \n" +
"/* Function to create Circular queue */\n" +
"void Queue::enQueue(int value) \n" +
"{ \n" +
"    if ((front == 0 && rear == size-1) || \n" +
"            (rear == (front-1)%(size-1))) \n" +
"    { \n" +
"        printf(\"\\nQueue is Full\"); \n" +
"        return; \n" +
"    } \n" +
"  \n" +
"    else if (front == -1) /* Insert First Element */\n" +
"    { \n" +
"        front = rear = 0; \n" +
"        arr[rear] = value; \n" +
"    } \n" +
"  \n" +
"    else if (rear == size-1 && front != 0) \n" +
"    { \n" +
"        rear = 0; \n" +
"        arr[rear] = value; \n" +
"    } \n" +
"  \n" +
"    else\n" +
"    { \n" +
"        rear++; \n" +
"        arr[rear] = value; \n" +
"    } \n" +
"} \n" +
"  \n" +
"// Function to delete element from Circular Queue \n" +
"int Queue::deQueue() \n" +
"{ \n" +
"    if (front == -1) \n" +
"    { \n" +
"        printf(\"\\nQueue is Empty\"); \n" +
"        return INT_MIN; \n" +
"    } \n" +
"  \n" +
"    int data = arr[front]; \n" +
"    arr[front] = -1; \n" +
"    if (front == rear) \n" +
"    { \n" +
"        front = -1; \n" +
"        rear = -1; \n" +
"    } \n" +
"    else if (front == size-1) \n" +
"        front = 0; \n" +
"    else\n" +
"        front++; \n" +
"  \n" +
"    return data; \n" +
"} \n" +
"  \n" +
"// Function displaying the elements \n" +
"// of Circular Queue \n" +
"void Queue::displayQueue() \n" +
"{ \n" +
"    if (front == -1) \n" +
"    { \n" +
"        printf(\"\\nQueue is Empty\"); \n" +
"        return; \n" +
"    } \n" +
"    printf(\"\\nElements in Circular Queue are: \"); \n" +
"    if (rear >= front) \n" +
"    { \n" +
"        for (int i = front; i <= rear; i++) \n" +
"            printf(\"%d \",arr[i]); \n" +
"    } \n" +
"    else\n" +
"    { \n" +
"        for (int i = front; i < size; i++) \n" +
"            printf(\"%d \", arr[i]); \n" +
"  \n" +
"        for (int i = 0; i <= rear; i++) \n" +
"            printf(\"%d \", arr[i]); \n" +
"    } \n" +
"} \n" +
"  \n" +
"/* Driver of the program */\n" +
"int main() \n" +
"{ \n" +
"    Queue q(5); \n" +
"  \n" +
"    // Inserting elements in Circular Queue \n" +
"    q.enQueue(14); \n" +
"    q.enQueue(22); \n" +
"    q.enQueue(13); \n" +
"    q.enQueue(-6); \n" +
"  \n" +
"    // Display elements present in Circular Queue \n" +
"    q.displayQueue(); \n" +
"  \n" +
"    // Deleting elements from Circular Queue \n" +
"    printf(\"\\nDeleted value = %d\", q.deQueue()); \n" +
"    printf(\"\\nDeleted value = %d\", q.deQueue()); \n" +
"  \n" +
"    q.displayQueue(); \n" +
"  \n" +
"    q.enQueue(9); \n" +
"    q.enQueue(20); \n" +
"    q.enQueue(5); \n" +
"  \n" +
"    q.displayQueue(); \n" +
"  \n" +
"    q.enQueue(20); \n" +
"    return 0; \n" +
"} ";
        data[3]="// C++ program for implementation of Bubble sort  \n" +
"#include <bits/stdc++.h> \n" +
"using namespace std; \n" +
"  \n" +
"void swap(int *xp, int *yp)  \n" +
"{  \n" +
"    int temp = *xp;  \n" +
"    *xp = *yp;  \n" +
"    *yp = temp;  \n" +
"}  \n" +
"  \n" +
"// A function to implement bubble sort  \n" +
"void bubbleSort(int arr[], int n)  \n" +
"{  \n" +
"    int i, j;  \n" +
"    for (i = 0; i < n-1; i++)      \n" +
"      \n" +
"    // Last i elements are already in place  \n" +
"    for (j = 0; j < n-i-1; j++)  \n" +
"        if (arr[j] > arr[j+1])  \n" +
"            swap(&arr[j], &arr[j+1]);  \n" +
"}  \n" +
"  \n" +
"/* Function to print an array */\n" +
"void printArray(int arr[], int size)  \n" +
"{  \n" +
"    int i;  \n" +
"    for (i = 0; i < size; i++)  \n" +
"        cout << arr[i] << \" \";  \n" +
"    cout << endl;  \n" +
"}  \n" +
"  \n" +
"// Driver code  \n" +
"int main()  \n" +
"{  \n" +
"    int arr[] = {64, 34, 25, 12, 22, 11, 90};  \n" +
"    int n = sizeof(arr)/sizeof(arr[0]);  \n" +
"    bubbleSort(arr, n);  \n" +
"    cout<<\"Sorted array: \\n\";  \n" +
"    printArray(arr, n);  \n" +
"    return 0;  \n" +
"}  \n" +
"  ";
        data[4]="// C++ program for insertion sort  \n" +
"#include <bits/stdc++.h> \n" +
"using namespace std; \n" +
"  \n" +
"/* Function to sort an array using insertion sort*/\n" +
"void insertionSort(int arr[], int n)  \n" +
"{  \n" +
"    int i, key, j;  \n" +
"    for (i = 1; i < n; i++) \n" +
"    {  \n" +
"        key = arr[i];  \n" +
"        j = i - 1;  \n" +
"  \n" +
"        /* Move elements of arr[0..i-1], that are  \n" +
"        greater than key, to one position ahead  \n" +
"        of their current position */\n" +
"        while (j >= 0 && arr[j] > key) \n" +
"        {  \n" +
"            arr[j + 1] = arr[j];  \n" +
"            j = j - 1;  \n" +
"        }  \n" +
"        arr[j + 1] = key;  \n" +
"    }  \n" +
"}  \n" +
"  \n" +
"// A utility function to print an array of size n  \n" +
"void printArray(int arr[], int n)  \n" +
"{  \n" +
"    int i;  \n" +
"    for (i = 0; i < n; i++)  \n" +
"        cout << arr[i] << \" \";  \n" +
"    cout << endl; \n" +
"}  \n" +
"  \n" +
"/* Driver code */\n" +
"int main()  \n" +
"{  \n" +
"    int arr[] = { 12, 11, 13, 5, 6 };  \n" +
"    int n = sizeof(arr) / sizeof(arr[0]);  \n" +
"  \n" +
"    insertionSort(arr, n);  \n" +
"    printArray(arr, n);  \n" +
"  \n" +
"    return 0;  \n" +
"}  ";
        data[5]="// C++ program for implementation of selection sort  \n" +
"#include <bits/stdc++.h> \n" +
"using namespace std; \n" +
"  \n" +
"void swap(int *xp, int *yp)  \n" +
"{  \n" +
"    int temp = *xp;  \n" +
"    *xp = *yp;  \n" +
"    *yp = temp;  \n" +
"}  \n" +
"  \n" +
"void selectionSort(int arr[], int n)  \n" +
"{  \n" +
"    int i, j, min_idx;  \n" +
"  \n" +
"    // One by one move boundary of unsorted subarray  \n" +
"    for (i = 0; i < n-1; i++)  \n" +
"    {  \n" +
"        // Find the minimum element in unsorted array  \n" +
"        min_idx = i;  \n" +
"        for (j = i+1; j < n; j++)  \n" +
"        if (arr[j] < arr[min_idx])  \n" +
"            min_idx = j;  \n" +
"  \n" +
"        // Swap the found minimum element with the first element  \n" +
"        swap(&arr[min_idx], &arr[i]);  \n" +
"    }  \n" +
"}  \n" +
"  \n" +
"/* Function to print an array */\n" +
"void printArray(int arr[], int size)  \n" +
"{  \n" +
"    int i;  \n" +
"    for (i=0; i < size; i++)  \n" +
"        cout << arr[i] << \" \";  \n" +
"    cout << endl;  \n" +
"}  \n" +
"  \n" +
"// Driver program to test above functions  \n" +
"int main()  \n" +
"{  \n" +
"    int arr[] = {64, 25, 12, 22, 11};  \n" +
"    int n = sizeof(arr)/sizeof(arr[0]);  \n" +
"    selectionSort(arr, n);  \n" +
"    cout << \"Sorted array: \\n\";  \n" +
"    printArray(arr, n);  \n" +
"    return 0;  \n" +
"}";
        data[6]="// C++ code to linearly search x in arr[]. If x \n" +
"// is present then return its location, otherwise \n" +
"// return -1 \n" +
"  \n" +
"#include <iostream> \n" +
"using namespace std; \n" +
"  \n" +
"int search(int arr[], int n, int x) \n" +
"{ \n" +
"    int i; \n" +
"    for (i = 0; i < n; i++) \n" +
"        if (arr[i] == x) \n" +
"            return i; \n" +
"    return -1; \n" +
"} \n" +
"  \n" +
"int main(void) \n" +
"{ \n" +
"    int arr[] = { 2, 3, 4, 10, 40 }; \n" +
"    int x = 10; \n" +
"    int n = sizeof(arr) / sizeof(arr[0]); \n" +
"    int result = search(arr, n, x); \n" +
"   (result == -1)? cout<<\"Element is not present in array\" \n" +
"                 : cout<<\"Element is present at index \" <<result; \n" +
"   return 0; \n" +
"} ";
        data[7]="// C++ program to implement recursive Binary Search \n" +
"#include <bits/stdc++.h> \n" +
"using namespace std; \n" +
"  \n" +
"// A recursive binary search function. It returns \n" +
"// location of x in given array arr[l..r] is present, \n" +
"// otherwise -1 \n" +
"int binarySearch(int arr[], int l, int r, int x) \n" +
"{ \n" +
"    if (r >= l) { \n" +
"        int mid = l + (r - l) / 2; \n" +
"  \n" +
"        // If the element is present at the middle \n" +
"        // itself \n" +
"        if (arr[mid] == x) \n" +
"            return mid; \n" +
"  \n" +
"        // If element is smaller than mid, then \n" +
"        // it can only be present in left subarray \n" +
"        if (arr[mid] > x) \n" +
"            return binarySearch(arr, l, mid - 1, x); \n" +
"  \n" +
"        // Else the element can only be present \n" +
"        // in right subarray \n" +
"        return binarySearch(arr, mid + 1, r, x); \n" +
"    } \n" +
"  \n" +
"    // We reach here when element is not \n" +
"    // present in array \n" +
"    return -1; \n" +
"} \n" +
"  \n" +
"int main(void) \n" +
"{ \n" +
"    int arr[] = { 2, 3, 4, 10, 40 }; \n" +
"    int x = 10; \n" +
"    int n = sizeof(arr) / sizeof(arr[0]); \n" +
"    int result = binarySearch(arr, 0, n - 1, x); \n" +
"    (result == -1) ? cout << \"Element is not present in array\"\n" +
"                   : cout << \"Element is present at index \" << result; \n" +
"    return 0; \n" +
"} ";
        optionSelect.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    String item = optionSelect.getSelectedItem().toString();
                    if(item.equals("Stack"))
                        codePane.setText(data[1]);
                    if(item.equals("Queue"))    
                        codePane.setText(data[2]);
                    if(item.equals("Bubble Sort"))    
                        codePane.setText(data[3]);
                    if(item.equals("Insertion Sort"))    
                        codePane.setText(data[4]);
                    if(item.equals("Selection Sort"))    
                        codePane.setText(data[5]);
                    if(item.equals("Linear Search"))    
                        codePane.setText(data[6]);
                    if(item.equals("Binary Serach"))    
                        codePane.setText(data[7]);

                        
                }
            });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        codePane = new java.awt.TextArea();
        BackToDashButton = new javax.swing.JButton();
        optionSelect = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(937, 452));

        jLabel1.setBackground(new java.awt.Color(91, 164, 137));
        jLabel1.setFont(new java.awt.Font("Noto Sans Mono CJK SC", 1, 24)); // NOI18N
        jLabel1.setText("Code :");

        codePane.setBackground(new java.awt.Color(218, 206, 237));

        BackToDashButton.setText("Back To DashBoard");
        BackToDashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToDashButtonActionPerformed(evt);
            }
        });

        optionSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Algorithm", "Stack", "Queue", "Bubble Sort", "Insertion Sort", "Selection Sort", "Linear Search", "Binary Search", " " }));
        optionSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionSelectActionPerformed(evt);
            }
        });
        optionSelect.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                optionSelectKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackToDashButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(optionSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(codePane, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(BackToDashButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(codePane, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(optionSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToDashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashButtonActionPerformed
        this.setVisible(false);
        new DashBoard().setVisible(true);
    }//GEN-LAST:event_BackToDashButtonActionPerformed

    private void optionSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionSelectActionPerformed

    private void optionSelectKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_optionSelectKeyPressed
    }//GEN-LAST:event_optionSelectKeyPressed
    /**
     * @param args the command line arguments
     */
    
    String data[]=new String[8];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToDashButton;
    private java.awt.TextArea codePane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> optionSelect;
    // End of variables declaration//GEN-END:variables
}
