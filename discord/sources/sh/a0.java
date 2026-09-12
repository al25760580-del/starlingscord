package sh;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final th.f f19976a;

    public a0(th.f fVar) {
        this.f19976a = fVar;
    }

    public final ParcelFileDescriptor.AutoCloseInputStream a(int i7, int i10, String str, String str2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) a5.l0.h(((v1) this.f19976a.a()).f(i7, i10, str, str2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new l0("Corrupted ParcelFileDescriptor, session " + i7 + " packName " + str + " sliceId " + str2 + ", chunkNumber " + i10, i7);
        } catch (InterruptedException e10) {
            throw new l0("Extractor was interrupted while waiting for chunk file.", e10, i7);
        } catch (ExecutionException e11) {
            StringBuilder sbO = com.discord.chat.presentation.list.a.o("Error opening chunk file, session ", " packName ", str, i7, " sliceId ");
            sbO.append(str2);
            sbO.append(", chunkNumber ");
            sbO.append(i10);
            throw new l0(sbO.toString(), e11, i7);
        }
    }
}
