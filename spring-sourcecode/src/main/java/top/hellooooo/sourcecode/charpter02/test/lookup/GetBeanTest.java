package top.hellooooo.sourcecode.charpter02.test.lookup;

import top.hellooooo.sourcecode.charpter02.bean.User;

public abstract class GetBeanTest {

     public void showMe(){
         this.getBean().showMe();
     }
     public abstract User getBean();
}
