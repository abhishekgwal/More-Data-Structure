package com.trees.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnionOfTwoSortedList {

	static List<Integer> union(List<Integer> a, List<Integer> b) {
        
        List<Integer> list = new ArrayList<>();
        
        for (Integer i : b)
        	list.add(i);
        
        for (Integer i : a)
        	list.add(i);
        
        Collections.sort(list);
        
        return list;
    }
    
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        
        a.add(10);
        a.add(20);
        a.add(30);
        b.add(35);
        b.add(45);
        b.add(55);
        
        List<Integer> ans = UnionOfTwoSortedList.union(a, b);
        System.out.println(ans);
    
    }
}
