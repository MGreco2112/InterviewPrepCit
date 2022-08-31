package com.company.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public  class BinaryTreeSearch {

    public static List<Integer> searchTree(Node root, List<Integer> queries) {
        List<Integer> output = new ArrayList<>();

        for (Integer query : queries) {
            boolean queryFound = false;
            Node pointer = root;

            while (pointer.left != null || pointer.right != null) {
                if (query == pointer.data) {
                    output.add(1);
                    queryFound = true;
                    break;
                }

                if (query > pointer.data && pointer.right != null) {
                    pointer = pointer.right;
                } else if (query < pointer.data && pointer.left != null) {
                    pointer= pointer.left;
                } else {
                    break;
                }

            }
            if (!queryFound) {
                output.add(0);
            }
        }


        return output;
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of values to be entered");
        int T=sc.nextInt();
        Node root=null;
        while(T-->0) {
            System.out.println("Enter a node value");
            int data=sc.nextInt();
            root=insert(root,data);
        }
        //search method runs here
        System.out.println(searchTree(root, Arrays.asList(30, 10, 12, 15)));
    }

}
