package org.catroid.catrobat.newui.recycleviewlist;

import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.catroid.catrobat.newui.data.ListItem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by matthee on 22.03.17.
 */

public class RecyclerViewMultiSelectionManager<T> {
    private Set<T> mSelectedItems;

    public RecyclerViewMultiSelectionManager() {
        mSelectedItems = new HashSet<T>();
    }

    public List<T> getSelectedItems() {
        return new ArrayList<>(mSelectedItems);
    }

    public void setSelected(T item, boolean selected) {
        if (selected) {
            mSelectedItems.add(item);
        } else {
            mSelectedItems.remove(item);
        }
    }

    public boolean getSelected(T item) {
        return mSelectedItems.contains(item);
    }

    public void clearSelection() {
        mSelectedItems.clear();
    }

    public boolean isSelectable(T item) {
        return true;
    }

    public void toggleSelected(T item) {
        setSelected(item, !getSelected(item));
    }

}