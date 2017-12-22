package ssc.smooch.com.testsmooch;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import io.smooch.core.Settings;
import io.smooch.core.Smooch;
import io.smooch.core.SmoochCallback;
import io.smooch.ui.ConversationActivity;

public class SmoochActivity extends AppCompatActivity {

    String TAG = SmoochActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smooch);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Settings settings = new Settings("58be3d43e995984500a274b2");
        Smooch.init(this.getApplication(), settings, new SmoochCallback() {
            @Override
            public void run(Response response) {
                // Handle init result
                Log.e(TAG, "run: Response from Smooch.init(): "+response.toString());
                Log.e(TAG, "run: Response from Smooch.init() - Data: "+response.getData());
                Log.e(TAG, "run: Response from Smooch.init() - Status: "+response.getStatus());
                Log.e(TAG, "run: Response from Smooch.init() - Error: "+response.getError());
            }
        });
        Smooch.login("439", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6ImFwcF81OGJlNDdhOGY0ZjdiYTI3MDBiMGQ3OGUifQ.eyJzY29wZSI6ImFwcFVzZXIiLCJ1c2VySWQiOiI0MzkifQ.T0xgD4bSbsojW_R9IDp7EzWJZ3cs4PvJlg4vdgVPuEs", new SmoochCallback() {
            @Override
            public void run(Response response) {
                // Your code after login is complete
                Log.e(TAG, "run: Response from Smooch.login() - Data: "+response.getData());
                Log.e(TAG, "run: Response from Smooch.login() - Status: "+response.getStatus());
                Log.e(TAG, "run: Response from Smooch.login() - Error: "+response.getError());
            }
        });
        ConversationActivity.show(this);
    }

}
