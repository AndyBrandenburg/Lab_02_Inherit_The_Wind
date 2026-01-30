public class Worker extends Person{

    double hourlyPayRate;


    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                "Hourly Pay Rate: " + hourlyPayRate +
                '}';
    }

    public Worker(String id, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate) {
        super(id, firstName, lastName, title, yearOfBirth);
        this.hourlyPayRate = hourlyPayRate;
    }

//    public Worker(Person person, double hourlyPayRate, double hoursWorked) {
//        super(person.getId(), person.getFirstName(), person.getLastName(), person.getTitle(), person.getYearOfBirth());
//        this.hourlyPayRate = hourlyPayRate;
//        this.hoursWorked = hoursWorked;
//
//    }

    public double calculateWeeklyPay(double hoursWorked){
        double totalPay = hoursWorked * hourlyPayRate;
        double overtimeHours = hoursWorked - 40;
        double totalOvertimePay = (40 * hourlyPayRate) + (overtimeHours * hourlyPayRate * 1.5);
        if (hoursWorked > 40){
            return totalOvertimePay;
        }
        else {
            return totalPay;
        }
    }

    public void displayWeeklyPay(double hoursWorked){
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        System.out.println("Your weekly pay is $" + weeklyPay);

//        System.out.println("You have worked " + hoursWorked + " hours this week.");
//        System.out.println("Your hourly pay rate is $" + hourlyPayRate + " an hour.");
//        System.out.println("Your total pay for the week is $" + totalPay);




    }
    @Override
    public String toCSVDataString() {
        return super.toCSVDataString() + ", " + hourlyPayRate;
    }

    @Override
    public String toXmlDataString() {
        return "<Worker>" +
                super.toXmlDataString() +
                "<hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate>" +
                "</Worker>";
    }

    @Override
    public String toJSONDataString() {
        return "{" +
                super.toJSONDataString() +
                "\" hourlyPayRate=\":\"" + hourlyPayRate +
                "}";
    }
}
