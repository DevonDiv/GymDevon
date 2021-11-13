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
            case 0: return BicepLayoutFragment.newInstance("Dumbbell Curls", null, null); //String.valueOf(R.drawable.image)
            case 1: return BicepLayoutFragment.newInstance("Weighters Curls", null, null);
            case 2: return BicepLayoutFragment.newInstance("Concentration Curls", null, null);
            case 3: return BicepLayoutFragment.newInstance("Incline Dumbbell Curls", null, null);
            case 4: return BicepLayoutFragment.newInstance("Seated Hammer Curl", null, null);
            default: return BicepLayoutFragment.newInstance("Fragment Not Found", null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
