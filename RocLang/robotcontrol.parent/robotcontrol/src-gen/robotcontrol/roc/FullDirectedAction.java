/**
 * generated by Xtext 2.10.0
 */
package robotcontrol.roc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Full Directed Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotcontrol.roc.FullDirectedAction#getTurnHead <em>Turn Head</em>}</li>
 *   <li>{@link robotcontrol.roc.FullDirectedAction#getTurnEyes <em>Turn Eyes</em>}</li>
 * </ul>
 *
 * @see robotcontrol.roc.RocPackage#getFullDirectedAction()
 * @model
 * @generated
 */
public interface FullDirectedAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Turn Head</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Turn Head</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Turn Head</em>' attribute.
   * @see #setTurnHead(String)
   * @see robotcontrol.roc.RocPackage#getFullDirectedAction_TurnHead()
   * @model
   * @generated
   */
  String getTurnHead();

  /**
   * Sets the value of the '{@link robotcontrol.roc.FullDirectedAction#getTurnHead <em>Turn Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Turn Head</em>' attribute.
   * @see #getTurnHead()
   * @generated
   */
  void setTurnHead(String value);

  /**
   * Returns the value of the '<em><b>Turn Eyes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Turn Eyes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Turn Eyes</em>' attribute.
   * @see #setTurnEyes(String)
   * @see robotcontrol.roc.RocPackage#getFullDirectedAction_TurnEyes()
   * @model
   * @generated
   */
  String getTurnEyes();

  /**
   * Sets the value of the '{@link robotcontrol.roc.FullDirectedAction#getTurnEyes <em>Turn Eyes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Turn Eyes</em>' attribute.
   * @see #getTurnEyes()
   * @generated
   */
  void setTurnEyes(String value);

} // FullDirectedAction
