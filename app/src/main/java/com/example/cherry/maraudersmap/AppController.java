package com.example.cherry.maraudersmap; /**
 * Created by Cherry on 4/10/2017.
 */
import android.app.Application;
import android.text.TextUtils;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
public class AppController extends Application {

    public static final String TAG = AppController.class.getSimpleName();

        private RequestQueue mRequestQueue;

       private static AppController mInstance;


public void Start() {
mInstance.Start();
mInstance = this;
}

    public static synchronized AppController getInstance() {
return mInstance;
}

        public RequestQueue getRequestQueue() {
if (mRequestQueue == null) {
mRequestQueue = Volley.newRequestQueue(getApplicationContext());
}

return mRequestQueue;
}

       public <T> void addToRequestQueue(Request<T> req, String tag) {
req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
getRequestQueue().add(req);
}

        public <T> void addToRequestQueue(Request<T> req) {
req.setTag(TAG);
getRequestQueue().add(req);
}

        public void cancelPendingRequests(Object tag) {
if (mRequestQueue != null) {
mRequestQueue.cancelAll(tag);
}
}

}
