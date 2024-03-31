package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamInterviewQuestions {

    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(1, 10000));
        emps.add(new Employee(2, 20000));
        emps.add(new Employee(3, 30000));
        emps.add(new Employee(4, 40000));
        emps.add(new Employee(5, 50000));
        emps.add(new Employee(6, 60000));
        emps.add(new Employee(7, 70000));
        emps.add(new Employee(8, 80000));

        //1a. Sort the employees based on salaries in descending order.
        List<Employee> sortedListDesc = emps.stream().sorted((obj1, obj2) -> obj2.salary - obj1.salary).toList();
        System.out.println(sortedListDesc);

        //1b: Get top 3 salaries employees.
        List<Employee> top3 = emps.stream().sorted((obj1, obj2) -> obj2.salary - obj1.salary).limit(3).toList();
        System.out.println(top3);

        //1c: Get all employees who have salaries less than 3th highest salary.
        List<Employee> skipTop3 = emps.stream().sorted((obj1, obj2) -> obj2.salary - obj1.salary).skip(3).toList();
        System.out.println(skipTop3);

        //2: Find the sum of all elements in the given array using Java 8 Stream API.
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.stream(arr).sum());
    }

}
