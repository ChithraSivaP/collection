import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private String address;
    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
    }
    /**
     * InnerEmployee
     */
   



    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    // inserted..............................

            // System.out.println("enter id");
            // int ids = scan1.nextInt();
            // System.out.println("enter name");
            // String names = scan2.nextLine();
            // System.out.println("enter address");
            // String address = scan2.nextLine();
            // list.add(new Employee(ids, names, address));
            // System.out.println(list);

//  // ..............................deleting
//            System.out.println("enter emplye id");
//            int empid = scan1.nextInt();
//            System.out.println(empid);

//         Employee recordDel = null;
//         for (Employee ll : list) {
//             if (ll.getId() == empid) {
//                 recordDel = ll;
//             }
//         }
//         if (recordDel == null) {
//             System.out.println("Invalid record Id");
//         }
//         else {
//             list.remove(recordDel);
//             System.out.println(
//                 "Successfully removed record from the list");
//                 System.out.println(list);
//         }


        // .......updating
        boolean found1 = false;
        System.out.println("enter emplye id");
        int empid1 = scan1.nextInt();
        System.out.println(empid1);

        ListIterator < Employee > li = list.listIterator();

        while (li.hasNext()) {
            Employee e = li.next();
            if (e.getId() == empid1) {
                System.out.print("Enter new Name : ");
                String ename = scan2.nextLine();
                System.out.print("Enter new address : ");
                String addresse = scan2.nextLine();
                li.set(new Employee(empid1, ename, addresse));
                found1 = true;
               
            }
        }


        System.out.println(list);
        if (list.isEmpty()) {
 
          
            System.out.println("The list has no records\n");
        }
      System.out.println("display");
      list.forEach(s-> System.out.println("the list are " +s));



      System.out.println("enter emplye id");
       int empid2 = scan1.nextInt();
      System.out.println(empid2);
      for (Employee l : list) {
 
        // Checking record by id Number.
        if (l.getId() == empid2) {
           System.out.println(l);
        }
    }
    
    }  
        }
    
    
        
    
    
    
   