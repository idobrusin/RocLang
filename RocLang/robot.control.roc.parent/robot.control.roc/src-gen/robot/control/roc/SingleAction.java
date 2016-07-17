/**
 * generated by Xtext 2.10.0
 */
package robot.control.roc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.control.roc.SingleAction#getActionName <em>Action Name</em>}</li>
 * </ul>
 *
 * @see robot.control.roc.RocPackage#getSingleAction()
 * @model
 * @generated
 */
public interface SingleAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Action Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Name</em>' attribute.
   * @see #setActionName(String)
   * @see robot.control.roc.RocPackage#getSingleAction_ActionName()
   * @model
   * @generated
   */
  String getActionName();

  /**
   * Sets the value of the '{@link robot.control.roc.SingleAction#getActionName <em>Action Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Name</em>' attribute.
   * @see #getActionName()
   * @generated
   */
  void setActionName(String value);

} // SingleAction
