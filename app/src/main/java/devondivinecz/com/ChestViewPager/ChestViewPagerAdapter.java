package devondivinecz.com.ChestViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import devondivinecz.com.BackViewPager.BackLayoutFragment;

public class ChestViewPagerAdapter extends FragmentStateAdapter {
    public ChestViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0: return ChestLayoutFragment.newInstance(null, null, null);
            case 1: return ChestLayoutFragment.newInstance(null, null, null);
            case 2: return ChestLayoutFragment.newInstance(null, null, null);
            case 3: return ChestLayoutFragment.newInstance(null, null, null);
            case 4: return ChestLayoutFragment.newInstance(null, null, null);
            default: return ChestLayoutFragment.newInstance(null, null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
