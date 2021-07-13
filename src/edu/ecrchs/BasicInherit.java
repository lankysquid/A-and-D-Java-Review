package edu.ecrchs;

public class BasicInherit extends Pojo {

    private BasicClass basicClass;

    public BasicInherit (int one, int two) {
        super(one, two);
        basicClass = new BasicClass(5);
    }

    public BasicClass getBasicClass() {
        return basicClass;
    }

    public void setBasicClass(BasicClass basicClass) {
        this.basicClass = basicClass;
    }
}
