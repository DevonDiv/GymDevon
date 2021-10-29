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
            case 0: return ShoulderLayoutFragment.newInstance("Dumbbell Lateral Raise", null);
            case 1: return ShoulderLayoutFragment.newInstance("Incline Lateral Raise", null);
            case 2: return ShoulderLayoutFragment.newInstance("Rear Kickback", null);
            case 3: return ShoulderLayoutFragment.newInstance("Rainbow Raise", null);
            case 4: return ShoulderLayoutFragment.newInstance("Kneeling Dumbbell Press", null);
            default: return ShoulderLayoutFragment.newInstance("Fragment Not Found", null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
