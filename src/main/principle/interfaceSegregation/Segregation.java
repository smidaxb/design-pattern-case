package main.principle.interfaceSegregation;

/**
 * 接口隔离原则--接口功能最小化
 * CREATED BY smida
 * Date: 2019/10/29
 */
public class Segregation {
}
//接口
interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1 {
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    public void operation2() {
        System.out.println("B 实现了 operation2");
    }
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
    public void operation4() {
        System.out.println("B 实现了 operation4");
    }
    public void operation5() {
        System.out.println("B 实现了 operation5");
    }
}

class D implements Interface1 {
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    public void operation2() {
        System.out.println("D 实现了 operation2");
    }
    public void operation3() {
        System.out.println("D 实现了 operation3");
    }
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

class A { //A 类通过接口Interface1 依赖(使用) B类，但是只会用到1,2,3方法
    private Interface1 i;
    public void depend1() {
        i.operation1();
    }
    public void depend2() {
        i.operation2();
    }
    public void depend3() {
        i.operation3();
    }
}

class C { //C 类通过接口Interface1 依赖(使用) D类，但是只会用到1,4,5方法
    private Interface1 i;
    public void depend1() {
        i.operation1();
    }

    public void depend4() {
        i.operation4();
    }

    public void depend5() {
        i.operation5();
    }
}
