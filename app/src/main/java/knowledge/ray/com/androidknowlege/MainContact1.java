package knowledge.ray.com.androidknowlege;

import knowledge.ray.com.androidknowlege.activity.main.MainContract;
import knowledge.ray.com.androidknowlege.base.BaseView;
import knowledge.ray.com.androidknowlege.base.Precenter;

/**
 * Created by wangya3 on 2018/9/10.
 */

public class MainContact1 {

    public interface Viewes extends BaseView {
        //View效果就是展示下载进度框
//        void showUpdateDialog(VersionBean bean);

        void showProgressDialog();

        void DissProgressDialog();

        void ShowToast(String message);
    }

    public interface Presenter extends Precenter<MainContract.Viewes> {
        //一般在首页我们会进行一个版本的更新（功能）
    }
}
