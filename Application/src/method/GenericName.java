package method;

/** 输出数据所属类的名称 **/
public class GenericName {
    public  <T> String outputClassName(T instance) {
        return instance.getClass().getName();
    }
}
