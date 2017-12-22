package ssc.smooch.com.testsmooch;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import io.smooch.core.Conversation;
import io.smooch.core.Settings;
import io.smooch.core.Smooch;
import io.smooch.core.SmoochCallback;
import io.smooch.ui.ConversationActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Okkami Concierge
        final String wegUserId = "439";
        final String okkamiConAppId = "58be3d43e995984500a274b2";

        final String okkamiConJwt439 = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6ImFwcF81OGJlNDdhOGY0ZjdiYTI3MDBiMGQ3OGUifQ.eyJzY29wZSI6ImFwcFVzZXIiLCJ1c2VySWQiOiI0MzkifQ.T0xgD4bSbsojW_R9IDp7EzWJZ3cs4PvJlg4vdgVPuEs";
        String secretGardenConJwt439 = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6ImFwcF81OTRiODk2OGVkYWU0OTI3MDA1ZWFiNWMifQ.eyJzY29wZSI6ImFwcFVzZXIiLCJ1c2VySWQiOiI0MzkifQ.C7tZF_Aql8hTLnhDYciyipcj7dZMdbirodQaBIkA2fA";

        // Secret Garden
        final String ypeUserId = "1011";
        String secretGardenAppId = "594b8968a6f1183300a4f20b";

        final String okkamiConJwt1011 = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6ImFwcF81OGJlNDdhOGY0ZjdiYTI3MDBiMGQ3OGUifQ.eyJzY29wZSI6ImFwcFVzZXIiLCJ1c2VySWQiOiIxMDExIn0.Ly_xEfC1APHSWLFDddfgY9-eZhenuwBgbSBSRxpLuXk";
        String secretGardenConJwt1011 = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6ImFwcF81OTRiODk2OGVkYWU0OTI3MDA1ZWFiNWMifQ.eyJzY29wZSI6ImFwcFVzZXIiLCJ1c2VySWQiOiIxMDExIn0.3nDJzOPiA7nQKQsEeJvp-N1YTFbIA9BkR1kpcUT_wVM";

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "onClick btn1: ");
//                initSmooch("439", "58be3d43e995984500a274b2", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6ImFwcF81OGJlNDdhOGY0ZjdiYTI3MDBiMGQ3OGUifQ.eyJzY29wZSI6ImFwcFVzZXIiLCJ1c2VySWQiOiI0MzkifQ.T0xgD4bSbsojW_R9IDp7EzWJZ3cs4PvJlg4vdgVPuEs");
//                ConversationActivity.show(MainActivity.this);
//                openSmooch();
//                Smooch.destroy();
//                Intent intent = new Intent(MainActivity.this, SmoochActivity.class);
//                startActivity(intent);
//                Smooch.destroy();
//                initSmooch(wegUserId, okkamiConAppId, okkamiConJwt439);
                Smooch.login(wegUserId, okkamiConJwt439, new SmoochCallback() {
                    @Override
                    public void run(Response response) {
                        // Your code after login is complete
                        Log.e(TAG, "run: Response from Smooch.login() - Data: "+response.getData());
                        Log.e(TAG, "run: Response from Smooch.login() - Status: "+response.getStatus());
                        Log.e(TAG, "run: Response from Smooch.login() - Error: "+response.getError());
                    }
                });
                ConversationActivity.show(MainActivity.this);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Smooch.destroy();
//                Log.e(TAG, "onClick: btn2");
//                initSmooch("1011", "594b8968a6f1183300a4f20b", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6ImFwcF81OTRiODk2OGVkYWU0OTI3MDA1ZWFiNWMifQ.eyJzY29wZSI6ImFwcFVzZXIiLCJ1c2VySWQiOiIxMDExIn0.3nDJzOPiA7nQKQsEeJvp-N1YTFbIA9BkR1kpcUT_wVM");
//                ConversationActivity.show(MainActivity.this);
                Smooch.login(ypeUserId, okkamiConJwt1011, new SmoochCallback() {
                    @Override
                    public void run(Response response) {
                        // Your code after login is complete
                        Log.e(TAG, "run: Response from Smooch.login() - Data: "+response.getData());
                        Log.e(TAG, "run: Response from Smooch.login() - Status: "+response.getStatus());
                        Log.e(TAG, "run: Response from Smooch.login() - Error: "+response.getError());
                    }
                });
                ConversationActivity.show(MainActivity.this);
            }
        });
        Smooch.destroy();
        initSmooch(ypeUserId, okkamiConAppId, okkamiConJwt1011);
//        initSmooch("1011", "594b8968a6f1183300a4f20b", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6ImFwcF81OTRiODk2OGVkYWU0OTI3MDA1ZWFiNWMifQ.eyJzY29wZSI6ImFwcFVzZXIiLCJ1c2VySWQiOiIxMDExIn0.3nDJzOPiA7nQKQsEeJvp-N1YTFbIA9BkR1kpcUT_wVM");
        ConversationActivity.show(MainActivity.this);
    }

    private void openSmooch() {
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void initSmooch(String userId, String appId, String smoochJwt) {
        Smooch.destroy();
        Log.e(TAG, "initSmooch: appId: "+appId);
        Settings settings = new Settings(appId);
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
        if (TextUtils.isEmpty(userId)) {
            Log.e(TAG, "initSmooch: userId is empty.");
        }
        Log.e(TAG, "initSmooch: with userId: "+userId);
        Smooch.login(userId, smoochJwt, new SmoochCallback() {
            @Override
            public void run(Response response) {
                // Your code after login is complete
                Log.e(TAG, "run: Response from Smooch.login() - Data: "+response.getData());
                Log.e(TAG, "run: Response from Smooch.login() - Status: "+response.getStatus());
                Log.e(TAG, "run: Response from Smooch.login() - Error: "+response.getError());
            }
        });
    }
}
