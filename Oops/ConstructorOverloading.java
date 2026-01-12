class Box{
    int length;
    int width;
    Box(){
        length=1;
        width=1;
    }
    Box(int l){
        length=l;
        width=1;
    }
    Box(int l,int w){
        length=l;
        width=w;
    }
    void result(){
        System.out.println("Length "+length+" "+"Width "+width);
    }
}
public class ConstructorOverloading{
    public static void main(String[]args){
        Box b1=new Box();
        b1.result();
        Box b2=new Box(5);
        b2.result();
        Box b3=new Box(4,5);
        b3.result();
    }
}
