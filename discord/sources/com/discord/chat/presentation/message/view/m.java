package com.discord.chat.presentation.message.view;

import com.discord.react_strings.RenderContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4225e;

    public /* synthetic */ m(int i7, int i10) {
        this.f4224d = i10;
        this.f4225e = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4224d) {
            case 0:
                return ForumPostActionBarView.configure_CgeVRR0$lambda$8$lambda$7(this.f4225e, (RenderContext) obj);
            default:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f4225e + '.');
        }
    }
}
