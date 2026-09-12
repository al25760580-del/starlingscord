package co.discord.media_engine;

import com.discord.age_assurance.c;
import java.util.LinkedHashSet;
import java.util.function.Consumer;
import org.webrtc.VideoCodecInfo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3755b;

    public /* synthetic */ b(int i7, Object obj) {
        this.f3754a = i7;
        this.f3755b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f3754a) {
            case 0:
                ((LinkedHashSet) this.f3755b).add((VideoCodecInfo) obj);
                break;
            case 1:
                ((c) this.f3755b).invoke(obj);
                break;
            default:
                ((c) this.f3755b).invoke(obj);
                break;
        }
    }
}
