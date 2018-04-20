package com.company.exam.sbl;

public class Problem2_solv {
    public static void main(String args[]) {
        def:
        {
            int x = 0;
            do {
                x++;
                if (x == 5) {
                    x++;
                    break def;
                }
                if (x == 2){
                    x++;
                }
                System.out.println(x);
            } while (x < 10);
        }

        { // block without label
            System.out.println("Test");
        }

        test:
        { // block with label
            System.out.println("Test2");
        }

/*        test3 : { // block with label
            break test;
            System.out.println("Test3");
        }*/

        // comment : this Blocks limit the scope of any variables declared within them; e.g.


        int y = 20;
        a:
        {
            y = 21;
            b:
            {
                y = 22;
                c:
                {
                    y = 23;
                    System.out.println(y);
                }
                System.out.println(y);
            }
            System.out.println(y);
        }
        System.out.println(y);
    }
}
