// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCalendarBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView calendarImageView1;

  @NonNull
  public final ImageView calendarImageView2;

  @NonNull
  public final ImageView calendarImageView3;

  @NonNull
  public final ImageView calendarImageView4;

  @NonNull
  public final ToolbarBinding include;

  private ActivityCalendarBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView calendarImageView1, @NonNull ImageView calendarImageView2,
      @NonNull ImageView calendarImageView3, @NonNull ImageView calendarImageView4,
      @NonNull ToolbarBinding include) {
    this.rootView = rootView;
    this.calendarImageView1 = calendarImageView1;
    this.calendarImageView2 = calendarImageView2;
    this.calendarImageView3 = calendarImageView3;
    this.calendarImageView4 = calendarImageView4;
    this.include = include;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCalendarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCalendarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_calendar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCalendarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.calendar_imageView1;
      ImageView calendarImageView1 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView1 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView2;
      ImageView calendarImageView2 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView2 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView3;
      ImageView calendarImageView3 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView3 == null) {
        break missingId;
      }

      id = R.id.calendar_imageView4;
      ImageView calendarImageView4 = ViewBindings.findChildViewById(rootView, id);
      if (calendarImageView4 == null) {
        break missingId;
      }

      id = R.id.include;
      View include = ViewBindings.findChildViewById(rootView, id);
      if (include == null) {
        break missingId;
      }
      ToolbarBinding binding_include = ToolbarBinding.bind(include);

      return new ActivityCalendarBinding((ConstraintLayout) rootView, calendarImageView1,
          calendarImageView2, calendarImageView3, calendarImageView4, binding_include);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
