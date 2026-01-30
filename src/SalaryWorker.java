public class SalaryWorker extends Worker{
    double annualSalary;

    @Override
    public String toString() {
        return "SalaryWorker{" +
                super.toString() +
                "Annual Salary: " + annualSalary +
                '}';
    }

    public SalaryWorker(String id, String firstName, String lastName, String title, int yearOfBirth, double annualSalary) {
        super(id, firstName, lastName, title, yearOfBirth, annualSalary);
        this.annualSalary = annualSalary;
    }

//    public SalaryWorker(Worker worker, double annualSalary){
//        super(worker.getId(), worker.getFirstName(), worker.getLastName(), worker.getTitle(), worker.getYearOfBirth(), worker.hoursWorked, worker.hourlyPayRate);{
//            this.annualSalary = annualSalary;
//        }
//    }

    @Override
    public double calculateWeeklyPay(double hoursWorked){
        double weeklyPay = annualSalary / 52;
        return weeklyPay;
    }
    @Override
    public void displayWeeklyPay(double hoursWorked){
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        System.out.println(weeklyPay + "(1/52)");

    }
    @Override
    public String toCSVDataString() {
        return super.toCSVDataString() + ", " + annualSalary;
    }

    @Override
    public String toXmlDataString() {
        return "<SalaryWorker>" +
                super.toXmlDataString() +
                "<annualSalary>" + annualSalary + "</annualSalary>" +
                "</SalaryWorker>";
    }

    @Override
    public String toJSONDataString() {
        return "{" +
                super.toJSONDataString() +
                "\" annualSalary=\":\"" + annualSalary +
                "}";
    }
}
