/**
 * generated by Xtext 2.10.0
 */
package robotcontrol;

import robotcontrol.RocStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RocStandaloneSetup extends RocStandaloneSetupGenerated {
  public static void doSetup() {
    RocStandaloneSetup _rocStandaloneSetup = new RocStandaloneSetup();
    _rocStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}