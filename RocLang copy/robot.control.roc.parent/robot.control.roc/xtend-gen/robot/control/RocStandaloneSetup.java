/**
 * generated by Xtext 2.10.0
 */
package robot.control;

import robot.control.RocStandaloneSetupGenerated;

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
