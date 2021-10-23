package devondivinecz.com.PlansViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PlansViewPagerAdapter extends FragmentStateAdapter {

    public PlansViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0: return PlansLayoutFragment.newInstance(null, null);
            case 1: return PlansLayoutFragment.newInstance(null, null);
            case 2: return PlansLayoutFragment.newInstance(null, null);
            case 3: return PlansLayoutFragment.newInstance(null, null);
            case 4: return PlansLayoutFragment.newInstance(null, null);
            default: return PlansLayoutFragment.newInstance("Fragment Not Found", null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
