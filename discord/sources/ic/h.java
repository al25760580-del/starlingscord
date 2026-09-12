package ic;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f11509a;

    public h(j jVar) {
        this.f11509a = jVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        j jVar = this.f11509a;
        j.a(jVar, f.a((Context) jVar.f11518b));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        j jVar = this.f11509a;
        j.a(jVar, f.a((Context) jVar.f11518b));
    }
}
