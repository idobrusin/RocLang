/**
 * generated by Xtext 2.10.0
 */
package robotcontrol.roc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robotcontrol.roc.DirectedAction;
import robotcontrol.roc.RocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotcontrol.roc.impl.DirectedActionImpl#getActionName <em>Action Name</em>}</li>
 *   <li>{@link robotcontrol.roc.impl.DirectedActionImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectedActionImpl extends MinimalEObjectImpl.Container implements DirectedAction
{
  /**
   * The cached value of the '{@link #getActionName() <em>Action Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionName()
   * @generated
   * @ordered
   */
  protected EObject actionName;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected EObject direction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectedActionImpl()
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
    return RocPackage.Literals.DIRECTED_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getActionName()
  {
    return actionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionName(EObject newActionName, NotificationChain msgs)
  {
    EObject oldActionName = actionName;
    actionName = newActionName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RocPackage.DIRECTED_ACTION__ACTION_NAME, oldActionName, newActionName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionName(EObject newActionName)
  {
    if (newActionName != actionName)
    {
      NotificationChain msgs = null;
      if (actionName != null)
        msgs = ((InternalEObject)actionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RocPackage.DIRECTED_ACTION__ACTION_NAME, null, msgs);
      if (newActionName != null)
        msgs = ((InternalEObject)newActionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RocPackage.DIRECTED_ACTION__ACTION_NAME, null, msgs);
      msgs = basicSetActionName(newActionName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RocPackage.DIRECTED_ACTION__ACTION_NAME, newActionName, newActionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirection(EObject newDirection, NotificationChain msgs)
  {
    EObject oldDirection = direction;
    direction = newDirection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RocPackage.DIRECTED_ACTION__DIRECTION, oldDirection, newDirection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(EObject newDirection)
  {
    if (newDirection != direction)
    {
      NotificationChain msgs = null;
      if (direction != null)
        msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RocPackage.DIRECTED_ACTION__DIRECTION, null, msgs);
      if (newDirection != null)
        msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RocPackage.DIRECTED_ACTION__DIRECTION, null, msgs);
      msgs = basicSetDirection(newDirection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RocPackage.DIRECTED_ACTION__DIRECTION, newDirection, newDirection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RocPackage.DIRECTED_ACTION__ACTION_NAME:
        return basicSetActionName(null, msgs);
      case RocPackage.DIRECTED_ACTION__DIRECTION:
        return basicSetDirection(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RocPackage.DIRECTED_ACTION__ACTION_NAME:
        return getActionName();
      case RocPackage.DIRECTED_ACTION__DIRECTION:
        return getDirection();
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
      case RocPackage.DIRECTED_ACTION__ACTION_NAME:
        setActionName((EObject)newValue);
        return;
      case RocPackage.DIRECTED_ACTION__DIRECTION:
        setDirection((EObject)newValue);
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
      case RocPackage.DIRECTED_ACTION__ACTION_NAME:
        setActionName((EObject)null);
        return;
      case RocPackage.DIRECTED_ACTION__DIRECTION:
        setDirection((EObject)null);
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
      case RocPackage.DIRECTED_ACTION__ACTION_NAME:
        return actionName != null;
      case RocPackage.DIRECTED_ACTION__DIRECTION:
        return direction != null;
    }
    return super.eIsSet(featureID);
  }

} //DirectedActionImpl