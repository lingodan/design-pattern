package com.lingodan.study.designpattern.structural.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO",2000);
        Employee headSales = new Employee("Robert","Head Sales",2000);
        Employee headMarketing = new Employee("Michel","Head Marketing",2000);

        Employee clerk1 = new Employee("Laura","Marketing",1000);
        Employee clerk2 = new Employee("Bob","Marketing",1000);

        Employee salesExecutive1 = new Employee("Richard","Sales",1000);
        Employee salesExecutive2 = new Employee("Rob","Sales",1000);

        CEO.add(headMarketing);
        CEO.add(headSales);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        System.out.println(CEO);

        for (Employee headEmployee:CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee:headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }

        System.out.println("---------------------------");

        printStaff(CEO);

    }

    private static void printStaff(Employee employee){
        System.out.println(employee);
        if(employee.getSubordinates().size() >1){
            employee.getSubordinates().forEach(one->printStaff(one));
        }
    }

}
