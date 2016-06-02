package admin.ui;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;

public class InputCheckbox implements InputElement {
	private JCheckBox checkBox;
	
	public InputCheckbox(String label, int[] bounds) {
		checkBox = new JCheckBox(label);
		checkBox.setBounds (bounds[0],bounds[1],bounds[2],bounds[3]);
	}
	

	@Override
	public List<Component> getElements() {
		List<Component> rv = new ArrayList<Component>();
		rv.add(checkBox);
		
		return rv;
	}	
}
