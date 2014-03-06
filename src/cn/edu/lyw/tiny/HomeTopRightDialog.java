/**
 * TinyWeibo 微微博 
 * Copyright 2012 China ITElite Team
 * All Rights Reserved.
 * Created on 2012-12-20 23:53:32
 */
package cn.edu.lyw.tiny;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import cn.edu.lyw.tiny.util.ConstantUtil;

/**
 * @version 1.0
 * 
 */
public class HomeTopRightDialog extends Activity {

	/*
	 * (non-Javadoc)创建界面的回调方法
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_dialog_choosetype);
	}

	/*
	 * (non-Javadoc)触摸事件的回调方法
	 * 
	 * @see android.app.Activity#onTouchEvent(android.view.MotionEvent)
	 */
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		setResult(RESULT_CANCELED);
		finish();
		return true;
	}
	/**
	 * 显示公共微博
	 * 
	 * @param v
	 *            View组件
	 */
	public void ll_showHomeWeibo(View v) {
		setResult(RESULT_OK, (new Intent()).putExtra(ConstantUtil.TIMELINE_TYPE, ConstantUtil.TIMELINE_PUBLIC));
		finish();
	}

	/**
	 * 显示好友微博
	 * 
	 * @param v
	 *            View组件
	 */
	public void ll_showFriendsWeibo(View v) {
		setResult(RESULT_OK, (new Intent()).putExtra(ConstantUtil.TIMELINE_TYPE, ConstantUtil.TIMELINE_FRIENDS));
		finish();
	}

	/**
	 * 显示我的微博
	 * 
	 * @param v
	 *            View组件
	 */
	public void ll_showUserWeibo(View v) {
		setResult(RESULT_OK, (new Intent()).putExtra(ConstantUtil.TIMELINE_TYPE, ConstantUtil.TIMELINE_USER));
		finish();
	}

	/**
	 * 显示提到我的微博
	 * 
	 * @param v
	 *            View组件
	 */
	public void ll_showMentionsWeibo(View v) {
		setResult(RESULT_OK, (new Intent()).putExtra(ConstantUtil.TIMELINE_TYPE, ConstantUtil.TIMELINE_MENTIONS));
		finish();
	}

}
