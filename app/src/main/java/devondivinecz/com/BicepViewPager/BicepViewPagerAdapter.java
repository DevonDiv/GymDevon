package devondivinecz.com.BicepViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class BicepViewPagerAdapter extends FragmentStateAdapter {
    public BicepViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0: return BicepLayoutFragment.newInstance(null, null);
            case 1: return BicepLayoutFragment.newInstance(null, null);
            case 2: return BicepLayoutFragment.newInstance(null, null);
            case 3: return BicepLayoutFragment.newInstance(null, null);
            case 4: return BicepLayoutFragment.newInstance(null, null);
            default: return BicepLayoutFragment.newInstance("Fragment Not Found", null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
