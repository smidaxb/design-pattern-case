package main.action.template.code;

/**
 * 豆浆抽象类
 * CREATED BY smida
 * Date: 2019/11/24
 */
public abstract class SoyaMilk {
    //模板方法可以做成final，防止子类覆盖
    final void make(){
        select();
        add();
        soak();
        beat();
    }
    //选材
    private void select() {
        System.out.println("第一步：选择新鲜豆子");
    }
    //添加配料，抽象
    abstract void add();
    //浸泡
    private void soak() {
        System.out.println("第三步：黄豆和配料浸泡");
    }
    //打磨
    private void beat() {
        System.out.println("第四部：打磨豆浆");
    }
}
