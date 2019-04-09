package com.l.marc.noticiess.ViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.l.marc.noticiess.Perfil.Perfil_Tab_Fragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private int numeroTabs;

    public ViewPagerAdapter(FragmentManager fm, int numeroTabs) {
        super(fm);
        this.numeroTabs = numeroTabs;
    }

    @Override
    public Fragment getItem(int posicion) {
        switch (posicion) {
            case 0:
                Perfil_Tab_Fragment perfil_tab_fragment = new Perfil_Tab_Fragment();
                return perfil_tab_fragment;
            case 1:
                provaFragment courseActivity=new provaFragment();

                return courseActivity;
                //Noticies_Tab_Fragment noticies_tab_fragment = new Noticies_Tab_Fragment();
                //return noticies_tab_fragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numeroTabs;
    }
}
