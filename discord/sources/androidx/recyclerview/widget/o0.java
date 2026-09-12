package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import com.discord.chat.presentation.message.view.VoiceUserAdapter$Companion$DIFF_CALLBACK$1;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends RecyclerView.Adapter {
    final AsyncListDiffer mDiffer;
    private final AsyncListDiffer.ListListener mListener;

    public o0(VoiceUserAdapter$Companion$DIFF_CALLBACK$1 voiceUserAdapter$Companion$DIFF_CALLBACK$1) {
        n0 n0Var = new n0(this);
        this.mListener = n0Var;
        b bVar = new b(this);
        synchronized (c.f2562a) {
            try {
                if (c.f2563b == null) {
                    c.f2563b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ExecutorService executorService = c.f2563b;
        d dVar = new d();
        dVar.f2590a = executorService;
        dVar.f2591b = voiceUserAdapter$Companion$DIFF_CALLBACK$1;
        AsyncListDiffer asyncListDiffer = new AsyncListDiffer(bVar, dVar);
        this.mDiffer = asyncListDiffer;
        asyncListDiffer.f2441d.add(n0Var);
    }

    @NonNull
    public List<Object> getCurrentList() {
        return this.mDiffer.f2443f;
    }

    public Object getItem(int i7) {
        return this.mDiffer.f2443f.get(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDiffer.f2443f.size();
    }

    public void onCurrentListChanged(@NonNull List<Object> list, @NonNull List<Object> list2) {
    }

    public void submitList(List<Object> list) {
        this.mDiffer.b(list, null);
    }

    public void submitList(List<Object> list, Runnable runnable) {
        this.mDiffer.b(list, runnable);
    }
}
