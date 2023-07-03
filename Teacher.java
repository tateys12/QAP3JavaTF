public class Teacher extends Person{
    protected String mySubject;
    protected double mySalary;

    public Teacher(String name, int age, String gender, String subject, double salary){
        super(name, age, gender);

        mySubject = subject;
        mySalary = salary;
    }

    public String getSubject(){
        return mySubject;
    }

    public void setSubject(String subject){
        this.mySubject = subject;
    }

    public double getSalary(){
        return mySalary;
    }

    public void setSalary(double salary){
        this.mySalary = salary;
    }

    public String toString(){
        return myName + ", age:" + myAge + ", gender" + myGender + ", subject" + mySubject + ", salary" + mySalary;
    }
}
