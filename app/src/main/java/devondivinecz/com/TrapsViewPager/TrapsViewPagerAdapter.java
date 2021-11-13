package devondivinecz.com.TrapsViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import devondivinecz.com.ForearmViewPager.ForearmLayoutFragment;

public class TrapsViewPagerAdapter extends FragmentStateAdapter {
    public TrapsViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0: return TrapsLayoutFragment.newInstance("Dumbbell Shrugs", null, null);
            case 1: return TrapsLayoutFragment.newInstance("Single Arm Shrugs", null, null);
            case 2: return TrapsLayoutFragment.newInstance("Lower Trap Raise", null, null);
            case 3: return TrapsLayoutFragment.newInstance("Dumbbell Snatch", null, null);
            case 4: return TrapsLayoutFragment.newInstance("Incline Dumbbell Shrug", null, null);
            default: return TrapsLayoutFragment.newInstance("Fragment Not Found", null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
