package fe;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import ei.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultTrackSelector f9097a;

    public i(DefaultTrackSelector defaultTrackSelector) {
        this.f9097a = defaultTrackSelector;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z5) {
        q0 q0Var = DefaultTrackSelector.k;
        this.f9097a.e();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z5) {
        q0 q0Var = DefaultTrackSelector.k;
        this.f9097a.e();
    }
}
