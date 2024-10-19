public class Calculator {
    public double sum(double a, double b){
        return a+b;
    }
    public double difference(double a, double b){
        return a-b;
    }
    public double product (double a, double b){
        return a*b;
    }
    public double fraction (double a, double b){
        if (b==0){
            throw new Exeption("Cannot be divided by zero");
        }
        return a/b;
    }
}

