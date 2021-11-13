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
            case 0:
                return ForearmLayoutFragment.newInstance("Dumbbell Wrist Flexion", null, null);
            case 1:
                return ForearmLayoutFragment.newInstance("Dumbbell Wrist Extension", null, null);
            case 2:
                return ForearmLayoutFragment.newInstance("Reverse Curl", null, "1. Start with two dumbbells in each hand up near your chin\n" +
                        "2. Lower the dumbbells towards your stomach\n" +
                        "3. Curl the dumbbells back up to your chin to complete the rep");
            case 3:
                return ForearmLayoutFragment.newInstance("Farmers Walk", null, "1. Start with a dumbbell in each hand by your waist\n" +
                        "2. Go for a walk at any distance while holding the dumbbells");
            case 4:
                return ForearmLayoutFragment.newInstance("Preacher Curl", null, null);
            default:
                return ForearmLayoutFragment.newInstance("Fragment Not Found", null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
