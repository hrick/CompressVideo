package br.com.oxxy.compressvideo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.concurrent.Future;

/**
 * Created by henrique.pereira on 08/08/2018.
 */

public class MainActivity extends Activity {
    private static final String TAG = "TranscoderActivity";
    private static final String FILE_PROVIDER_AUTHORITY = "net.ypresto.androidtranscoder.example.fileprovider";
    private static final int REQUEST_CODE_PICK = 1;
    private static final int PROGRESS_BAR_MAX = 1000;
    private Future<Void> mFuture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
