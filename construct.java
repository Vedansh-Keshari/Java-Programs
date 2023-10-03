// https://www.interviewbit.com/java-interview-questions/
// 50th Question and Solution

class Main {
    public static void main(String args[]) {
        Scaler s = new Scaler(5);
    }
}
class InterviewBit{
    InterviewBit(){
        System.out.println(" Welcome to InterviewBit ");
    }
}
class Scaler extends InterviewBit{
    Scaler(){
        super();
        System.out.println(" Welcome to Scaler Academy ");
    }
    Scaler(int x){
        this();
        System.out.println(" Welcome to Scaler Academy 2");
    }
}

// The above code will throw the compilation error. It is because the super() is used to call the parent class constructor. But there is the condition that super() must be the first statement in the block. Now in this case, if we replace this() with super() then also it will throw the compilation error. Because this() also has to be the first statement in the block. So in conclusion, we can say that we cannot use this() and super() keywords in the same block.