/*
 * generated by Xtext 2.10.0
 */
package robot.control.idea.highlighting;

import org.eclipse.xtext.idea.highlighting.AbstractColorSettingsPage;
import robot.control.idea.lang.RocLanguage;

public class RocBaseColorSettingsPage extends AbstractColorSettingsPage {
	
	public RocBaseColorSettingsPage() {
		RocLanguage.INSTANCE.injectMembers(this);
	}

	@Override
	public String getDisplayName() {
		return RocLanguage.INSTANCE.getDisplayName();
	}
}
