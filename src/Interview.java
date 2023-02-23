import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Interview {
    public static void main(String[] args){
        List<Shift> list  = new ArrayList<>();
        list.add(new Shift(1,2));
        list.add(new Shift(3,4));
        list.add(new Shift(5,6));
        list.add(new Shift(7,10));
        list.add(new Shift(10,21));

//        System.out.println(resort(list));

        int[][] a = {{1,2},{2,4},{-1,4}};
        Arrays.sort(a,(s1,s2)->s2[0]-s1[0]);
        System.out.println(a[0][0]);
//

//        List<Employee> res = new ArrayList<>();
//        res.add(new Employee(1,"e1",1000,101));
//        res.add(new Employee(2,"e2",1000,101));
//        res.add(new Employee(3,"e3",1000,102));
//        res.add(new Employee(4,"e4",1000,102));
//
//        Map<Integer,List<Employee>> map = res.stream()
//                .collect(Collectors.groupingBy(e->e.getManager_id(),Collectors.toList()));
//
//        for(int key: map.keySet()){
//            String names = map.get(key).stream()
//                    .map(e->e.getName())
//                    .collect(Collectors.joining(","));
//            System.out.println(key+","+names);
//        }





    }

    public static List<Shift> resort(List<Shift> list){
        List<Shift> res = new ArrayList<>();
        for(int i = 0;i<list.size();i++){
            Shift curr = list.get(i);
            if(res.size() == 0 || res.get(res.size()-1).getEnd() <curr.getStart()){
                res.add(curr);
            }else{
                res.get(res.size()-1).setEnd(Math.max(res.get(res.size()-1).getEnd(),curr.getEnd()));
            }
        }


        return res;
    }
}

class Shift{
    int start;
    int end;

    public Shift(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "{"
                 + start +
                ", " + end +
                '}';
    }
}

class Employee{
    int id;
    String name;
    int salary;
    int manager_id;

    public Employee(int id, String name, int salary, int manager_id) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.manager_id = manager_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }
}
