/**
 * generated by Xtext 2.10.0
 */
package robotcontrol.roc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robotcontrol.roc.CompleteAction;
import robotcontrol.roc.RocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotcontrol.roc.impl.CompleteActionImpl#getActionName <em>Action Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompleteActionImpl extends MinimalEObjectImpl.Container implements CompleteAction
{
  /**
   * The default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionName()
   * @generated
   * @ordered
   */
  protected static final String ACTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionName()
   * @generated
   * @ordered
   */
  protected String actionName = ACTION_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompleteActionImpl()
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
    return RocPackage.Literals.COMPLETE_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActionName()
  {
    return actionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionName(String newActionName)
  {
    String oldActionName = actionName;
    actionName = newActionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RocPackage.COMPLETE_ACTION__ACTION_NAME, oldActionName, actionName));
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
      case RocPackage.COMPLETE_ACTION__ACTION_NAME:
        return getActionName();
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
      case RocPackage.COMPLETE_ACTION__ACTION_NAME:
        setActionName((String)newValue);
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
      case RocPackage.COMPLETE_ACTION__ACTION_NAME:
        setActionName(ACTION_NAME_EDEFAULT);
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
      case RocPackage.COMPLETE_ACTION__ACTION_NAME:
        return ACTION_NAME_EDEFAULT == null ? actionName != null : !ACTION_NAME_EDEFAULT.equals(actionName);
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
    result.append(" (actionName: ");
    result.append(actionName);
    result.append(')');
    return result.toString();
  }

} //CompleteActionImpl
