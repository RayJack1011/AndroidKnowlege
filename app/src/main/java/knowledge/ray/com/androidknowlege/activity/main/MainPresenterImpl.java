package knowledge.ray.com.androidknowlege.activity.main;

/**
 * Created by MVPHelper on 2016/11/08
 */
 
public class MainPresenterImpl implements MainContract.Presenter {
 
    private MainContract.Viewes mView;
 
    @Override
    public void checkVersion(final String currentVersion) {

//        Retrofit retrofit = new Retrofit.Builder()
////                .baseUrl(Constant.BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .build();
//        AppVersionService movieService = retrofit.create(AppVersionService.class);
//
//        movieService.getVersion()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<BaseResponse<VersionBean>>() {
//                    @Override
//                    public void onStart() {
//                        mView.showProgressDialog();
//                    }
//
//                    @Override
//                    public void onCompleted() {
//                        mView.DissProgressDialog();
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        mView.DissProgressDialog();
//                        mView.ShowToast("请求出错");
//                    }
//
//                    @Override
//                    public void onNext(BaseResponse<VersionBean> versionBeanBaseResponse) {
//                        if (Integer.valueOf(currentVersion.replace(".", "")) < Integer.valueOf(versionBeanBaseResponse.getData().getCode().replace(".", ""))) {
//                            // mView.showUpdateDialog(versionBean);
//                            //这里表示发现新版本
//                            mView.ShowToast("发现最新版本");
//                        } else {
//                            //表示这就是最新版本
//                            mView.ShowToast("已经是最新版本");
//                        }
//                    }
//                });
    }

    @Override
    public void attachView(MainContract.Viewes view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }
 
}