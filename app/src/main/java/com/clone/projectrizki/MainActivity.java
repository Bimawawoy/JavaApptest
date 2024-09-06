package com.clone.projectrizki;

import com.clone.projectrizki.SplashActivity;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
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
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private LinearLayout linear3;
	private ScrollView vscroll1;
	private LinearLayout linear7;
	private TextView textview1;
	private ImageView imageview1;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private EditText edittext1;
	private LinearLayout linear4;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private LinearLayout linear5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private Button button10;
	private LinearLayout linear6;
	private Button button11;
	private Button button12;
	private Button button13;
	private Button button14;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private TextView textview7;
	private TextView textview6;
	
	private Intent intu = new Intent();
	private com.google.android.material.bottomsheet.BottomSheetDialog bottom;
	private com.google.android.material.bottomsheet.BottomSheetDialog drawer;
	private SharedPreferences share;
	private SharedPreferences sharee;
	private Intent gmail = new Intent();
	private android.content.pm.PackageManager pack;
	private AlertDialog.Builder dialog;
	private Intent intej = new Intent();
	private AlertDialog.Builder goblog;
	private TimerTask timkon;
	private ProgressDialog dialogd;
	private Intent dev = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear3 = findViewById(R.id.linear3);
		vscroll1 = findViewById(R.id.vscroll1);
		linear7 = findViewById(R.id.linear7);
		textview1 = findViewById(R.id.textview1);
		imageview1 = findViewById(R.id.imageview1);
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		edittext1 = findViewById(R.id.edittext1);
		linear4 = findViewById(R.id.linear4);
		button1 = findViewById(R.id.button1);
		button2 = findViewById(R.id.button2);
		button3 = findViewById(R.id.button3);
		button4 = findViewById(R.id.button4);
		button5 = findViewById(R.id.button5);
		linear5 = findViewById(R.id.linear5);
		button6 = findViewById(R.id.button6);
		button7 = findViewById(R.id.button7);
		button8 = findViewById(R.id.button8);
		button9 = findViewById(R.id.button9);
		button10 = findViewById(R.id.button10);
		linear6 = findViewById(R.id.linear6);
		button11 = findViewById(R.id.button11);
		button12 = findViewById(R.id.button12);
		button13 = findViewById(R.id.button13);
		button14 = findViewById(R.id.button14);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview7 = findViewById(R.id.textview7);
		textview6 = findViewById(R.id.textview6);
		share = getSharedPreferences("bottom", Activity.MODE_PRIVATE);
		sharee = getSharedPreferences("debug", Activity.MODE_PRIVATE);
		dialog = new AlertDialog.Builder(this);
		goblog = new AlertDialog.Builder(this);
		
		linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final com.google.android.material.bottomsheet.BottomSheetDialog drawerD = new com.google.android.material.bottomsheet.BottomSheetDialog(MainActivity.this);
				View drawerV;
				drawerV = getLayoutInflater().inflate(R.layout.drawer,null );
				drawerD.setContentView(drawerV);
				final LinearLayout linear2 = (LinearLayout) drawerV.findViewById(R.id.linear2);
				final LinearLayout linear12 = (LinearLayout) drawerV.findViewById(R.id.linear12);
				final LinearLayout linear13 = (LinearLayout) drawerV.findViewById(R.id.linear13);
				final LinearLayout linear14 = (LinearLayout) drawerV.findViewById(R.id.linear14);
				final LinearLayout linear15 = (LinearLayout) drawerV.findViewById(R.id.linear15);
				linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)4, 0xFF000000, Color.TRANSPARENT));
				linear12.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)4, 0xFF000000, Color.TRANSPARENT));
				linear13.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)4, 0xFF000000, Color.TRANSPARENT));
				linear14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)4, 0xFF000000, Color.TRANSPARENT));
				linear15.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)4, 0xFF000000, Color.TRANSPARENT));
				drawerD.show();
				linear2.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						intu.setClass(getApplicationContext(), SettingsActivity.class);
						startActivity(intu);
					}
				});
				linear12.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						dialog.setMessage("Silahkan hubungi developer!");
						dialog.setPositiveButton("Chat", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								intej.setData(Uri.parse("https://wa.me/6281229259881"));
								startActivity(intej);
							}
						});
						dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dialog.create().show();
					}
				});
				linear13.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						dialogd = new ProgressDialog(MainActivity.this);
						dialogd.setMessage("Sedang memeriksa...");
						dialogd.show();
						dialogd.setCancelable(false);
						timkon = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										dialogd.dismiss();
										goblog.setMessage("Software sudah yang paling terbaru!");
										goblog.create().show();
									}
								});
							}
						};
						_timer.schedule(timkon, (int)(2000));
					}
				});
				linear14.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						dev.setClass(getApplicationContext(), DeveloperinfoActivity.class);
						startActivity(dev);
					}
				});
				linear15.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						intu.setClass(getApplicationContext(), VersioninfoActivity.class);
						startActivity(intu);
					}
				});
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button1.requestFocus();
				button1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
				if (sharee.getString("debug_mode", "").equals("true")) {
					gmail.setData(Uri.parse("mailto:support@support.whatsapp.com?subject=Assalamualaikum&body=مرحبًا ، يرجى تفعيل حسابي: (+ ".concat(edittext1.getText().toString().concat("). لا أريد إرسال بريد مزعج. أقوم فقط بتوزيع المستندات على الأعضاء الذين سيقومون بالتسجيل في أنشطة Campus Learning. لكن تم حظر حسابي دون سبب لم أفعله مطلقًا. يرجى التفعيل في أقرب وقت ممكن. شكرًا لك"))));
					startActivity(gmail);
					SketchwareUtil.showMessage(getApplicationContext(), "Open ".concat("mailto:support@support.whatsapp.com?subject=Assalamualaikum&body=مرحبًا ، يرجى تفعيل حسابي: (+ ".concat(edittext1.getText().toString().concat("). لا أريد إرسال بريد مزعج. أقوم فقط بتوزيع المستندات على الأعضاء الذين سيقومون بالتسجيل في أنشطة Campus Learning. لكن تم حظر حسابي دون سبب لم أفعله مطلقًا. يرجى التفعيل في أقرب وقت ممكن. شكرًا لك"))));
					_anti_null();
				}
				else {
					gmail.setData(Uri.parse("mailto:support@support.whatsapp.com?subject=Assalamualaikum&body=مرحبًا ، يرجى تفعيل حسابي: (+ ".concat(edittext1.getText().toString().concat("). لا أريد إرسال بريد مزعج. أقوم فقط بتوزيع المستندات على الأعضاء الذين سيقومون بالتسجيل في أنشطة Campus Learning. لكن تم حظر حسابي دون سبب لم أفعله مطلقًا. يرجى التفعيل في أقرب وقت ممكن. شكرًا لك"))));
					startActivity(gmail);
					_anti_null();
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
			}
		});
		
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button11.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
			}
		});
		
		button12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button12.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
			}
		});
		
		button13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button13.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
			}
		});
		
		button14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFF4CAF50, Color.TRANSPARENT));
			}
		});
	}
	
	private void initializeLogic() {
		if (share.getString("hide", "").contains("true")) {
			final com.google.android.material.bottomsheet.BottomSheetDialog bottomD = new com.google.android.material.bottomsheet.BottomSheetDialog(MainActivity.this);
			View bottomV;
			bottomV = getLayoutInflater().inflate(R.layout.changelog_dialog,null );
			bottomD.setContentView(bottomV);
			bottomD.dismiss();
		}
		else {
			final com.google.android.material.bottomsheet.BottomSheetDialog bottomD = new com.google.android.material.bottomsheet.BottomSheetDialog(MainActivity.this);
			View bottomV;
			bottomV = getLayoutInflater().inflate(R.layout.changelog_dialog,null );
			bottomD.setContentView(bottomV);
			bottomD.setCancelable(true);
			final com.google.android.material.bottomsheet.BottomSheetDialog drawerD = new com.google.android.material.bottomsheet.BottomSheetDialog(MainActivity.this);
			View drawerV;
			drawerV = getLayoutInflater().inflate(R.layout.drawer,null );
			drawerD.setContentView(drawerV);
			drawerD.setCancelable(true);
			final Button buttonchang1 = (Button) bottomV.findViewById(R.id.buttonchang1);
			final Button buttonchang0 = (Button) bottomV.findViewById(R.id.buttonchang0);
			final LinearLayout linear8 = (LinearLayout) bottomV.findViewById(R.id.linear8);
			buttonchang0.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)40, (int)3, 0xFF9C27B0, Color.TRANSPARENT));
			buttonchang1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)40, (int)3, 0xFF9C27B0, Color.TRANSPARENT));
			linear8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)45, 0xFF9C27B0));
			bottomD.show();
			buttonchang0.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					bottomD.dismiss();
					share.edit().putString("hide", "true").commit();
				}
			});
			buttonchang1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					bottomD.dismiss();
				}
			});
		}
		if (sharee.getString("debug_mode", "").equals("true")) {
			linear2.setVisibility(View.VISIBLE);
		}
		else {
			linear2.setVisibility(View.GONE);
		}
		android.content.pm.PackageManager pack = getPackageManager();
		try { pack.getPackageInfo("com.google.android.gm", android.content.pm.PackageManager.GET_ACTIVITIES);
			textview3.setText(textview3.getText().toString().concat("True"));
			PackageInfo packageInfo = getPackageManager().getPackageInfo("com.google.android.gm", 0);
			String versiGmail = packageInfo.versionName;
			textview4.setText("Version of gmail : ".concat(versiGmail));
			return;
		} catch (android.content.pm.PackageManager.NameNotFoundException e) { } textview3.setText(textview3.getText().toString().concat("False"));
		textview5.setText(textview5.getText().toString().concat(Build.PRODUCT));
		textview7.setText(textview7.getText().toString().concat(Build.MANUFACTURER.concat(" ".concat(Build.MODEL))));
		textview6.setText(textview6.getText().toString().concat(Build.FINGERPRINT));
	}
	
	@Override
	public void onStart() {
		super.onStart();
		button1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
		button2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
		button3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
		button4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
		button5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
		button6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
		button7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
		button8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
		button9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
		button10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
		button11.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
		button12.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
		button13.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
		button14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)3, 0xFFAB47BC, Color.TRANSPARENT));
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (sharee.getString("debug_mode", "").equals("true")) {
			linear2.setVisibility(View.VISIBLE);
		}
		else {
			linear2.setVisibility(View.GONE);
		}
	}
	
	public void _anti_null() {
		if (edittext1.getText().toString().isEmpty()) {
			SketchwareUtil.showMessage(getApplicationContext(), "Nomor tidak boleh kosong!");
		}
	}
	
	
	public void _anti_null1() {
		
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