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

    static List<Employee> empList = new ArrayList<Employee>() {{
        add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        add(new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0));
    }};

    public static void countByDept (List<Employee> empList){

        System.out.println("Count By Department");
        System.out.println("------------------------");
        Map<String, Long> counting=
                empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        counting.forEach((department, count) -> System.out.println(department + " " + count));
    }

    public static void empNameByDept(List<Employee> empList){
        System.out.println("Employee Names by Department");
        System.out.println("------------------------");

        Map<String, List<Employee>> employeeListByDepartment=
                empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        Set<Map.Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();

        for (Map.Entry<String, List<Employee>> entry : entrySet)
        {

            System.out.println("Employees In "+entry.getKey() + " : ");



            List<Employee> list = entry.getValue();

            for (Employee e : list)
            {
                System.out.println(e.getName());
            }
        }
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
        countByDept(empList);
        empNameByDept(empList);


    }
}
