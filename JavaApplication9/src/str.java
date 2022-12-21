
import static sun.misc.Version.print;

class Base {
     public void print()
    {
        System.out.println("base");
    }
}
class Drive extends Base {
    @Override
    public void print()
    {
        System.out.println("dry");
    }
}
class Main {
    public static void Doprint ( Base x){
        double name = 0.;
print();
}
public static void main(String [] args)
{
Base x=new Base();
Base y=new drive();
Drived z=new drived();
Doprint(x);
Doprint(y);

}
}
