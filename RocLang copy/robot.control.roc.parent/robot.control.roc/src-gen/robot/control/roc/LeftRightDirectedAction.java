/**
 * generated by Xtext 2.10.0
 */
package robot.control.roc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left Right Directed Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.control.roc.LeftRightDirectedAction#getTiltHead <em>Tilt Head</em>}</li>
 * </ul>
 *
 * @see robot.control.roc.RocPackage#getLeftRightDirectedAction()
 * @model
 * @generated
 */
public interface LeftRightDirectedAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Tilt Head</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tilt Head</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tilt Head</em>' attribute.
   * @see #setTiltHead(String)
   * @see robot.control.roc.RocPackage#getLeftRightDirectedAction_TiltHead()
   * @model
   * @generated
   */
  String getTiltHead();

  /**
   * Sets the value of the '{@link robot.control.roc.LeftRightDirectedAction#getTiltHead <em>Tilt Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tilt Head</em>' attribute.
   * @see #getTiltHead()
   * @generated
   */
  void setTiltHead(String value);

} // LeftRightDirectedAction
