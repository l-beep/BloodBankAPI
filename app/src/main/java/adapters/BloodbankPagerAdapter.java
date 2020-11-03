package adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public abstract class BloodbankPagerAdapter<blood> extends FragmentPagerAdapter{

   private List<blood> mBloodbank;

   public BloodbankPagerAdapter(FragmentManager fm, int behavior, List<blood> Bloodbank, List<blood> bloodbank) {
       super(fm, behavior);
       mBloodbank = bloodbank;

   }
    public Fragment getItem(int position, Class bloodbankDetailFragment) {
        return (Fragment) bloodbankDetailFragment.newInstance(mBloodbank.get(position));
}

@Override
public int getCount() {
       return mBloodbank.size();

   }
   @Override
    public CharSequence getPageTitle(int position) {
       return mBloodbank.get(position).getName();
   }

    public abstract void PagerAdapter();
}

