package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class x2 {
    public static void a(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static void b(SearchView$SearchAutoComplete searchView$SearchAutoComplete, int i7) {
        searchView$SearchAutoComplete.setInputMethodMode(i7);
    }
}
