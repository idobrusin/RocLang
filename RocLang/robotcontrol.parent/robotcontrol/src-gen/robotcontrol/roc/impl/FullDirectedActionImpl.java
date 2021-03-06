/**
 * generated by Xtext 2.10.0
 */
package robotcontrol.roc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robotcontrol.roc.FullDirectedAction;
import robotcontrol.roc.RocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Full Directed Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotcontrol.roc.impl.FullDirectedActionImpl#getTurnHead <em>Turn Head</em>}</li>
 *   <li>{@link robotcontrol.roc.impl.FullDirectedActionImpl#getTurnEyes <em>Turn Eyes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FullDirectedActionImpl extends MinimalEObjectImpl.Container implements FullDirectedAction
{
  /**
   * The default value of the '{@link #getTurnHead() <em>Turn Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTurnHead()
   * @generated
   * @ordered
   */
  protected static final String TURN_HEAD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTurnHead() <em>Turn Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTurnHead()
   * @generated
   * @ordered
   */
  protected String turnHead = TURN_HEAD_EDEFAULT;

  /**
   * The default value of the '{@link #getTurnEyes() <em>Turn Eyes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTurnEyes()
   * @generated
   * @ordered
   */
  protected static final String TURN_EYES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTurnEyes() <em>Turn Eyes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTurnEyes()
   * @generated
   * @ordered
   */
  protected String turnEyes = TURN_EYES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FullDirectedActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RocPackage.Literals.FULL_DIRECTED_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTurnHead()
  {
    return turnHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTurnHead(String newTurnHead)
  {
    String oldTurnHead = turnHead;
    turnHead = newTurnHead;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RocPackage.FULL_DIRECTED_ACTION__TURN_HEAD, oldTurnHead, turnHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTurnEyes()
  {
    return turnEyes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTurnEyes(String newTurnEyes)
  {
    String oldTurnEyes = turnEyes;
    turnEyes = newTurnEyes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RocPackage.FULL_DIRECTED_ACTION__TURN_EYES, oldTurnEyes, turnEyes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RocPackage.FULL_DIRECTED_ACTION__TURN_HEAD:
        return getTurnHead();
      case RocPackage.FULL_DIRECTED_ACTION__TURN_EYES:
        return getTurnEyes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RocPackage.FULL_DIRECTED_ACTION__TURN_HEAD:
        setTurnHead((String)newValue);
        return;
      case RocPackage.FULL_DIRECTED_ACTION__TURN_EYES:
        setTurnEyes((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RocPackage.FULL_DIRECTED_ACTION__TURN_HEAD:
        setTurnHead(TURN_HEAD_EDEFAULT);
        return;
      case RocPackage.FULL_DIRECTED_ACTION__TURN_EYES:
        setTurnEyes(TURN_EYES_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RocPackage.FULL_DIRECTED_ACTION__TURN_HEAD:
        return TURN_HEAD_EDEFAULT == null ? turnHead != null : !TURN_HEAD_EDEFAULT.equals(turnHead);
      case RocPackage.FULL_DIRECTED_ACTION__TURN_EYES:
        return TURN_EYES_EDEFAULT == null ? turnEyes != null : !TURN_EYES_EDEFAULT.equals(turnEyes);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (turnHead: ");
    result.append(turnHead);
    result.append(", turnEyes: ");
    result.append(turnEyes);
    result.append(')');
    return result.toString();
  }

} //FullDirectedActionImpl
