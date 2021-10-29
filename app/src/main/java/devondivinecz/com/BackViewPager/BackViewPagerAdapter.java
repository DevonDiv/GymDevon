package devondivinecz.com.BackViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import devondivinecz.com.BicepViewPager.BicepLayoutFragment;

public class BackViewPagerAdapter extends FragmentStateAdapter {
    public BackViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0: return BackLayoutFragment.newInstance(null, null);
            case 1: return BackLayoutFragment.newInstance(null, null);
            case 2: return BackLayoutFragment.newInstance(null, null);
            case 3: return BackLayoutFragment.newInstance(null, null);
            case 4: return BackLayoutFragment.newInstance(null, null);
            default: return BackLayoutFragment.newInstance(null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
