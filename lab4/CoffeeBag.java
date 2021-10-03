package lab4;

public class CoffeeBag {
    final double TAX=0.0725;
    int numOfBag;
    double bagWeght;
     final double price=5.99;
    public CoffeeBag(int numOfBag,double bagWeght){
        this.numOfBag=numOfBag;
        this.bagWeght=bagWeght;



    }
    public double totalP(){
        double result= bagWeght*numOfBag*price;
        return result;
    }
    public double totalPriceWithTax(){
        double result=totalP()+totalP()*TAX;
        return  result;
    }
}
