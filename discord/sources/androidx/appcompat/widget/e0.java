package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static boolean a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
        androidx.core.view.e dVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                dVar = new androidx.core.view.d(clipData, 3);
            } else {
                androidx.core.view.f fVar = new androidx.core.view.f();
                fVar.f1654b = clipData;
                fVar.f1655c = 3;
                dVar = fVar;
            }
            androidx.core.view.u0.l(textView, dVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
        androidx.core.view.e dVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            dVar = new androidx.core.view.d(clipData, 3);
        } else {
            androidx.core.view.f fVar = new androidx.core.view.f();
            fVar.f1654b = clipData;
            fVar.f1655c = 3;
            dVar = fVar;
        }
        androidx.core.view.u0.l(view, dVar.build());
        return true;
    }
}
