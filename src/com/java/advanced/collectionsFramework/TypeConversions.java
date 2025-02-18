package com.java.advanced.collectionsFramework;

import java.util.*;
import java.util.stream.Collectors;

class TypeConversions {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        Integer[]arr1={1,2,3,4,5};
        ArrayList<Integer>al=new ArrayList<>(Arrays.asList(1,2,3,4));

        //int arr into arraylist
        ArrayList<Integer>arrayList1=new ArrayList<>(Arrays.stream(arr).boxed().toList());
        System.out.println("int arr to arraylist"+arrayList1+arrayList1.getClass());

        //Integer arr to arraylist
        ArrayList<Integer>arrayList2=new ArrayList<>(Arrays.asList(arr1));
        System.out.println("Integer arr to arraylist"+arrayList2+arrayList2.getClass());

        //int arr to hashset
        HashSet<Integer>hashSet2=Arrays.stream(arr).boxed().collect(Collectors.toCollection(HashSet::new));
        System.out.println("int arr to hashset"+hashSet2+hashSet2.getClass());

        //Integer arr to hashset
        HashSet<Integer>HashSet1=new HashSet<>(Arrays.asList(arr1));
        System.out.println("Integer arr to hashset"+HashSet1+HashSet1.getClass());

        //arraylist to integer arr
        Integer[]array1=al.toArray(new Integer[0]);
        System.out.println("arraylist to int array"+Arrays.toString(array1)+"size is "+array1.length);

        //arraylist to int arr
        int[]array2=al.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("arraylist to int array"+Arrays.toString(array2)+"size is "+array2.length);
    }

}
