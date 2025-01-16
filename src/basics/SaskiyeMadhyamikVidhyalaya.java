package basics;

public class SaskiyeMadhyamikVidhyalaya  implements School{



    @Override
    public void feesStructure() {
        System.out.println("26000 in 6 month");
    }

    @Override
    public void staffDetails(String name, int age) {
        System.out.println("name is : " + name + " and age is : " + age+ " .");
    }
}
