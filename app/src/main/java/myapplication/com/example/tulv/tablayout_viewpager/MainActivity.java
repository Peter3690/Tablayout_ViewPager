package myapplication.com.example.tulv.tablayout_viewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    FragmentManager fragmentManager;
FragAdapter fragAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        tabLayout=(TabLayout)findViewById(R.id.tabs);
        fragmentManager=getSupportFragmentManager();
        fragAdapter=new FragAdapter(fragmentManager);
        viewPager.setAdapter(fragAdapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setTabsFromPagerAdapter(fragAdapter);
        tabLayout.setSelectedTabIndicatorColor(Color.BLUE);
        tabLayout.setSelected(true);
        tabLayout.setTabTextColors(Color.BLUE,Color.GREEN);
        tabLayout.setScrollPosition(1,1,true);
    }
}
