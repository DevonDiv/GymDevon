package devondivinecz.com.BackViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import devondivinecz.com.BicepViewPager.BicepLayoutFragment;

public class BackViewPagerAdapter extends FragmentStateAdapter {
    public BackViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0: return BackLayoutFragment.newInstance("Pull Ups", null, null);
            case 1: return BackLayoutFragment.newInstance("Dumbbell Rows", null, null);
            case 2: return BackLayoutFragment.newInstance("Barbell Rows", null, null);
            case 3: return BackLayoutFragment.newInstance("Side Dumbbell Lat Raises", null, null);
            case 4: return BackLayoutFragment.newInstance("Dumbbell Rear Delt Raises", null, null);
            default: return BackLayoutFragment.newInstance(null, null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
