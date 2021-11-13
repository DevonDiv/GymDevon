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
            case 0:
                return ShoulderLayoutFragment.newInstance("Dumbbell Lateral Raise", null, null);
            case 1:
                return ShoulderLayoutFragment.newInstance("Incline Lateral Raise", null, null);
            case 2:
                return ShoulderLayoutFragment.newInstance("Rear Kickback", null, null);
            case 3:
                return ShoulderLayoutFragment.newInstance("Rainbow Raise", null, "1. Rest the side of your body on the bench at a 45 degree angle\n" +
                        "2. With the dumbbell starting behind your back raise it up and towards the front of your body in a semi circle motion");
            case 4:
                return ShoulderLayoutFragment.newInstance("Kneeling Dumbbell Press", null, "1. Start on one knee with the dumbbell above your shoulder\n" +
                        "2. Raise the dumbbell up and down to complete the rep");
            default:
                return ShoulderLayoutFragment.newInstance("Fragment Not Found", null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
