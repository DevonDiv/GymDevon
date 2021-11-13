package devondivinecz.com.TricepViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import devondivinecz.com.ForearmViewPager.ForearmLayoutFragment;

public class TricepViewPagerAdapter extends FragmentStateAdapter {
    public TricepViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0:
                return TricepLayoutFragment.newInstance("Close-Grip Bench Press", null, "1. Add weighted plates to the barbell\n" +
                        "2. Start by laying flat on the bench\n" +
                        "3. Grab the barbell with a close grip\n" +
                        "4. Lift the barbell of the rack\n" +
                        "5. Lift the barbell up and back down towards your chest to complete a rep");
            case 1:
                return TricepLayoutFragment.newInstance("Cable Rope Triceps Pushdown", null, null);
            case 2:
                return TricepLayoutFragment.newInstance("Lying Triceps Extension", null, null);
            case 3:
                return TricepLayoutFragment.newInstance("Tricep Dips", null, null);
            case 4:
                return TricepLayoutFragment.newInstance("One Arm Overhead Extension", null, null);
            default:
                return TricepLayoutFragment.newInstance("Fragment Not Found", null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
