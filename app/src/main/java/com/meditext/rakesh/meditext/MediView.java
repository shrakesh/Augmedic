package com.meditext.rakesh.meditext;

/**
 * Created by rakesh on 2/18/2017.
 */
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MediView extends Activity {

    WebView  wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mediview);

        // get the scanned word from last class
        Bundle extras = getIntent().getExtras();
        String mediname = extras.getString("value");

        wv = (WebView)findViewById(R.id.iMediView);
        wv.setWebViewClient(new MyBrowser());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("http://www.tabletwise.com/combiflam-tablet");
      //  wv.loadUrl("http://www.facebook.com/"+mediname);
    }

    private class MyBrowser extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
