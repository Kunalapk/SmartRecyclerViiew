// Generated by data binding compiler. Do not edit!
package com.kunalapk.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kunalapk.demo.ModelData;
import com.kunalapk.demo.R;
import com.kunalapk.smartrecyclerview.listener.OnItemClickListener;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemFileBinding extends ViewDataBinding {
  @Bindable
  protected ModelData mModel;

  @Bindable
  protected OnItemClickListener mClicklistener;

  protected ItemFileBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setModel(@Nullable ModelData model);

  @Nullable
  public ModelData getModel() {
    return mModel;
  }

  public abstract void setClicklistener(@Nullable OnItemClickListener clicklistener);

  @Nullable
  public OnItemClickListener getClicklistener() {
    return mClicklistener;
  }

  @NonNull
  public static ItemFileBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_file, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemFileBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemFileBinding>inflateInternal(inflater, R.layout.item_file, root, attachToRoot, component);
  }

  @NonNull
  public static ItemFileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_file, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemFileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemFileBinding>inflateInternal(inflater, R.layout.item_file, null, false, component);
  }

  public static ItemFileBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemFileBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemFileBinding)bind(component, view, R.layout.item_file);
  }
}
