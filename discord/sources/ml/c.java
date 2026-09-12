package ml;

import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements SeekBar.OnSeekBarChangeListener {
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z5) {
        a aVar = (a) seekBar;
        if (i7 < aVar.getLowerLimit()) {
            i7 = aVar.getLowerLimit();
        } else if (i7 > aVar.getUpperLimit()) {
            i7 = aVar.getUpperLimit();
        }
        seekBar.setProgress(i7);
        ReactContext reactContext = (ReactContext) seekBar.getContext();
        if (z5) {
            int id2 = seekBar.getId();
            UIManagerHelper.getEventDispatcherForReactTag(reactContext, id2).dispatchEvent(new b(id2, aVar.c(i7)));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        ReactContext reactContext = (ReactContext) seekBar.getContext();
        int id2 = seekBar.getId();
        a aVar = (a) seekBar;
        aVar.f15878w = true;
        UIManagerHelper.getEventDispatcherForReactTag(reactContext, id2).dispatchEvent(new d(id2, aVar.c(seekBar.getProgress()), 1));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        ReactContext reactContext = (ReactContext) seekBar.getContext();
        a aVar = (a) seekBar;
        aVar.f15878w = false;
        int id2 = seekBar.getId();
        UIManagerHelper.getEventDispatcherForReactTag(reactContext, id2).dispatchEvent(new d(id2, aVar.c(seekBar.getProgress()), 0));
    }
}
