
package java.point;

public class JavaPoint {

   
    public static void main(String[] args) {
        outer :for (int i=0; i<3;i++)
        {
            System.out.println("pass" + i+ ":");
            inner : for(int j=0;j<100;j++)
            {
                if(j==10)break outer;
                if(j%2==0)continue;
                System.out.println(j +" ");
            }
            System.out.println("tt");
        }
        System.out.println("dd");
    }
    
}
