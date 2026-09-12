package i;

import androidx.appcompat.view.ActionMode;

/* JADX INFO: loaded from: classes.dex */
public interface i {
    void onSupportActionModeFinished(ActionMode actionMode);

    void onSupportActionModeStarted(ActionMode actionMode);

    ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback);
}
