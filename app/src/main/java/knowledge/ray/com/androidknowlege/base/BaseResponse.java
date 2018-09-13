package knowledge.ray.com.androidknowlege.base;

/**
 * Created by wangya3 on 2018/9/7.
 * 服务器中标准返回格式
 */

public class BaseResponse<T> {
    public String message;
    public int statue;
    public T Data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatue() {
        return statue;
    }

    public void setStatue(int statue) {
        this.statue = statue;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }
}
