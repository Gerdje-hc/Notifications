package com.apps.gerdjes.notifications;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static android.R.attr.handle;
import static android.R.attr.id;
import static com.apps.gerdjes.notifications.R.id.drawer_layout;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    private Button btnMaxPriorityNotification;
    private Button btnHighPriorityNotification;
    private Button btnLowPriorityNotification;
    private Button btnMinPriorityNotification;
    private Button btnDefaultNotification;
    private Button btnOldTypeNotification;
    private Button btnBigTextNotification;
    private Button btnBigImageNotification;
    private Button btnInboxTypeNotification;


    private int NOTIF_REF = 1;
    private NotificationManager manager;
    private int count = 1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        DrawerLayout drawer = (DrawerLayout) findViewById(drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        btnMaxPriorityNotification = (Button) findViewById(R.id.btnMaxPriorityNotification);
        btnHighPriorityNotification = (Button) findViewById(R.id.btnHighPriorityNotification);
        btnLowPriorityNotification = (Button) findViewById(R.id.btnLowPriorityNotification);
        btnMinPriorityNotification = (Button) findViewById(R.id.btnMinPriorityNotification);
        btnDefaultNotification = (Button) findViewById(R.id.btnDefaultNotification);
        btnOldTypeNotification = (Button) findViewById(R.id.btnOldTypeNotification);
        btnBigTextNotification = (Button) findViewById(R.id.btnBigTextNotification);
        btnBigImageNotification = (Button) findViewById(R.id.btnBigImageNotification);
        btnInboxTypeNotification = (Button) findViewById(R.id.btnInboxTypeNotification);


        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);


        btnMaxPriorityNotification.setOnClickListener(MainActivity.this);
        btnHighPriorityNotification.setOnClickListener(MainActivity.this);
        btnLowPriorityNotification.setOnClickListener(MainActivity.this);
        btnDefaultNotification.setOnClickListener(MainActivity.this);
        btnOldTypeNotification.setOnClickListener(MainActivity.this);
        btnBigImageNotification.setOnClickListener(MainActivity.this);
        btnBigTextNotification.setOnClickListener(MainActivity.this);
        btnInboxTypeNotification.setOnClickListener(MainActivity.this);
        btnMinPriorityNotification.setOnClickListener(MainActivity.this);
        handleNotification(getIntent());
    }

    private void handleNotification(Intent intent) {
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);

        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_camera) {
        } else if (id == R.id.nav_gallery) {
        } else if (id == R.id.nav_slideshow) {
        } else if (id == R.id.nav_manage) {
        } else if (id == R.id.nav_share) {
        } else if (id == R.id.nav_send) {

    }

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
    }

    @Override
    public void onClick(View view) {
        Notification notif = null;
        Notification.Builder builder = new Notification.Builder()

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}


