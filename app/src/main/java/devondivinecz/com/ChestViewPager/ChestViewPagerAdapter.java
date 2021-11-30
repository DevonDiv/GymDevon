package devondivinecz.com.ChestViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import devondivinecz.com.BackViewPager.BackLayoutFragment;
import devondivinecz.com.R;

public class ChestViewPagerAdapter extends FragmentStateAdapter {
    public ChestViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0:
                return ChestLayoutFragment.newInstance("Bench Press", String.valueOf(R.drawable.bench_press), "1. Add weighted plates to the barbell\n" +
                        "2. Start by laying flat on the bench\n" +
                        "3. Lift the barbell of the rack\n" +
                        "4. Lift the barbell up and back down towards your chest to complete a rep");
            case 1:
                return ChestLayoutFragment.newInstance("Dips", String.valueOf(R.drawable.dips), "1. Grab the outside horizontal handles\n" +
                        "2. Push yourself up and down vertically to compelete the rep");
            case 2:
                return ChestLayoutFragment.newInstance("Decline Chest Pull Overs", String.valueOf(R.drawable.decline_chest_pull_overs), "1. Grab a dumbbell\n" +
                        "2. Lay down on the declined bench\n" +
                        "3. Hold the dumbbell on both ends with your arms extended behind your head\n" +
                        "4. Pull up towards your chest and back down to complete a rep");
            case 3:
                return ChestLayoutFragment.newInstance("Dumbbell Press", String.valueOf(R.drawable.dumbbell_press), "1. Start by laying flat on the bench\n" +
                        "2. Lift the dumbbells up and back down towards your chest to complete a rep");
            case 4:
                return ChestLayoutFragment.newInstance("Pushups", String.valueOf(R.drawable.push_ups), "1. Go on all fours with your arms holding your body straight up and your toes touching the ground\n" +
                        "2. Drop your body down with your chest almost touching the ground\n" +
                        "3. Pus your body back up to complete a rep");
            default:
                return ChestLayoutFragment.newInstance(null, null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
