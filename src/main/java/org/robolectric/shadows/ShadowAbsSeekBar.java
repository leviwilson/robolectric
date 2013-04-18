package org.robolectric.shadows;

import android.widget.AbsSeekBar;
import org.robolectric.internal.Implements;

@Implements(value = AbsSeekBar.class, inheritImplementationMethods = true)
public class ShadowAbsSeekBar extends ShadowProgressBar {
    
    boolean mIsUserSeekable = true;
    
}
