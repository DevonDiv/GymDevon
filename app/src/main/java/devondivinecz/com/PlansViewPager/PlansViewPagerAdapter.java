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
        position = position % 6;
        switch(position) {
            case 0: return PlansLayoutFragment.newInstance("Bicep Plan", null);
            case 1: return PlansLayoutFragment.newInstance("Tricep Plan", null);
            case 2: return PlansLayoutFragment.newInstance("Shoulder Plan", null);
            case 3: return PlansLayoutFragment.newInstance("Trap Plan", null);
            case 4: return PlansLayoutFragment.newInstance("Forearm Plan", null);
            case 5: return PlansLayoutFragment.newInstance("Legs Plan", null);
            default: return PlansLayoutFragment.newInstance("Fragment Not Found", null);
        }
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
