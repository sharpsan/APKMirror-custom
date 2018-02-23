package cf.vojtechh.apkmirror.interfaces;


public interface AsyncResponse {

    void onProcessFinish(Integer themeColor);

    void skipDownloadWait(String downloadPageUrl);
}
