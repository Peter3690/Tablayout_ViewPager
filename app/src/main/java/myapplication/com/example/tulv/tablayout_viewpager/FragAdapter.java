package myapplication.com.example.tulv.tablayout_viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by tulv on 9/7/2016.
 */
public class FragAdapter extends FragmentStatePagerAdapter {
    public FragAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new RedFragment();
                break;
            case 1:
                fragment = new BlueFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title="";
        switch (position){
            case 0:title="Red";break;
            case 1:title="Blue";break;
        }
        return title;
    }

}
