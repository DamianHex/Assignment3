package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    //find and return duplicates
    public static void findDups(List<Integer> inputList){
       Set<Integer> items = new HashSet<>();
        System.out.println("Find Duplicates: " + inputList.stream().filter(n -> !items.add(n)).collect(Collectors.toSet()));
    }

    // remove duplicates
    public static void removeDups(List<Integer> inputList){
        List<Integer> outputList = new ArrayList<>();
        outputList = inputList.stream().distinct().collect(Collectors.toList());
        System.out.println("Remove duplicates: " + outputList);
    }

    // find max of the list
    public static void findMax(List<Integer> inputlist2){

        Integer maxNumber = inputlist2.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max Number of " + inputlist2 + ": " + maxNumber);
    }

    //find max and min of list
    public static void findMaxAndMin(List<Integer> inputList3){
        Integer maxNumber = inputList3.stream().max(Comparator.comparing(Integer::valueOf)).get();
        Integer minNumber = inputList3.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max Number of " + inputList3 + ": " + maxNumber + "\n" +
                "Min Number of " + inputList3 + ": " + minNumber);
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(5);
        inputList.add(13);
        inputList.add(4);
        inputList.add(21);
        inputList.add(13);
        inputList.add(27);
        inputList.add(2);
        inputList.add(59);
        inputList.add(59);
        inputList.add(34);

        List<Integer> inputList2 = new ArrayList<>();
        inputList2.add(3);
        inputList2.add(90);
        inputList2.add(350);
        inputList2.add(5);

        List<Integer> inputList3 = Arrays.asList(6,8,3,5,1,9);

        findDups(inputList);
        removeDups(inputList);
        findMax(inputList2);
        findMaxAndMin(inputList3);
    }
}
