import java.util.*;

//PROGRAM E-D
//create employee department classes as follows then create employeeTest class add main method insert dummies and give me employee starts with 'p'
class employee{
    int empId;
    String name;
    double salary;
    department department;
    employee(int eid,String n,double s,department d){
        this.empId = eid;
        this.name = n;
        this.salary = s;
        this.department = d;
    }

    public department getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}

class department{
    private int depId;
    private String name;
    private int empId;

    public department(int depId, String name, int empId) {
        this.depId = depId;
        this.name = name;
        this.empId = empId;
    }

    public int getDepId() {
        return depId;
    }


    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }
    public void setDepId(int depId) {
        this.depId = depId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "department{" +
                "depId=" + depId +
                ", name='" + name + '\'' +
                ", empId=" + empId +
                '}';
    }
}

class employeeTest{
    public static void main(String[] args) {
        List<employee> e = new ArrayList<>();
        e.add(new employee(101,"qwert",182323,new department(1,"Managing",101)));
        e.add(new employee(104,"asdfg",1823,new department(4,"Computing",102)));
        e.add(new employee(103,"zxcvb",182,new department(3,"General",103)));
        e.add(new employee(102,"werty",18,new department(2,"GIT",104)));
        e.add(new employee(105,"sdfgh",1,new department(1,"Managing",105)));
        //System.out.println(e); <this is interesting>
        e.stream().filter(emp->emp.getName().startsWith("a")).forEach(System.out::println);
        //.sorted.Compartor.comparing
        e.stream().sorted(Comparator.comparing(employee::getEmpId)).forEach(System.out::println);
        e.stream().sorted(Comparator.comparing(emp->emp.getEmpId())).forEach(System.out::println);

        //optional code just copy pasting sir's
//        Optional<employee> emplist = emplist.stream().filter(emp->emp.getName().equals("qwert")).findAny();
//        if(emplist.isPresent()){
//            System.out.println("employee name start with this name is present "+emplist.get());
//        }
//        else{
//            System.out.println("employee not present");
//        }

    }
}