package x7;

import com.discord.resource_usage.utils.ProcfsStats;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return ProcfsStats.readBuffer$lambda$1();
    }
}
