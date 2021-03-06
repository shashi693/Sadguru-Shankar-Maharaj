package com.avenueinfotech.sadgurushankarmaharaj;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.avenueinfotech.sadgurushankarmaharaj.fragments.AkalkotiFragment;
import com.avenueinfotech.sadgurushankarmaharaj.fragments.BabaterecharanFragment;
import com.avenueinfotech.sadgurushankarmaharaj.fragments.EkmukhiDevFragment;
import com.avenueinfotech.sadgurushankarmaharaj.fragments.JajajatakaFragment;
import com.avenueinfotech.sadgurushankarmaharaj.fragments.MainFragment;
import com.avenueinfotech.sadgurushankarmaharaj.fragments.SadguruFragment;
import com.avenueinfotech.sadgurushankarmaharaj.fragments.ShankarbabaFragment;
import com.avenueinfotech.sadgurushankarmaharaj.fragments.TrishulFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.content_frame, new MainFragment()).commit();
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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        FragmentManager fm = getFragmentManager();

        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            fm.beginTransaction().replace(R.id.content_frame, new TrishulFragment()).commit();

        } else if (id == R.id.nav_gallery) {
            fm.beginTransaction().replace(R.id.content_frame, new SadguruFragment()).commit();

        } else if (id == R.id.nav_slideshow) {
            fm.beginTransaction().replace(R.id.content_frame, new ShankarbabaFragment()).commit();

        } else if (id == R.id.nav_manage) {
            fm.beginTransaction().replace(R.id.content_frame, new BabaterecharanFragment()).commit();

        } else if (id == R.id.nav_gall) {
            fm.beginTransaction().replace(R.id.content_frame, new EkmukhiDevFragment()).commit();

        } else if (id == R.id.nav_slide) {
            fm.beginTransaction().replace(R.id.content_frame, new AkalkotiFragment()).commit();
        } else if (id == R.id.nav_man) {
            fm.beginTransaction().replace(R.id.content_frame, new JajajatakaFragment()).commit();
        }
//        else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
//        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
