package test1;

public class Test {
    public static void main(String[] args) {

        final double PI =3.14;

        final Student S =new Student("zhangsan",19);
        S.setAge(20);
        S.setName("Lisa");
        System.out.println(S.toString());

        final int[] ARR ={1,2,3,4,5};
        ARR[0]=10;

        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }

    }
}
