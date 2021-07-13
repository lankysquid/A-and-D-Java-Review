package edu.ecrchs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pojo pojo = new Pojo(4, 6);


        BasicClass basicClass = new BasicClass(5);
        basicClass.getNum();
        basicClass.setNum(4);

        BasicClass.getCounter();

        BasicInherit basicInherit = new BasicInherit(4, 5);
        basicInherit.setBasicClass(basicClass);

        basicInherit = new BasicInherit(pojo.getOne(),pojo.getTwo());
        basicInherit.setBasicClass(new BasicClass(6));

        BasicClass.getCounter();
    }

}
