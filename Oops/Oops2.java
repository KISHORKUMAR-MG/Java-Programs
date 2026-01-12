class Car{
String brand;
String engineType;
int seats;
int tyres;
Car(String brand,String engineType,int seats,int tyres){
    this.brand=brand;
    this.engineType=engineType;
    this.seats=seats;
    this.tyres=tyres;
}
String getResult(){
    return this.brand+" "+this.engineType+" "+this.seats+" "+this.tyres;
}
}
public class Oops2{
    public static void main(String[]args){
        Car ferrari=new Car("Ferrari","Petrol",2,4);
System.out.print(ferrari.getResult());

    }
}
