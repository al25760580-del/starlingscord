package y0;

import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static ArrayList a(Intent intent, String str, Class cls) {
        return intent.getParcelableArrayListExtra(str, cls);
    }

    public static Object b(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }
}
