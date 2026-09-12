package m2;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import com.google.firebase.messaging.r;
import java.nio.ByteBuffer;
import pa.s;

/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f15356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f15357b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        s sVar = new s();
        super(inputConnection, false);
        this.f15356a = editText;
        this.f15357b = sVar;
        if (k2.i.k != null) {
            k2.i iVarA = k2.i.a();
            if (iVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            a5.a aVar = iVarA.f14237e;
            aVar.getClass();
            Bundle bundle = editorInfo.extras;
            l2.b bVar = (l2.b) ((r) aVar.f145c).f6610d;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f1674v).getInt(iA + bVar.f1671d) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i10) {
        Editable editableText = this.f15356a.getEditableText();
        this.f15357b.getClass();
        return s.m(this, editableText, i7, i10, false) || super.deleteSurroundingText(i7, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i10) {
        Editable editableText = this.f15356a.getEditableText();
        this.f15357b.getClass();
        return s.m(this, editableText, i7, i10, true) || super.deleteSurroundingTextInCodePoints(i7, i10);
    }
}
