package net.whileimautomaton.yunoroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Yunoroid extends Activity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		if (false) {
			// Layout by code.
			TextView tv = new TextView(this);
			tv.setText("Yunoroid @ layout by code");
			setContentView(tv);
		} else {
			// Layout by resource.
			setContentView(R.layout.main);
		}
	}
}
