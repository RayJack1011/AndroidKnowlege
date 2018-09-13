package knowledge.ray.com.androidknowlege.base;

/**
 * Created by wangya3 on 2018/9/7.
 */

public interface Precenter<T extends BaseView> {
    void attachView(T view);
    void detachView();
}
