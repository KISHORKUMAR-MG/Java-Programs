class Car{
String brand;
String engineType;
int seats;
int tyres;
String getResult(){
    return brand+" "+engineType+" "+seats+" "+tyres;
}
}
public class Oops1{
    public static void main(String[]args){
        Car ferrari=new Car();
ferrari.brand="Ferrari";
ferrari.engineType="Petrol";
ferrari.seats=2;
ferrari.tyres=4;
String result=ferrari.getResult();
System.out.print(result);

    }
}
