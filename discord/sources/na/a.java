package na;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashSet f16522i = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f16523d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f16524e;

    @Override // v9.a
    public final void B(Object obj, String str) {
        Boolean bool = Boolean.FALSE;
        if (f16522i.contains("is_rounded")) {
            this.f16523d.put("is_rounded", bool);
        }
    }

    @Override // na.c
    public k G() {
        return j.f16536d;
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo, v9.a
    public final Map getExtras() {
        return this.f16523d;
    }

    @Override // na.c
    public boolean h0() {
        return false;
    }

    @Override // v9.a
    public final void q(Map map) {
        if (map == null) {
            return;
        }
        for (String str : f16522i) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f16523d.put(str, obj);
            }
        }
    }
}
