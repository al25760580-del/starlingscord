package androidx.appcompat.widget;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f999e;

    public g3(View view) {
        this.f995a = (TextView) view.findViewById(R.id.text1);
        this.f996b = (TextView) view.findViewById(R.id.text2);
        this.f997c = (ImageView) view.findViewById(R.id.icon1);
        this.f998d = (ImageView) view.findViewById(R.id.icon2);
        this.f999e = (ImageView) view.findViewById(com.discord.R.id.edit_query);
    }
}
