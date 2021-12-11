package code._4_student_effort;

public class FooBarQix {
    public static String compute(int n) {
        String str = "";
        for(int i = 1; i <= n; i++)
        {
            if(i % 3 == 0)
                str += "Foo";
            if(i % 5 == 0)
                str += "Bar";
            if(i % 7 == 0)
                str += "Qix";
            int r=0;
            int aux1=i;
            while(aux1 > 0){
                r = r*10 + aux1%10;
                aux1 /= 10;
            }
            int aux = r;
            while(aux > 0){
                if(aux % 10 == 3)
                    str += "Foo";
                else if(aux % 10 == 5)
                    str += "Bar";
                else if(aux % 10 == 7)
                    str += "Qix";
                aux /= 10;
            }
            str += i + "\n";

        }



        return str;
    }

    public static void main(String[] args) {

        System.out.println(compute(53));
    }
}