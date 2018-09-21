package io.inlearn.fcmdevicetoken;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static android.content.ContentValues.TAG;

/**
 * Created by mirmahfuz on 20/9/18.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService{
    @Override
    public void onTokenRefresh() {
        //Get updated InstanceID token

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"Refreshed token: " + refreshedToken);

        //sendRegistrationToServer(refreshedToken);

    }
}
