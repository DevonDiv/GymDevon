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
                return ForearmLayoutFragment.newInstance("Dumbbell Wrist Flexion", null, "1. While holding to dumbbells palm up, lay your arms on a flat bench\n" +
                        "2. Using only your wrist curl the dumbbells towards you and back down to complete the rep");
            case 1:
                return ForearmLayoutFragment.newInstance("Dumbbell Wrist Extension", null, "1. While holding to dumbbells palm up, lay your arms on a flat bench\n" +
                        "2. Using only your wrist curl the dumbbells down away from you and back up to complete the rep");
            case 2:
                return ForearmLayoutFragment.newInstance("Reverse Curl", null, "1. Start with two dumbbells in each hand up near your chin\n" +
                        "2. Lower the dumbbells towards your stomach\n" +
                        "3. Curl the dumbbells back up to your chin to complete the rep");
            case 3:
                return ForearmLayoutFragment.newInstance("Farmers Walk", null, "1. Start with a dumbbell in each hand by your waist\n" +
                        "2. Go for a walk at any distance while holding the dumbbells");
            case 4:
                return ForearmLayoutFragment.newInstance("Preacher Curl", null, "1. While holding a curl bar rest the bottom of your biceps on a 45 degree angle down\n" +
                        "2. Curl the bar towards your chin and back down to complete a rep");
            default:
                return ForearmLayoutFragment.newInstance("Fragment Not Found", null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
