package com.discord.image.color_quantizer;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ColorCutQuantizer.VBOX_COMPARATOR_VOLUME$lambda$2((ColorCutQuantizer.Vbox) obj, (ColorCutQuantizer.Vbox) obj2);
    }
}
