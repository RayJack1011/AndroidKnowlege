package knowledge.ray.com.androidknowlege.activity.main;


import knowledge.ray.com.androidknowlege.base.Precenter;
import knowledge.ray.com.androidknowlege.base.BaseView;

/**
 * Created by wangjitao on 2016/11/8 0008.
 * 首页逻辑处理
 */
public class MainContract {
 
    public interface Viewes extends BaseView {
        //View效果就是展示下载进度框
//        void showUpdateDialog(VersionBean bean);
 
        void showProgressDialog();
 
        void DissProgressDialog();
 
        void ShowToast(String message);
    }
 
    public interface Presenter extends Precenter<Viewes> {
        //一般在首页我们会进行一个版本的更新（功能）
        void checkVersion(String currentVersion);
    }
 
}