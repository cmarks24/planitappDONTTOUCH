package christian.planitappwdrawer;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.support.v4.app.Fragment;

public class RegistrationActivity extends AppCompatActivity {

    private static final String TAG = "RegistrationActivity";

    //private SectionsStatePagerAdapter mSectionsStatePagerAdapter;
    //private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_activity);
        Log.d(TAG, "onCreate: Started.");



        //mSectionsStatePagerAdapter = new SectionsStatePagerAdapter(getSupportFragmentManager());

        //mViewPager = (ViewPager) findViewById(R.id.container);
        //setup the pager
        //setupViewPager(mViewPager);

    }

    //private void setupViewPager(ViewPager viewPager){
        //SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        //adapter.addFragment(new FragmentLogIn(), "Log In");
        //adapter.addFragment(new FragmentRegister(), "Register");
        //viewPager.setAdapter(adapter);
   // }

    //public void setViewPager(int fragmentNumber){ mViewPager.setCurrentItem(fragmentNumber); }
}