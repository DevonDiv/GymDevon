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
                return TricepLayoutFragment.newInstance("Cable Rope Tricep Pushdown", null, "1. Standing straight up with the cable rope in both hands with your arms at a 90 degree angle\n" +
                        "2. Pull the rope down and back up to complete a rep");
            case 2:
                return TricepLayoutFragment.newInstance("Lying Triceps Extension", null, "1. Laying down on a flat bench, hold the dumbbell straight up\n" +
                        "2. Bring the dumbbell down towards your head and below\n" +
                        "3. Return to the starting position to complete the rep");
            case 3:
                return TricepLayoutFragment.newInstance("Tricep Dips", null, "1. Grab the bars of a dip station with your palms facing inward and your arms straight\n" +
                        "2. Slowly lower until your elbows are at right angles\n" +
                        "3. Lift yourself back up to the top to complete a rep");
            case 4:
                return TricepLayoutFragment.newInstance("One Arm Overhead Dumbbell Tricep Extension", null, "1. Start by standing straight up with one dumbbell in hand holding it above your head\n" +
                        "2. Lower the dumbbell behind and under your head and lift it back up to complete a rep");
            default:
                return TricepLayoutFragment.newInstance("Fragment Not Found", null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
