package androidx.media;

import o3.a;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2420a = aVar.f(audioAttributesImplBase.f2420a, 1);
        audioAttributesImplBase.f2421b = aVar.f(audioAttributesImplBase.f2421b, 2);
        audioAttributesImplBase.f2422c = aVar.f(audioAttributesImplBase.f2422c, 3);
        audioAttributesImplBase.f2423d = aVar.f(audioAttributesImplBase.f2423d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f2420a, 1);
        aVar.j(audioAttributesImplBase.f2421b, 2);
        aVar.j(audioAttributesImplBase.f2422c, 3);
        aVar.j(audioAttributesImplBase.f2423d, 4);
    }
}
