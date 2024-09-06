package com.clone.projectrizki;

import android.animation.*;
import android.animation.ObjectAnimator;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.FirebaseApp;
import de.hdodenhof.circleimageview.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class DeveloperinfoActivity extends AppCompatActivity {
	
	private boolean get = false;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear14;
	private LinearLayout linear2;
	private LinearLayout linear12;
	private LinearLayout linear6;
	private LinearLayout linear13;
	private LinearLayout linear10;
	private LinearLayout linear15;
	private LinearLayout linear11;
	private TextView textview8;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private CircleImageView imageview1;
	private TextView textview1;
	private LinearLayout linear5;
	private TextView textview2;
	private ImageView imageview3;
	private ImageView imageview4;
	private ImageView imageview5;
	private ImageView imageview6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private CircleImageView imageview2;
	private TextView textview3;
	private LinearLayout linear9;
	private TextView textview4;
	private ImageView imageview7;
	private ImageView imageview8;
	private ImageView imageview9;
	private ImageView imageview10;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview9;
	
	private SharedPreferences keyname;
	private ObjectAnimator bbb = new ObjectAnimator();
	private AlertDialog custom;
	private AlertDialog lll;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.developerinfo);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		linear14 = findViewById(R.id.linear14);
		linear2 = findViewById(R.id.linear2);
		linear12 = findViewById(R.id.linear12);
		linear6 = findViewById(R.id.linear6);
		linear13 = findViewById(R.id.linear13);
		linear10 = findViewById(R.id.linear10);
		linear15 = findViewById(R.id.linear15);
		linear11 = findViewById(R.id.linear11);
		textview8 = findViewById(R.id.textview8);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		imageview1 = findViewById(R.id.imageview1);
		textview1 = findViewById(R.id.textview1);
		linear5 = findViewById(R.id.linear5);
		textview2 = findViewById(R.id.textview2);
		imageview3 = findViewById(R.id.imageview3);
		imageview4 = findViewById(R.id.imageview4);
		imageview5 = findViewById(R.id.imageview5);
		imageview6 = findViewById(R.id.imageview6);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		imageview2 = findViewById(R.id.imageview2);
		textview3 = findViewById(R.id.textview3);
		linear9 = findViewById(R.id.linear9);
		textview4 = findViewById(R.id.textview4);
		imageview7 = findViewById(R.id.imageview7);
		imageview8 = findViewById(R.id.imageview8);
		imageview9 = findViewById(R.id.imageview9);
		imageview10 = findViewById(R.id.imageview10);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview9 = findViewById(R.id.textview9);
		keyname = getSharedPreferences("bool", Activity.MODE_PRIVATE);
		
		linear2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (keyname.getString("boolean", "").contains("false")) {
					bbb.setTarget(linear12);
					bbb.setPropertyName("translationY");
					keyname.edit().putString("boolean", "true").commit();
					bbb.setFloatValues((float)(0));
					bbb.setFloatValues((float)(-30), (float)(0));
					bbb.setDuration((int)(10));
					bbb.start();
					linear12.setVisibility(View.VISIBLE);
				}
				else {
					bbb.setTarget(linear12);
					bbb.setPropertyName("translationY");
					keyname.edit().putString("boolean", "true").commit();
					bbb.setFloatValues((float)(0));
					bbb.setFloatValues((float)(1), (float)(-30));
					bbb.setDuration((int)(10));
					bbb.start();
					keyname.edit().putString("boolean", "false").commit();
					linear12.setVisibility(View.GONE);
				}
			}
		});
		
		linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (keyname.getString("bb1", "").contains("false")) {
					linear13.setVisibility(View.VISIBLE);
					bbb.setTarget(linear13);
					bbb.setPropertyName("translationY");
					keyname.edit().putString("bb1", "true").commit();
					bbb.setFloatValues((float)(0));
					bbb.setFloatValues((float)(-30), (float)(0));
					bbb.setDuration((int)(5));
					bbb.start();
				}
				else {
					linear13.setVisibility(View.GONE);
					bbb.setTarget(linear13);
					bbb.setPropertyName("translationY");
					keyname.edit().putString("boolean", "true").commit();
					bbb.setFloatValues((float)(0));
					bbb.setFloatValues((float)(1), (float)(-30));
					bbb.setDuration((int)(5));
					bbb.start();
					keyname.edit().putString("bb1", "false").commit();
				}
			}
		});
		
		linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final AlertDialog custom = new AlertDialog.Builder(DeveloperinfoActivity.this).create();
				LayoutInflater customLI = getLayoutInflater();
				View customCV = (View) customLI.inflate(R.layout.contri, null);
				custom.setView(customCV);
				custom.setCancelable(true);
				custom.show();
			}
		});
		
		linear15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final AlertDialog lll = new AlertDialog.Builder(DeveloperinfoActivity.this).create();
				LayoutInflater lllLI = getLayoutInflater();
				View lllCV = (View) lllLI.inflate(R.layout.cre, null);
				lll.setView(lllCV);
				lll.setCancelable(true);
				lll.show();
			}
		});
	}
	
	private void initializeLogic() {
		linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)4, 0xFF000000, Color.TRANSPARENT));
		linear6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)4, 0xFF000000, Color.TRANSPARENT));
		linear10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)4, 0xFF000000, Color.TRANSPARENT));
		linear11.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)4, 0xFF000000, Color.TRANSPARENT));
		linear15.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)4, 0xFF000000, Color.TRANSPARENT));
		linear12.setVisibility(View.GONE);
		linear13.setVisibility(View.GONE);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}