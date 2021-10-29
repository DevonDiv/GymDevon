package devondivinecz.com.ShoulderViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ShoulderViewPagerAdapter extends FragmentStateAdapter {
    public ShoulderViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0: return ShoulderLayoutFragment.newInstance(null, null);
            case 1: return ShoulderLayoutFragment.newInstance(null, null);
            case 2: return ShoulderLayoutFragment.newInstance(null, null);
            case 3: return ShoulderLayoutFragment.newInstance(null, null);
            case 4: return ShoulderLayoutFragment.newInstance(null, null);
            default: return ShoulderLayoutFragment.newInstance("Fragment Not Found", null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
