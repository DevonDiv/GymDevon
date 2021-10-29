package devondivinecz.com.ForearmViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ForearmViewPagerAdapter extends FragmentStateAdapter {
    public ForearmViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0: return ForearmLayoutFragment.newInstance(null, null);
            case 1: return ForearmLayoutFragment.newInstance(null, null);
            case 2: return ForearmLayoutFragment.newInstance(null, null);
            case 3: return ForearmLayoutFragment.newInstance(null, null);
            case 4: return ForearmLayoutFragment.newInstance(null, null);
            default: return ForearmLayoutFragment.newInstance("Fragment Not Found", null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
