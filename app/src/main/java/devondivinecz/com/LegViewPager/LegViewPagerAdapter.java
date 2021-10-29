package devondivinecz.com.LegViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class LegViewPagerAdapter extends FragmentStateAdapter {
    public LegViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0: return LegLayoutFragment.newInstance(null, null);
            case 1: return LegLayoutFragment.newInstance(null, null);
            case 2: return LegLayoutFragment.newInstance(null, null);
            case 3: return LegLayoutFragment.newInstance(null, null);
            case 4: return LegLayoutFragment.newInstance(null, null);
            default: return LegLayoutFragment.newInstance("Fragment Not Found", null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
