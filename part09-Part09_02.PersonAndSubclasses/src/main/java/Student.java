public class Student extends Person{

    private int creditScore;

    public Student(String name, String address){
        super(name, address);
        this.creditScore = 0;
    }

    public int credits(){
        return creditScore;
    }

    public void study(){
        creditScore++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + creditScore;
    }

    

}
