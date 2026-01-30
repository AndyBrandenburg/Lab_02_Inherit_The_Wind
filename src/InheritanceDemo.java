import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        Worker andy = new Worker("000001", "Andy", "Brandenburg", "Mr.", 2007, 45);
        workers.add(andy);
        Worker austin = new Worker("000002", "Austin", "Smith", "Mr.", 2006, 35);
        workers.add(austin);
        Worker jane = new Worker("000003", "Jane", "Doe", "Mrs.", 2002, 40);
        workers.add(jane);


        ArrayList<SalaryWorker> salaryWorkers = new ArrayList<>();
        SalaryWorker joe = new SalaryWorker("000001", "Joe", "Burrow", "Mr.", 1996, 275000);
        salaryWorkers.add(joe);
        SalaryWorker jamarr = new SalaryWorker("000002", "Ja'Marr", "Chase", "Mr.", 2000, 161000);
        salaryWorkers.add(jamarr);
        SalaryWorker tee = new SalaryWorker("000003", "Tee", "Higgins", "Mr.", 1999, 115000);
        salaryWorkers.add(tee);


        int[] weeklyWorkHours = {40, 50, 40};
        System.out.printf("%-15s %-10s %-10s %-10s%n", "Worker", "Week 1", "Week 2", "Week 3");
        System.out.println("_______________________________________________________________");

        for (Worker worker : workers) {
            System.out.printf("%-15s", worker.getFullName());
            for (int hoursWorked : weeklyWorkHours) {
                double weeklyPay = worker.calculateWeeklyPay(hoursWorked);
                System.out.printf(" $%-9.2f", weeklyPay);
            }
            System.out.printf("%n");
        }


        System.out.println();
        System.out.printf("%-15s %-10s %-10s %-10s%n", "Salary Worker", "Week 1", "Week 2", "Week 3");
        System.out.println("_______________________________________________________________");

        for (SalaryWorker salaryWorker : salaryWorkers) {
            System.out.printf("%-15s", salaryWorker.getFullName());
            for (int hoursWorked : weeklyWorkHours) {
                double weeklyPay = salaryWorker.calculateWeeklyPay(hoursWorked);
                ;
                System.out.printf(" $%-9.2f", weeklyPay);
            }
            System.out.printf("%n");
        }


    }
}
