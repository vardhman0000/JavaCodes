package Collection_Interfaces;

import java.util.*;

public class Test {
    public void cq1(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--)
        {
            if (list.get(i) < list.get(i - 1))
            {
                int n = list.get(i);
                list.remove(i);
                list.add(0, n);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,6,1,8));
        Test test = new Test();
        test.cq1(list); // Expected output: [1, 2, 3, 5, 6, 8]



        ArrayList<String> cq1 = new ArrayList<String>();
        cq1.add ("Code");
        cq1.add ("Quotient");
        cq1.add ("Gopal");
        ArrayList<String> cq2 = new ArrayList<String>(cq1);
        ArrayList<String> cq3 = cq1;
        cq1.add ("Arun");
        System.out.println(cq1);
        System.out.println(cq2);
        System.out.println(cq3);
    }
}
