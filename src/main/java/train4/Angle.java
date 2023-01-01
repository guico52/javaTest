package train4;

public class Angle {
    public void Judge(int a, int b, int c){
        if(a+b>c && a+c>b && b+c>a){
            if(a==b && b==c){
                System.out.println("该三角形为等边三角形");
            }else if(a==b || b==c || a==c){
                System.out.println("该三角形为等腰三角形");
            }else{
                System.out.println("该三角形为普通三角形");
            }
        }else{
            System.out.println("不能构成三角形");
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入三角形的三条边：");
        int a = new java.util.Scanner(System.in).nextInt();
        int b = new java.util.Scanner(System.in).nextInt();
        int c = new java.util.Scanner(System.in).nextInt();
        if(a<0 || b<0 || c<0 || a>200 || b>200 || c>200) {
            System.out.println("输入的边长不合法！");
        } else {
            System.out.println("三边能构成三角形");
            new Angle().Judge(a, b, c);
        }
    }
}
