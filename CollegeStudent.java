public class CollegeStudent extends Student{
    protected String myMajor;
    protected int myYear;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year){
        super(name, age, gender, idNum, gpa);

        myMajor = major;
        myYear = year;
    }

    public String getMajor(){
        return myMajor;
    }

    public void setMajor(String major){
        this.myMajor = major;
    }

    public int getYear(){
        return myYear;
    }

    public void setYear(int year){
        this.myYear = year;
    }

    public String toString(){
        return myName + ", age:" + myAge + ", gender" + myGender + ", idNum" + myIdNum + ", gpa" + myGPA + ",major" + myMajor + ",year" + myYear;
    }
}
